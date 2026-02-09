package com.school.service;
import java.sql.*;
import java.util.Scanner;
import com.school.database.DatabaseManager;

public class GradeService {
    public void addGrade(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter Score: ");
        int score = sc.nextInt();

        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "INSERT INTO grades (student_id, subject, score) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, studentId);
            ps.setString(2, subject);
            ps.setInt(3, score);
            ps.executeUpdate();
            System.out.println("⭐ Grade recorded!");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void viewGrades(Scanner sc) {
        System.out.print("Enter Student ID to view report card: ");
        int studentId = sc.nextInt();
        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT * FROM grades WHERE student_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            System.out.println("\n📜 REPORT CARD FOR ID: " + studentId);
            while (rs.next()) {
                System.out.println("- " + rs.getString("subject") + ": " + rs.getInt("score"));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void calculateAverage(Scanner sc) {
        System.out.print("Enter Student ID for Average: ");
        int studentId = sc.nextInt();
        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT AVG(score) as average FROM grades WHERE student_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double avg = rs.getDouble("average");
                System.out.println("\n📊 Average Score for ID " + studentId + ": " + String.format("%.2f", avg));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}

package com.school.service;
import java.sql.*;
import java.util.Scanner;
import com.school.database.DatabaseManager;
import com.school.util.Color;

public class GradeService {
    public void viewGrades(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        try (Connection conn = DatabaseManager.getConnection()) {
            // Updated query to match your database column names
            String sql = "SELECT g.score, t.name AS teacher, t.subject " +
                         "FROM grades g " +
                         "JOIN teachers t ON g.teacher_id = t.id " +
                         "WHERE g.student_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Color.info("\n--- ACADEMIC REPORT CARD ---");
            System.out.println("+------------+----------------------+");
            System.out.printf("| %-10s | %-20s |%n", "Score", "Teacher (Subject)");
            System.out.println("+------------+----------------------+");

            boolean found = false;
            while (rs.next()) {
                String teacherInfo = rs.getString("teacher") + " (" + rs.getString("subject") + ")";
                System.out.printf("| %-10s | %-20s |%n", rs.getString("score"), teacherInfo);
                found = true;
            }
            System.out.println("+------------+----------------------+");
            if (!found) Color.error("No grades found for ID: " + id);
        } catch (Exception e) { 
            Color.error("Database Error: " + e.getMessage()); 
        }
    }

    public void addGrade(Scanner sc) {
        System.out.print("Student ID: "); int sid = sc.nextInt();
        System.out.print("Score: "); int s = sc.nextInt();
        System.out.print("Teacher ID: "); int tid = sc.nextInt();
        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "INSERT INTO grades (student_id, score, teacher_id) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sid); ps.setInt(2, s); ps.setInt(3, tid);
            ps.executeUpdate();
            Color.success("Grade added!");
        } catch (Exception e) { Color.error("Add failed: " + e.getMessage()); }
    }

    public void calculateAverage(Scanner sc) {
        System.out.print("Enter Student ID: "); int id = sc.nextInt();
        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT AVG(score) as avg FROM grades WHERE student_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) Color.info("Average Score: " + rs.getDouble("avg"));
        } catch (Exception e) { Color.error("Average failed: " + e.getMessage()); }
    }
}

package com.school;

import java.sql.*;

public class DatabaseManager {
    private String url = "jdbc:mariadb://localhost:3306/school_db";
    private String user = "root";
    private String password = "";

    public void saveStudent(String name, String id, String phone) {
        String sql = "INSERT INTO students (name, student_id, phone) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, id);
            pstmt.setString(3, phone);
            pstmt.executeUpdate();
            System.out.println("📂 Data saved successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
    }

    public void searchStudent(String id) {
        String sql = "SELECT * FROM students WHERE student_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("\n🔍 STUDENT FOUND:");
                System.out.println("Name:  " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
            } else {
                System.out.println("❌ No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("❌ Search Error: " + e.getMessage());
        }
    }

    public void deleteStudent(String id) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("🗑️ Student " + id + " deleted!");
            } else {
                System.out.println("⚠️ ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Delete Error: " + e.getMessage());
        }
    }

    public void updateStudent(String id, String newName, String newPhone) {
        String sql = "UPDATE students SET name = ?, phone = ? WHERE student_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newPhone);
            pstmt.setString(3, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("✅ Student updated successfully!");
            } else {
                System.out.println("⚠️ ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Update Error: " + e.getMessage());
        }
    }

    public void viewAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- ALL STUDENTS ---");
            System.out.printf("%-15s | %-10s | %-15s%n", "NAME", "ID", "PHONE");
            System.out.println("----------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-15s | %-10s | %-15s%n", 
                    rs.getString("name"), rs.getString("student_id"), rs.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println("❌ View Error: " + e.getMessage());
        }
    }
}


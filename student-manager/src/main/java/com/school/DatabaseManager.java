package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
    private String url = "jdbc:mariadb://localhost:3306/school";
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
            System.out.println("📂 Data saved to MariaDB successfully!");
        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
    }

    public void searchStudent(String id) {
        String sql = "SELECT name, phone FROM students WHERE student_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("\n🔍 STUDENT FOUND:");
                System.out.println("-------------------");
                System.out.println("Name:  " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("-------------------");
            } else {
                System.out.println("❌ No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("❌ Search Error: " + e.getMessage());
        }
    }
}


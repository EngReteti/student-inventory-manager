package com.school.service;
import java.sql.*;
import java.util.Scanner;
import com.school.database.DatabaseManager;

public class AuthService {
    public boolean login(Scanner sc) {
        System.out.println("\n--- TEACHER LOGIN ---");
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("✅ Login Successful! Welcome, " + user);
                return true;
            } else {
                System.out.println("❌ Invalid credentials.");
                return false;
            }
        } catch (Exception e) { e.printStackTrace(); return false; }
    }
}

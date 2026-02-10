package com.school.service;
import java.sql.*;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import com.school.database.DatabaseManager;
import com.school.util.Color;

public class AuthService {
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Use StandardCharsets to ensure consistent byte conversion
            byte[] encodedhash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString().toLowerCase();
        } catch (Exception e) { return null; }
    }

    public boolean login(Scanner sc) {
        Color.info("\n--- TEACHER LOGIN ---");
        
        System.out.print("Username: ");
        String user = sc.next().trim(); // Use .next() to avoid newline issues
        
        System.out.print("Password: ");
        String pass = sc.next().trim(); // Use .next() for the password too
        sc.nextLine(); // Clear the buffer for future inputs

        String hashedInput = hashPassword(pass);

        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, hashedInput);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Color.success("✔ Login Successful! Welcome, " + user);
                return true;
            }
        } catch (Exception e) { Color.error("Login Error: " + e.getMessage()); }
        Color.error("❌ Invalid credentials.");
        return false;
    }
}

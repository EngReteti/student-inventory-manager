package com.school.database;
import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mariadb://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        try { 
            Class.forName("org.mariadb.jdbc.Driver"); 
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
        }
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        setupTables(conn);
        return conn;
    }

    private static void setupTables(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                         "id INT AUTO_INCREMENT PRIMARY KEY, " +
                         "reg_no VARCHAR(50) UNIQUE, " +
                         "first_name VARCHAR(50), second_name VARCHAR(50), " +
                         "unit VARCHAR(100), grade VARCHAR(5), phone VARCHAR(20), " +
                         "email VARCHAR(100), parent_phone VARCHAR(20), " +
                         "department VARCHAR(100), lecturer VARCHAR(100))";
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Table Setup Error: " + e.getMessage());
        }
    }
}


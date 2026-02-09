package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Level 2: Database Configuration
 * Responsibility: Managing the connection and ACID transactions.
 */
public class DatabaseConfig {
    // Database credentials - Update these to match your local MySQL setup
    private static final String URL = "jdbc:mysql://localhost:3306/student_inventory_db";
    private static final String USER = "root";
    private static final String PASSWORD = "your_secure_password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Transaction controls to ensure data integrity
    public static void startTransaction(Connection conn) throws SQLException {
        if (conn != null) {
            conn.setAutoCommit(false);
        }
    }

    public static void commitTransaction(Connection conn) throws SQLException {
        if (conn != null) {
            conn.commit();
            conn.setAutoCommit(true);
        }
    }

    public static void rollbackTransaction(Connection conn) throws SQLException {
        if (conn != null) {
            conn.rollback();
            conn.setAutoCommit(true);
        }
    }
}


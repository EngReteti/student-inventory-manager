package com.school.database;
import java.sql.*;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseManager {
    private static String url;
    private static String user;
    private static String pass;

    static {
        try (InputStream input = DatabaseManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            url = prop.getProperty("db.url");
            user = prop.getProperty("db.user");
            pass = prop.getProperty("db.password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
}

package com.school.service;
import java.util.Scanner;
import java.sql.*;
import com.school.database.DatabaseManager;

public class StudentService {
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- UNIVERSITY MASTER ADMINISTRATION ---");
            System.out.println("1. Register Student | 2. Search by Reg No");
            System.out.println("3. Update Grade     | 4. Delete Record");
            System.out.println("5. View All Data    | 0. Logout");
            System.out.print("Action: ");
            String choice = sc.nextLine();
            if (choice.equals("0")) break;

            try (Connection conn = DatabaseManager.getConnection()) {
                switch(choice) {
                    case "1": add(conn, sc); break;
                    case "2": search(conn, sc); break;
                    case "3": update(conn, sc); break;
                    case "4": delete(conn, sc); break;
                    case "5": viewAll(conn); break;
                }
            } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        }
    }

    private void add(Connection conn, Scanner sc) throws SQLException {
        System.out.println("\n[SECURE REGISTRATION MODE]");
        System.out.print("Reg No: "); String reg = sc.nextLine();
        System.out.print("First Name: "); String fn = sc.nextLine();
        System.out.print("Second Name: "); String sn = sc.nextLine();
        System.out.print("Dept: "); String dept = sc.nextLine();
        System.out.print("Unit: "); String u = sc.nextLine();
        System.out.print("Grade: "); String g = sc.nextLine();
        System.out.print("Phone: "); String p = sc.nextLine();
        System.out.print("Email: "); String e = sc.nextLine();
        System.out.print("Parent No: "); String pp = sc.nextLine();
        System.out.print("Lecturer: "); String lec = sc.nextLine();

        String sql = "INSERT INTO students (reg_no, first_name, second_name, department, unit, grade, phone, email, parent_phone, lecturer) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, reg); ps.setString(2, fn); ps.setString(3, sn);
            ps.setString(4, dept); ps.setString(5, u); ps.setString(6, g);
            ps.setString(7, p); ps.setString(8, e); ps.setString(9, pp);
            ps.setString(10, lec);
            ps.executeUpdate();
            System.out.println("SUCCESS: Record Created for " + fn);
        }
    }

    private void viewAll(Connection conn) throws SQLException {
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM students");
        System.out.println("\nOFFICIAL UNIVERSITY ENROLLMENT REPORT - ALL DATA");
        System.out.println("=".repeat(30));
        while (rs.next()) {
            System.out.println("REG NO : " + rs.getString("reg_no"));
            System.out.println("NAME   : " + rs.getString("first_name") + " " + rs.getString("second_name"));
            System.out.println("DEPT   : " + rs.getString("department") + " | UNIT: " + rs.getString("unit") + " | GRADE: " + rs.getString("grade"));
            System.out.println("OFFICIALS: Lecturer: " + rs.getString("lecturer") + " | Parent No: " + rs.getString("parent_phone"));
            System.out.println("CONTACT  : Email: " + rs.getString("email") + " | Phone: " + rs.getString("phone"));
            System.out.println("-".repeat(60));
        }
    }

    private void search(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Reg No: "); String reg = sc.nextLine();
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE reg_no = ?")) {
            ps.setString(1, reg);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) System.out.println("Found: " + rs.getString("first_name"));
            else System.out.println("No record found.");
        }
    }

    private void update(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Reg No: "); String reg = sc.nextLine();
        System.out.print("New Grade: "); String g = sc.nextLine();
        try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET grade = ? WHERE reg_no = ?")) {
            ps.setString(1, g); ps.setString(2, reg);
            ps.executeUpdate();
            System.out.println("Updated.");
        }
    }

    private void delete(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Reg No: "); String reg = sc.nextLine();
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE reg_no = ?")) {
            ps.setString(1, reg);
            ps.executeUpdate();
            System.out.println("Deleted.");
        }
    }
}


package com.school.service;
import java.sql.*;
import java.util.Scanner;
import com.school.util.Color;
import com.school.database.DatabaseManager;

public class StudentService {
    private GradeService gradeService = new GradeService();

    private int getSafeInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            Color.error("Please enter a valid number.");
            sc.next();
        }
        int val = sc.nextInt();
        sc.nextLine(); 
        return val;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\u001B[36m--- SCHOOL SYSTEM MENU ---\u001B[0m");
            System.out.println("1. View Inventory | 2. Add Student | 3. List All");
            System.out.println("4. Delete Student | 5. Add Grade | 6. Report Card");
            System.out.println("7. Calculate Average | 8. Search Name | \u001B[33m0. Exit\u001B[0m");
            System.out.print("Choose: ");
            int choice = getSafeInt(sc);
            if (choice == 0) break;

            try (Connection conn = DatabaseManager.getConnection()) {
                if (choice == 1) {
                    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM inventory");
                    while(rs.next()) System.out.println("- " + rs.getString("item_name") + ": $" + rs.getDouble("price"));
                } else if (choice == 2) {
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name) VALUES (?)");
                    ps.setString(1, name);
                    ps.executeUpdate();
                    Color.success("Student added successfully!");
                } else if (choice == 3) {
                    listStudents(conn);
                } else if (choice == 4) {
                    System.out.print("Enter ID to delete: ");
                    int id = getSafeInt(sc);
                    PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id = ?");
                    ps.setInt(1, id);
                    ps.executeUpdate();
                } else if (choice == 5) {
                    gradeService.addGrade(sc);
                } else if (choice == 6) {
                    gradeService.viewGrades(sc);
                } else if (choice == 7) {
                    gradeService.calculateAverage(sc);
                } else if (choice == 8) {
                    searchStudent(sc);
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    private void listStudents(Connection conn) throws SQLException {
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM students");
        System.out.println("\n+-----+----------------------+");
        System.out.printf("| %-3s | %-20s |%n", "ID", "Student Name");
        System.out.println("+-----+----------------------+");
        while (rs.next()) {
            System.out.printf("| %-3d | %-20s |%n", rs.getInt("id"), rs.getString("name"));
        }
        System.out.println("+-----+----------------------+");
    }

    private void searchStudent(Scanner sc) {
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        try (Connection conn = DatabaseManager.getConnection()) {
            String sql = "SELECT * FROM students WHERE name LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + searchName + "%");
            ResultSet rs = ps.executeQuery();
            Color.info("\n🔍 SEARCH RESULTS:");
            System.out.println("+-----+----------------------+");
            while (rs.next()) {
                System.out.printf("| %-3d | %-20s |%n", rs.getInt("id"), rs.getString("name"));
            }
            System.out.println("+-----+----------------------+");
        } catch (Exception e) { e.printStackTrace(); }
    }
}

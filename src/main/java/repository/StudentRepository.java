package repository;

import database.DatabaseConfig;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Level 2: Repository Layer (Persistence)
 * Responsibility: Managing Student data using SQL and JDBC.
 */
public class StudentRepository {

    // CREATE: Save a student to the database
    public void save(Student student) {
        String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getEmail());
            pstmt.setString(3, student.getCourse());
            
            pstmt.executeUpdate();
            System.out.println("✅ Student '" + student.getName() + "' saved to database!");
            
        } catch (SQLException e) {
            System.err.println("❌ Error saving student: " + e.getMessage());
        }
    }

    // READ: Retrieve all students
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Student student = new Student(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error fetching students: " + e.getMessage());
        }
        return students;
    }

    // DELETE: Remove a student by email
    public void deleteByEmail(String email) {
        String sql = "DELETE FROM students WHERE email = ?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email);
            int rowsDeleted = pstmt.executeUpdate();
            
            if (rowsDeleted > 0) {
                System.out.println("✅ Student with email " + email + " was deleted.");
            } else {
                System.out.println("⚠️ No student found with that email.");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error deleting student: " + e.getMessage());
        }
    }
}

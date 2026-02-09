package repository;

import database.DatabaseConfig;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Level 2: Repository Layer Evolution
 * Responsibility: Shifting from ArrayList to SQL for permanent storage.
 */
public class StudentRepository {

    // CREATE: Save a student to the SQL database
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

    // We will implement findAll(), update(), and delete() next
}

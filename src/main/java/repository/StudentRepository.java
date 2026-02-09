package repository;

import model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // Level 2: Transactional Save
    public void save(Connection conn, Student student) throws SQLException {
        String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getEmail());
            pstmt.setString(3, student.getCourse());
            pstmt.executeUpdate();
        }
    }

    // Level 3: Search Feature
    public List<Student> findByCourse(Connection conn, String course) throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE course = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, course);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("course")));
                }
            }
        }
        return list;
    }
}

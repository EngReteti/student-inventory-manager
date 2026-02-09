package service;

import model.Student;
import repository.StudentRepository;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Level 3: Student Service
 * Responsibility: Business logic, validation, and advanced search for student records.
 */
public class StudentService {
    private StudentRepository repository = new StudentRepository();

    // Level 2: Transactional Registration with Validation
    public void registerStudent(Connection conn, Student student) throws SQLException {
        // Validation Rule: Ensure student name is not empty
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new SQLException("Validation Error: Student name is required.");
        }
        
        // Validation Rule: Ensure email is present (Required for Level 3)
        if (student.getEmail() == null || student.getEmail().trim().isEmpty()) {
            throw new SQLException("Validation Error: Student email is required.");
        }

        repository.save(conn, student);
    }

    // Level 2: Get all records
    public List<Student> getStudentDirectory(Connection conn) throws SQLException {
        return repository.findAll(conn);
    }

    // Level 3 Addition: Search Intelligence
    public List<Student> getStudentsByCourse(Connection conn, String course) throws SQLException {
        if (course == null || course.trim().isEmpty()) {
            throw new SQLException("Validation Error: Course name is required for searching.");
        }
        return repository.findByCourse(conn, course);
    }
}


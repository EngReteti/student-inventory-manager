package service;

import model.Student;
import repository.StudentRepository;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private StudentRepository repository = new StudentRepository();

    // Now accepts 'conn' to support Transactions
    public void registerStudent(Connection conn, Student student) throws SQLException {
        // Validation Rule: Name cannot be empty
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new SQLException("Validation Error: Student name is required.");
        }
        repository.save(conn, student);
    }

    public List<Student> getStudentDirectory(Connection conn) throws SQLException {
        return repository.findAll(conn);
    }
}

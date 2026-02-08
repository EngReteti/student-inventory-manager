package repository;

import model.Student;
import java.util.List;

/**
 * Objective: Define the CRUD contract for Database Integration
 */
public interface StudentRepository {
    void addStudent(Student student);      // Create
    Student getStudentById(int id);        // Read
    List<Student> getAllStudents();       // Read All
    void updateStudent(Student student);   // Update
    void deleteStudent(int id);            // Delete
}

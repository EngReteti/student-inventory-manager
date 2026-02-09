package service;

import model.Student;
import repository.StudentRepository;
import java.util.List;

/**
 * Level 2: Student Service
 * Responsibility: Business logic for student records only.
 */
public class StudentService {
    private StudentRepository repository = new StudentRepository();

    public void registerStudent(Student student) {
        // Validation: Ensure student name is not empty
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            System.err.println("❌ Error: Student name cannot be empty.");
            return;
        }
        repository.save(student);
    }

    public List<Student> getStudentDirectory() {
        return repository.findAll();
    }
}

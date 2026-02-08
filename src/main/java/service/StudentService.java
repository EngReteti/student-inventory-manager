package service;

import model.Student;
import repository.StudentRepository;

/**
 * Objective: Handle Business Logic, Validation, and Error Prevention
 */
public class StudentService {
    private StudentRepository repository;

    // Dependency Injection: Connecting the service to the repository
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void saveStudent(Student student) {
        // VALIDATION: No empty names allowed (Roadmap Requirement)
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            System.out.println("Validation Error: Student name cannot be empty!");
            return;
        }

        // VALIDATION: ID must be positive
        if (student.getId() <= 0) {
            System.out.println("Validation Error: Invalid Student ID!");
            return;
        }

        repository.addStudent(student);
        System.out.println("Success: Student validated and saved.");
    }
}

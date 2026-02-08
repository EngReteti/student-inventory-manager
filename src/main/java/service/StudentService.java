package service;

import model.Student;
import model.Inventory;
import repository.StudentRepository;

public class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Existing Student Logic
    public void saveStudent(Student student) {
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            return;
        }
        repository.addStudent(student);
    }

    // NEW: Inventory Logic with Validation
    public void saveItem(Inventory item) {
        if (item.getQuantity() < 0) { // Validation Requirement
            System.out.println("Validation Error: Quantity cannot be negative!");
            return;
        }
        repository.addItem(item);
        System.out.println("Success: Item '" + item.getItemName() + "' added to inventory.");
    }
}

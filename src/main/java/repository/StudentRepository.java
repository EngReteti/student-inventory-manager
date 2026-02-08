package repository;

import model.Student;
import model.Inventory; // Import the Inventory model you just created
import java.util.List;

/**
 * Objective: Define the CRUD contract for both Students and Inventory
 */
public interface StudentRepository {
    // --- Student Operations ---
    void addStudent(Student student);
    List<Student> getAllStudents();

    // --- Inventory Operations (New Additions) ---
    void addItem(Inventory item);             // Create item
    List<Inventory> getAllItems();           // Read all items
    void updateItemQuantity(int id, int qty); // Update stock
    void deleteItem(int id);                  // Remove item
}

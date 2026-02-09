package service;

import model.Inventory;
import repository.InventoryRepository;
import java.util.List;

/**
 * Level 2: Inventory Service
 * Responsibility: Business logic and validation for warehouse items.
 */
public class InventoryService {
    // Connect to the Repository Layer
    private InventoryRepository repository = new InventoryRepository();

    public void addItem(Inventory item) {
        // Validation Rule: Prevent negative quantities
        if (item.getQuantity() < 0) {
            System.err.println("❌ Validation Error: Quantity cannot be negative!");
            return;
        }
        
        // Validation Rule: Ensure item name is not empty
        if (item.getItemName() == null || item.getItemName().trim().isEmpty()) {
            System.err.println("❌ Validation Error: Item name is required!");
            return;
        }

        // If validation passes, save to database
        repository.save(item);
    }

    public List<Inventory> getAllItems() {
        return repository.findAll();
    }
}

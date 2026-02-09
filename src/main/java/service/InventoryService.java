package service;

import model.Inventory;
import repository.InventoryRepository;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class InventoryService {
    private InventoryRepository repository = new InventoryRepository();

    // Now accepts 'conn' to support Transactions
    public void addItem(Connection conn, Inventory item) throws SQLException {
        // Validation Rule: Prevent negative quantities
        if (item.getQuantity() < 0) {
            throw new SQLException("Validation Error: Quantity cannot be negative.");
        }
        
        // Validation Rule: Ensure item name exists
        if (item.getItemName() == null || item.getItemName().trim().isEmpty()) {
            throw new SQLException("Validation Error: Item name is required.");
        }

        repository.save(conn, item);
    }

    public List<Inventory> getAllItems(Connection conn) throws SQLException {
        return repository.findAll(conn);
    }
}

package service;

import model.Inventory;
import repository.InventoryRepository;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class InventoryService {
    private InventoryRepository repository = new InventoryRepository();

    // Level 2: Validated Entry
    public void addItem(Connection conn, Inventory item) throws SQLException {
        if (item.getQuantity() < 0) throw new SQLException("Quantity cannot be negative.");
        repository.save(conn, item);
    }

    // Level 3: Reporting & Analytics
    public void generateFullReport(Connection conn) throws SQLException {
        List<Inventory> items = repository.findAll(conn);
        double totalValue = 0;
        System.out.println("\n===== 📊 WAREHOUSE REPORT =====");
        for (Inventory i : items) {
            double itemValue = i.getQuantity() * i.getPrice();
            totalValue += itemValue;
            System.out.println("Item: " + i.getItemName() + " | Stock: " + i.getQuantity() + " | Value: $" + itemValue);
            
            // Level 3 Logic: Conditional Alert
            if (i.getQuantity() < 5) System.out.println("   ⚠️ ALERT: Restock needed!");
        }
        System.out.println("-------------------------------");
        System.out.println("TOTAL INVENTORY VALUE: $" + totalValue);
    }
}

package repository;

import database.DatabaseConfig;
import model.Inventory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Level 2: Repository Layer (Inventory Persistence)
 * Responsibility: Managing warehouse data using SQL and JDBC.
 */
public class InventoryRepository {

    // CREATE: Save a new item to the inventory table
    public void save(Inventory item) {
        String sql = "INSERT INTO inventory (item_name, quantity) VALUES (?, ?)";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, item.getItemName());
            pstmt.setInt(2, item.getQuantity());
            
            pstmt.executeUpdate();
            System.out.println("✅ Inventory item '" + item.getItemName() + "' saved to database!");
            
        } catch (SQLException e) {
            System.err.println("❌ Error saving inventory: " + e.getMessage());
        }
    }

    // READ: Retrieve all inventory items
    public List<Inventory> findAll() {
        List<Inventory> items = new ArrayList<>();
        String sql = "SELECT * FROM inventory";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Adjust constructor parameters to match your Inventory model
                Inventory item = new Inventory(
                    rs.getInt("id"),
                    rs.getString("item_name"),
                    rs.getInt("quantity")
                );
                items.add(item);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error fetching inventory: " + e.getMessage());
        }
        return items;
    }
}

package repository;

import model.Inventory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryRepository {
    // Level 2: Transactional Save
    public void save(Connection conn, Inventory item) throws SQLException {
        String sql = "INSERT INTO inventory (item_name, quantity, price) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, item.getItemName());
            pstmt.setInt(2, item.getQuantity());
            pstmt.setDouble(3, item.getPrice());
            pstmt.executeUpdate();
        }
    }

    // Level 3: Data Retrieval for Reports
    public List<Inventory> findAll(Connection conn) throws SQLException {
        List<Inventory> items = new ArrayList<>();
        String sql = "SELECT * FROM inventory";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                items.add(new Inventory(rs.getInt("id"), rs.getString("item_name"), rs.getInt("quantity"), rs.getDouble("price")));
            }
        }
        return items;
    }
}

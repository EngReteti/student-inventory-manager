package model;

/**
 * Objective: Manage inventory items using OOP Principles
 * Updated: Included price field to match SQL schema.
 */
public class Inventory {
    private int itemId;
    private String itemName;
    private int quantity;
    private double price; // New field

    // Updated Constructor
    public Inventory(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; } // Added
    public void setPrice(double price) { this.price = price; } // Added
}

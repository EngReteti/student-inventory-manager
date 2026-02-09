package model;

public class Inventory {
    private int itemId;
    private String itemName;
    private int quantity;
    private double price; // Level 3 Addition

    public Inventory(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class Inventory {
    private String itemName;
    private int stockQuantity;

    
    public Inventory(String itemName, int stockQuantity) {
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
    }

    
    public String getItemName() {
        return itemName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

   
    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " items added to inventory.");
        } else {
            System.out.println("Invalid stock quantity.");
        }
    }

    public void removeStock(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println(quantity + " items removed from inventory.");
        } else {
            System.out.println("Not enough stock available.");
        }
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Inventory item = new Inventory("Laptop", 20);

        System.out.println("Item: " + item.getItemName());
        System.out.println("Stock Quantity: " + item.getStockQuantity());

        item.addStock(10);
        item.removeStock(5);
        System.out.println("Updated Stock: " + item.getStockQuantity());
    }
}

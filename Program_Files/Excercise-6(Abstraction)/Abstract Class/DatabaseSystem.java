// Abstract database connection
abstract class Database {
    protected boolean isConnected = false;
    
    // Template method
    public final void executeQuery(String query) {
        connect();
        if (isConnected) {
            String result = processQuery(query);
            System.out.println("Result: " + result);
            disconnect();
        }
    }
    
    // Abstract methods
    protected abstract void connect();
    protected abstract String processQuery(String query);
    
    // Common method
    protected void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from database");
    }
}

// Mock database implementations
class MockUsersDatabase extends Database {
    private String[] users = {"Alice", "Bob", "Charlie"};
    
    @Override
    protected void connect() {
        System.out.println("Connecting to Users database...");
        isConnected = true;
    }
    
    @Override
    protected String processQuery(String query) {
        if (query.equals("GET_ALL_USERS")) {
            return String.join(", ", users);
        }
        return "Invalid query";
    }
}

class MockProductsDatabase extends Database {
    private String[] products = {"Laptop", "Phone", "Tablet"};
    
    @Override
    protected void connect() {
        System.out.println("Connecting to Products database...");
        isConnected = true;
    }
    
    @Override
    protected String processQuery(String query) {
        if (query.equals("GET_ALL_PRODUCTS")) {
            return String.join(" | ", products);
        }
        return "Invalid query";
    }
}

public class DatabaseSystem {
    public static void main(String[] args) {
        Database usersDB = new MockUsersDatabase();
        Database productsDB = new MockProductsDatabase();
        
        System.out.println("=== Users Database ===");
        usersDB.executeQuery("GET_ALL_USERS");
        
        System.out.println("\n=== Products Database ===");
        productsDB.executeQuery("GET_ALL_PRODUCTS");
        
        System.out.println("\n=== Invalid Query Test ===");
        productsDB.executeQuery("BAD_QUERY");
    }
}
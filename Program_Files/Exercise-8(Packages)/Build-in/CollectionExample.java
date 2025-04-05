import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);
        
        // Map example
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Oranges", 75);
        System.out.println("Inventory: " + inventory);
        
        // Sort list
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);
    }
}
interface ShoppingCart {
    void addItem(String item);
}

class GroceryCart implements ShoppingCart {
    public void addItem(String item) {
        System.out.println("Grocery item added: " + item);
    }
}

class ElectronicsCart implements ShoppingCart {
    public void addItem(String item) {
        System.out.println("Electronic item added: " + item);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart grocery = new GroceryCart();
        ShoppingCart electronics = new ElectronicsCart();

        grocery.addItem("Milk");
        electronics.addItem("Laptop");
    }
}

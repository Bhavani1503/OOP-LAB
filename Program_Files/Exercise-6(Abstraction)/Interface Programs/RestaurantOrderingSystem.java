interface Order {
    void placeOrder(String item);
}

class OnlineOrder implements Order {
    public void placeOrder(String item) {
        System.out.println("Online order placed for: " + item);
    }
}

class OfflineOrder implements Order {
    public void placeOrder(String item) {
        System.out.println("Offline order placed for: " + item);
    }
}

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        Order online = new OnlineOrder();
        Order offline = new OfflineOrder();

        online.placeOrder("Pizza");
        offline.placeOrder("Burger");
    }
}

class ProductSearch {
    void search(String name) {
        System.out.println("Searching for product: " + name);
    }

    void search(String name, String category) {
        System.out.println("Searching for " + name + " in category: " + category);
    }

    void search(int productId) {
        System.out.println("Searching for product with ID: " + productId);
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        ProductSearch search = new ProductSearch();

        search.search("Laptop");
        search.search("Laptop", "Electronics");
        search.search(101);
    }
}

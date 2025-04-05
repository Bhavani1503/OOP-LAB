abstract class PaymentProcessor {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}

class PayPalPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor card = new CreditCardPayment();
        PaymentProcessor paypal = new PayPalPayment();
        
        card.processPayment(100.50);  // Output: Processing credit card payment: $100.5
        paypal.processPayment(50.25); // Output: Processing PayPal payment: $50.25
    }
}
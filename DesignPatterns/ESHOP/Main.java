package ESHOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EcommerceMediator mediator = new EcommercePlatform();

        User user1 = new User("Mehzabin Haque", "john.smith@example.com", "password", "123 Main St");
        User user2 = new User("Alice", "alice@example.com", "password", "456 Elm St");
        mediator.addUser(user1);
        mediator.addUser(user2);

        Product product = new Product("iPhone 12", "Apple iPhone 12 (64GB)", 799.00, "https://example.com/iphone12.jpg", 10);
        mediator.addProduct(product);

        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("1234 5678 9012 3456", "12/24", "123");
        PaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy("john.smith@example.com", "password");
        PaymentStrategy cryptocurrencyPaymentStrategy = new CryptocurrencyPaymentStrategy("0x1234567890abcdef");

        OnlinePurchase onlinePurchase = new OnlinePurchase();

        Scanner scanner = new Scanner(System.in);

        List<User> loggedInUsers = new ArrayList<>();

        while (true) {
            if (loggedInUsers.isEmpty()) {
                System.out.println("No user is currently logged in. Please enter your email and password to log in:");
                String email = scanner.nextLine();
                String password = scanner.nextLine();
                for (User user : mediator.getUsers()) {
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        loggedInUsers.add(user);
                        break;
                    }
                }
                if (loggedInUsers.isEmpty()) {
                    System.out.println("Invalid email or password. Please try again.");
                }
            } else {
                System.out.println("Total " + loggedInUsers.size() + " number of users are currently logged in.");
                System.out.println("1. Purchase a product");
                System.out.println("2. Log out");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    System.out.println("Purchasing the product:");
                    PaymentStrategy paymentStrategy = null;
                    while (paymentStrategy == null) {
                        System.out.println("Please select a payment method:");
                        System.out.println("1. Credit card");
                        System.out.println("2. PayPal");
                        System.out.println("3. Cryptocurrency");
                        String paymentChoice = scanner.nextLine();
                        if (paymentChoice.equals("1")) {
                            paymentStrategy = creditCardPaymentStrategy;
                        } else if (paymentChoice.equals("2")) {
                            paymentStrategy = payPalPaymentStrategy;
                        } else if (paymentChoice.equals("3")) {
                            paymentStrategy = cryptocurrencyPaymentStrategy;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                        }
                    }
                    DiscountStrategy discountStrategy = paymentStrategy instanceof CreditCardPaymentStrategy ? new TenPercentDiscountStrategy() : new NoDiscountStrategy();
                    double discountedPrice = discountStrategy.applyDiscount(product.getPrice());
                    System.out.println("The discounted price is: $" + discountedPrice);
                    onlinePurchase.processOrder(loggedInUsers.get(0), product, paymentStrategy,discountedPrice);
                } else if (choice.equals("2")) {
                    loggedInUsers.clear();
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

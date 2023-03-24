package ESHOP;

public class Main {
    public static void main(String[] args) {
        // create a user
        User user = new User("Mehzabin Haque", "john.smith@example.com", "password", "123 Main St");

        // create a product
        Product product = new Product("iPhone 12", "Apple iPhone 12 (64GB)", 799.00, "https://example.com/iphone12.jpg", 10);

        // create payment strategies
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("1234 5678 9012 3456", "12/24", "123");
        PaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy("john.smith@example.com", "password");
        PaymentStrategy cryptocurrencyPaymentStrategy = new CryptocurrencyPaymentStrategy("0x1234567890abcdef");

        // create a product purchase template
        ProductPurchaseTemplate productPurchaseTemplate = new ProductPurchaseTemplate() {};

        // purchase the product using a credit card
        System.out.println("Purchasing the product using a credit card:");
        productPurchaseTemplate.purchaseProduct(user, product, creditCardPaymentStrategy);

        // purchase the product using PayPal
        // System.out.println("\nPurchasing the product using PayPal:");
        // productPurchaseTemplate.purchaseProduct(user, product, payPalPaymentStrategy);

        // purchase the product using cryptocurrency
        // System.out.println("\nPurchasing the product using cryptocurrency:");
        // productPurchaseTemplate.purchaseProduct(user, product, cryptocurrencyPaymentStrategy);

        // ProductPurchaseTemplate productPurchase = new ProductPurchaseWithPromotion();

        // PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("Mehzabin Haque", "1234567890123456", "123");

        // // purchase the product with promotion
        // productPurchase.purchaseProduct(user, product, paymentStrategy);
    
    }
}

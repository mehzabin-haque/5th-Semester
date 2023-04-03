package ESHOP;

public class Order {
    private User user;
    private Product product;
    private double price;
    private int quantity;

    public Order(User user, Product product, double price, int quantity) {
        this.user = user;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public void processOrder(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(price);
        System.out.println("Payment processed successfully!");
    }

    // Getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

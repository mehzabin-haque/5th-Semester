package ESHOP;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Product> products;
    private List<User> users;
    private List<Payment> payments;

    public Mediator() {
        products = new ArrayList<Product>();
        users = new ArrayList<User>();
        payments = new ArrayList<Payment>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}

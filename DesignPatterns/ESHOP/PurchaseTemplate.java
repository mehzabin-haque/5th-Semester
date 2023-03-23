package ESHOP;

public abstract class PurchaseTemplate {
    public void displayProduct(Product product) {
        System.out.println("Product name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Inventory: " + product.getInventory());
    }

    public abstract void displayUser(User user);

    public abstract Payment selectPaymentMethod();

    public void processPurchase(Product product, User user) {
        displayProduct(product);
        displayUser(user);
        Payment payment = selectPaymentMethod();
        payment.pay(product.getPrice());
        product.setInventory(product.getInventory() - 1);
        System.out.println("Order confirmed!");
    }
}


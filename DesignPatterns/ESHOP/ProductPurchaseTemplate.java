package ESHOP;

public abstract class ProductPurchaseTemplate {
    public void displayProduct(Product product) {
        // display product information
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Description: " + product.getDescription());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Image: " + product.getImage());
        System.out.println("Product Inventory: " + product.getInventory());
    }

    public void displayUserAccount(User user) {
        // display user account information
        System.out.println("User Name: " + user.getName());
        System.out.println("User Email: " + user.getEmail());
    }

    public void purchaseProduct(User user, Product product, PaymentStrategy paymentStrategy) {
        // display product information
        displayProduct(product);

        // display user account information
        displayUserAccount(user);

        // process the order using the mediator
        EcommerceMediator mediator = new EcommercePlatform();
        mediator.addUser(user);
        mediator.addProduct(product);
        mediator.processOrder(user, product, paymentStrategy);
    }
}

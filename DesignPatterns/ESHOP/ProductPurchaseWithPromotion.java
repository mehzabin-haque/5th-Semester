package ESHOP;

public class ProductPurchaseWithPromotion extends ProductPurchaseTemplate {

    @Override
    public void displayProduct(Product product) {
        // display product information with promotional discount
        double discountedPrice = product.getPrice() * 0.9; // apply 10% discount
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Description: " + product.getDescription());
        System.out.println("Product Price: " + discountedPrice);
        System.out.println("Product Image: " + product.getImage());
        System.out.println("Product Inventory: " + product.getInventory());
    }

    // other methods can remain the same as the parent class
}


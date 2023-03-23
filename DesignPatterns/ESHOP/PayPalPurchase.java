package ESHOP;

public class PayPalPurchase extends PurchaseTemplate {
    private PayPalPayment payment;

    public PayPalPurchase(String email, String password) {
        payment = new PayPalPayment(email, password);
    }

    public void displayUser(User user) {
        System.out.println("User name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    public Payment selectPaymentMethod() {
        System.out.println("PayPal payment selected.");
        return payment;
    }
}


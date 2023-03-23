package ESHOP;

public class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " with PayPal.");
    }
}

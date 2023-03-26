package ESHOP;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        System.out.println("\nYou got 10% discount for using credit card.\n"+
        "Processing CreditCard payment of $" + amount + "...");
    }
}
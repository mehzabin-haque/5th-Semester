package ESHOP;

public class CreditCardPurchase extends PurchaseTemplate {
    private CreditCardPayment payment;

    public CreditCardPurchase(String cardNumber, String expiryDate, String cvv) {
        payment = new CreditCardPayment(cardNumber, expiryDate, cvv);
    }

    public void displayUser(User user) {
        System.out.println("User name: " + user.getName());
        System.out.println("Address: " + user.getAddress());
    }

    public Payment selectPaymentMethod() {
        System.out.println("Credit card payment selected.");
        return payment;
    }
}

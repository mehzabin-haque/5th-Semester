package ESHOP;

public class CryptoPurchase extends PurchaseTemplate {
    private CryptoPayment payment;

    public CryptoPurchase(String walletAddress) {
        payment = new CryptoPayment(walletAddress);
    }

    public void displayUser(User user) {
        System.out.println("User name: " + user.getName());
        System.out.println("Password: " + user.getPassword());
    }

    public Payment selectPaymentMethod() {
        System.out.println("Cryptocurrency payment selected.");
        return payment;
    }
}


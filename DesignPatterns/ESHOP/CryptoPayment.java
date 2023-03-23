package ESHOP;

public class CryptoPayment extends Payment {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " with cryptocurrency.");
    }
}

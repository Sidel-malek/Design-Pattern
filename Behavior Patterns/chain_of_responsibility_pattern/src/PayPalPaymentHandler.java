public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount > 1000 && amount <= 1500) {
            System.out.println("Conducting payment through PayPal.");
        } else {
            System.out.println("No suitable payment method found.");
        }
    }
}

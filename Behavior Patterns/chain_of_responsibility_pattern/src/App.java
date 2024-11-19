public class App {
    public static void main(String[] args) throws Exception {
        // Creating the chain
        PaymentHandler bankHandler = new BankPaymentHandler();
        PaymentHandler cardHandler = new CardPaymentHandler();
        PaymentHandler paypalHandler = new PayPalPaymentHandler();

        bankHandler.setNextHandler(cardHandler);
        cardHandler.setNextHandler(paypalHandler);

        // Example payments
        bankHandler.handlePayment(450);    // Process through Bank
        bankHandler.handlePayment(800);    // Handle using Card
        bankHandler.handlePayment(1200);   // Conduct through PayPal
        bankHandler.handlePayment(2000);   // No suitable payment method found
    }
}

public class CardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount > 500 && amount <= 1000) {
            System.out.println("Handling payment using Card.");
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    }  
}

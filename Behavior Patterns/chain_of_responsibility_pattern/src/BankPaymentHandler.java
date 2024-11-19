public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Processing payment through Bank.");
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    } 
}

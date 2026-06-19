import java.util.Random;

class Payment {

    public static boolean makePayment(double amount) {

        Random random = new Random();

        int transactionId =
                100000 + random.nextInt(900000);

        System.out.println("\n===== PAYMENT PROCESS =====");

        System.out.println("Processing payment...");

        System.out.println("Amount: $" + amount);

        System.out.println("Transaction ID: TXN" + transactionId);

        System.out.println("Payment Successful!");

        return true;
    }
}
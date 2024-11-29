import java.util.Calendar;
import java.util.UUID;

public class BaseTransaction implements TransactionInterface {
    private final double amount;
    private final Calendar date;
    private final String transactionID;

    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = (Calendar) date.clone(); // Defensive copy to prevent modification
        this.transactionID = UUID.randomUUID().toString(); // Generate a unique ID
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return (Calendar) date.clone(); // Return a defensive copy
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }
    @Override
    public void apply(BankAccount ba) {
        // Base implementation does nothing; override in derived classes
        System.out.println("BaseTransaction apply method: No specific behavior implemented.");
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    @Override
    public boolean reverse() {
        System.out.println("Base transactions cannot be reversed");
        return false;
    }
}

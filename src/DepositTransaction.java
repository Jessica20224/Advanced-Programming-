import java.util.Calendar;
public class DepositTransaction extends BaseTransaction {
    public DepositTransaction(double amount, Calendar date) {
        super(amount, date);
    }

    @Override
    public void apply(BankAccount ba) {
        ba.deposit(getAmount()); // Add the transaction amount to the bank account balance
        System.out.println("Deposit successful. New balance:" +ba.getBalance());
    }

}



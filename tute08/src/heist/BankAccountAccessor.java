package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    
    private BankAccount account;

    // static instance
    private static BankAccountAccessor instance = null;

    // private constructor
    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // getInstance method
    public synchronized static BankAccountAccessor getInstance(BankAccount bankAccount) {
        if (instance == null) {
            instance = new BankAccountAccessor(bankAccount);
        }

        return instance;
    }

    // Syncrhonised means that only 1 thread can access a method on an object at once, all other threads have to wait

    public synchronized void setBankAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    public synchronized void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
            } else {
                System.out.println(user + " failed to withdraw $" + amountPerWithdrawal + ".");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        System.out.println(user + " is leaving the bank, the balance is $" + account.getBalance());
    }

}
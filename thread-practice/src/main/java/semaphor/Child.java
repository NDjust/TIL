package semaphor;

public class Child extends Thread {

    private BankAccount bankAccount;

    public Child(final BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            bankAccount.withdraw(100);
        }
    }
}

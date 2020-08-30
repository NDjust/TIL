package semaphor;

import java.util.stream.IntStream;

public class Parent extends Thread {

    private BankAccount bankAccount;

    public Parent(final BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            bankAccount.deposit(100);
        }

    }
}

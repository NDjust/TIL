package semaphor;

import java.util.concurrent.Semaphore;

public class BankAccount {

    private int balance;
    private Semaphore sem;
    private Semaphore wSem;
    private Semaphore dSem;


    public BankAccount() {
        sem = new Semaphore(1);
        wSem = new Semaphore(0);
        dSem = new Semaphore(0);
    }

    public void deposit(final int n) {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.getCause();
        }

        // ===== Critical Section===========/
        int temp = balance + n;
        System.out.print("+");
        balance = temp;
        // ===== Critical Section===========/
        dSem.release();
        sem.release();

        try {
            wSem.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void withdraw(final int n) {
        try {
            dSem.acquire();
            sem.acquire();
        } catch (InterruptedException e) {
            e.getCause();
        }

        // ===== Critical Section===========/
        int temp = balance - n;
        System.out.print("-");
        balance = temp;
        // ===== Critical Section===========/
        wSem.release();
        sem.release();


    }

    public int getBalance() {
        return balance;
    }
}

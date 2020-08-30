package semaphor;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Parent parent = new Parent(bankAccount);
        Child child = new Child(bankAccount);

        parent.start();
        child.start();

        try {
            parent.join();
            child.join();
        } catch (InterruptedException e) {
            e.getCause();
        }

        System.out.println();
        System.out.println("BankAccount Balance : " +  bankAccount.getBalance());
    }
}

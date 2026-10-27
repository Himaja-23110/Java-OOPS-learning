package Encapsulation;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Himaja");

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}
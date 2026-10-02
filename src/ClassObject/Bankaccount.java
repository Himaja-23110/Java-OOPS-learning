package ClassObject;

public class Bankaccount {
	String accountHolder;
	int accountNumber;
	double balance;
	  void deposit(double amount) {
	        balance = balance + amount;
	    }

	    void withdraw(double amount) {
	        balance = balance - amount;
	    }
	void displayDetails() {
		System.out.println("AcoountHolder: " + accountHolder);
		System.out.println("AcoountNumber: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
	public static void main(String [] args) {
		Bankaccount b1 = new Bankaccount();
		b1.accountHolder = "Himaja";
		b1.accountNumber = 21345;
		b1.balance = 50000;
		b1.deposit(5000);
	    b1.withdraw(2000);
		b1.displayDetails();
	}
}
		                                                       
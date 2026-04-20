package atmmachine;



	import java.util.ArrayList;

	public class Account {

	    int accountNumber;
	    int pin;
	    double balance;
	    ArrayList<Transaction> transactions;

	    // Constructor
	    Account(int accountNumber, int pin, double balance) {
	        this.accountNumber = accountNumber;
	        this.pin = pin;
	        this.balance = balance;
	        transactions = new ArrayList<>();
	    }

	    int getPin() {
	        return pin;
	    }

	    void deposit(double amt) {
	        balance += amt;
	        transactions.add(new Transaction("Deposit", amt));
	        System.out.println("Amount Deposited Successfully!");
	    }

	    void withdraw(double amt) {
	        if (amt <= balance) {
	            balance -= amt;
	            transactions.add(new Transaction("Withdraw", amt));
	            System.out.println("Amount Withdrawn Successfully!");
	        } else {
	            System.out.println("Insufficient Balance!");
	        }
	    }

	    void showBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    void showTransactions() {
	        System.out.println("\n--- Transaction History ---");

	        if (transactions.isEmpty()) {
	            System.out.println("No Transactions Found");
	        } else {
	            for (Transaction t : transactions) {
	                t.display();
	            }
	        }
	    }
	}


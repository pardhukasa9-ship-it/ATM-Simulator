package atmmachine;


	public class Transaction {

	    String type;
	    double amount;

	    // Constructor
	    Transaction(String type, double amount) {
	        this.type = type;
	        this.amount = amount;
	    }

	    // Display
	    void display() {
	        System.out.println(type + " : " + amount);
	    }
	}



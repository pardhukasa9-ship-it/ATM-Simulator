package atmmachine;



	import java.util.HashMap;
	import java.util.Scanner;

	public class ATM {

	    static HashMap<Integer, Account> accounts = new HashMap<>();

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Create one default account
	        accounts.put(1001, new Account(1001, 1234,5000));

	        System.out.print("Enter Account Number: ");
	        int accNo = sc.nextInt();

	        if (!accounts.containsKey(accNo)) {
	            System.out.println("Account Not Found!");
	            return;
	        }

	        Account user = accounts.get(accNo);

	        int choice;

	        do {
	            System.out.println("\n----- ATM MENU -----");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Transaction History");
	            System.out.println("5. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    user.showBalance();
	                    break;

	                case 2:
	                    System.out.print("Enter amount: ");
	                    user.deposit(sc.nextDouble());
	                    break;

	                case 3:
	                    System.out.print("Enter amount: ");
	                    user.withdraw(sc.nextDouble());
	                    break;

	                case 4:
	                    user.showTransactions();
	                    break;

	                case 5:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}



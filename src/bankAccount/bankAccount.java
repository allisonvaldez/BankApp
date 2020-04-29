package bankAccount;

import java.util.Scanner;

public class bankAccount {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // to get user input
		int userChoice; // the userChoice is declared as an int
		boolean quit = false; // the default of quitting the app is set to false
		float balance = 0; // initialize balance as a global variance 
		printHeader();
		
		do {
			printMenu();
			userChoice = input.nextInt(); // grabs input from user as an int
			
			switch(userChoice) {
			case 0: // quit the game
				quit = true; // need the boolean of quit to be true here to stop the game
				System.out.println("\nThank you for using the app!");
			break;
		
			case 1:
				// deposit money logic
				float amount; // instantiate the amount variable as a float
				System.out.println("\nEnter your deposit amount: "); // print instructions to the user
				amount = input.nextFloat(); // gets input from the user as an int and saves it to the amount variable
			
				// prevent users from entering a negative amount for deposit
				if (amount >= 0) {
					balance = balance += amount; // takes the original balance and increments new balance amount from deposit
					System.out.println("\nDeposit of " + amount + " made.");
					System.out.println("\nBalance of " + balance);
				}
				else {
					System.out.println("\nPlease enter a deposit amount greater than 0.");
					System.out.println("\nReturn to the main menu to make a selection: ");
				}
			break;
			
			case 2:
				// withdraw money logic
				System.out.println("Enter your withdraw amount: ");
				amount = input.nextFloat(); //gathers input from user as an int
				balance = balance -= amount; 
				System.out.println("\nWithdraw of: " + amount + " made.");
				System.out.println("\nBalance of: " + balance);
			break;
			
			case 3:
				//  display balance logic 
				System.out.println("\nYou have a balance of: " + balance);
			break;
		
			default: 
				// to catch any errors should never get this due to logic
				System.out.println("\nAn unknown error has occured. Please make a selection between 0-3: ");
				break;
			}	
		}
		while (!quit);  // while quit is not selected do *something*
	}
		
	private static void printHeader() {
		System.out.println("\n");
		System.out.println("+---------------------------------+");
		System.out.println("|            Welcome to           |");
		System.out.println("|      The Banking Application    |");
		System.out.println("+---------------------------------+");
		System.out.println("\n");
	}
	
	private static void printMenu() {
		System.out.println("\nSelect 0 to exit.");
		System.out.println("Select 1 to deposit money."); // prints the instructions to the screen
		System.out.println("Select 2 to withdraw money:");
		System.out.println("Select 3 to check your balance:");
		System.out.println("");
	}
	  
}

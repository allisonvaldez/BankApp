package bankAccount;

import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // to get user input
		int userChoice; // the userChoice is declared as an int
		boolean quit = false; // the default of quitting the app is set to false
		float balance = 0; // initialize balance as a global variance 
		
		// make a do while loop for selection choices (main logic of the app)
		do { 
			System.out.println("\nSelect 0 to exit.");
			System.out.println("Select 1 to deposit money."); // prints the instructions to the screen
			System.out.println("Select 2 to withdraw money:");
			System.out.println("Select 3 to check your balance:");
			System.out.println("\nUser Selection: ");
			userChoice = in.nextInt(); // gets input from the user as an int
			
			// uses switch case for each user choice and app logic around choice
			switch(userChoice) {
				case 0: // quit the game
					quit = true; // need the boolean of quit to be true here to stop the game
					System.out.println("\nThank you for using the app!");
					break;
				
				case 1:
					// deposit money logic
					float amount; // instantiate the amount variable as a float
					System.out.println("Enter your deposit amount: "); // print instructions to the user
					amount = in.nextFloat(); // gets input from the user as an int and saves it to the amount variable
					balance = balance += amount; // takes the original balance and increments new balance amount from deposit
					System.out.println("Deposit of " + amount + " made.");
					System.out.println("Balance of " + balance);
					
					break;
					
				case 2:
					// withdraw money logic
					System.out.println("Enter your withdraw amount: ");
					amount = in.nextFloat(); //gathers input from user as an int
					balance = balance -= amount; 
					System.out.println("Withdraw of: " + amount + " made.");
					System.out.println("Balance of: " + balance);
					
					break;
					
				case 3:
					//  display balance logic 
					System.out.println("You have a balance of: " + balance);
					
					break;
				
				default: 
					// to catch any errors should never get this due to logic
					System.out.println("\nAn unknown error has occured. Please make a selection between 0-3: ");
					break;
			}
		}
		while(!quit);
			System.out.println("\nBye for now!");
	}
}

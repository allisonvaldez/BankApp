package bankAccount;

import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //to get user input
		int userChoice; // the userChoice is declared as an int
		boolean quit = false; // the default of quitting the app is set to false
		do { //make a do while loop for if the user wants to quit
			System.out.println("Select 1 to deposit money: "); // prints the instructions to the screen
			System.out.println("Select 2 to withdraw money: ");
			System.out.println("Select 3 to check your balance: ");
			System.out.println("Select 0 to exit: ");
		}
		while(!quit);

	}

}

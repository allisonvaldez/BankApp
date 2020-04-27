package bankAccount;

import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //to get user input
		int userChoice; // the userChoice is declared as an int
		boolean quit = false; // the default of quitting the app is set to false
		do { //make a do while loop for if the user wants to quit
			System.out.println("Select 0 to exit. "); // prints the instructions to the screen
			userChoice = in.nextInt(); //takes user input as an int and throws an error if is isnt
			if (userChoice == 0) {
				quit = true; // if user selects 0 quit the program
			}
		}
		while(!quit);

	}

}

package src;

import java.util.Scanner;

public class UserInput {
	Scanner input;
	String user;
	// Get user input 
	public String getInput() {
		//Uses a Scanner to read user input from the Console.
		input = new Scanner(System.in);
		user = input.nextLine(); //Read the whole line so that it can be parsed to find key words
		return user.toLowerCase();
	}	
	// After finishing a conversation call this method to close the input scanner.
	public void close() {
		input.close();
	}
}

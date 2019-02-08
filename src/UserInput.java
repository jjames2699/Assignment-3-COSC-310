package src;

import java.util.Scanner;

public class UserInput {
	Scanner input;
	String user;
	
	public String getInput() {
		//Uses a Scanner to read user input from the Console.
		input = new Scanner(System.in); 
		user = input.nextLine().toLowerCase(); //Read the whole line so that it can be parsed to find key words
		return user;
	}
}

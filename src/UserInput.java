package src;

import java.util.Scanner;
/*
 * Class: UserInput
 * Description: -	Initializes a Scanner to read user's input via the Console.
 * Authors: Daulton Baird, Damyn Filipuzzi (edits)
 */
public class UserInput {
	Scanner input;
	String user;
	/*
	 * Method: getInput (String)
	 * Inputs: 		-	None
	 * Description: -	Initializes a new Scanner "input
	 * 				-	Assigns the user's input to String "user" 
	 * 				-   "user" contains nextLine() because the user may enter
	 * 				-   more text than necessary
	 * 				-	returns "user" to be used in Decision Matrix
	 */
	public String getInput() {
		input = new Scanner(System.in);
		user = input.nextLine();
		return user.toLowerCase();
	}	
	/*
	 * Method: close
	 * Inputs: 		-	None
	 * Description: -	Closes the Scanner once the program is complete
	 */
	public void close() {
		input.close();
	}
}

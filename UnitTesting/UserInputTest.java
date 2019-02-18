package UnitTesting;

import src.UserInput;

/*Unit Test for UserInput Class. This class makes sure the user input is correctly read and then prints it back for the user to see.
 * Author: Daulton Baird
 */

public class UserInputTest {

	public static void main(String[] args) {
		UserInput ui = new UserInput();
		System.out.println("Type something: ");
		String user = ui.getInput();
		System.out.println("You typed: "+user);
		ui.close();
	}

}

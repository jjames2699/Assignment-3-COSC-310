package UnitTesting;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import src.UserInput;

/*Unit Test for UserInput Class. This class makes sure the user input is correctly read and then prints it back for the user to see.
 * Author: Daulton Baird
 */

public class UserInputTest {
	static UserInput ui = new UserInput();
		static String userScanner;
		static Scanner in = new Scanner(System.in);
		static String userUI;
		public static void main(String[] args) {
			System.out.println("Enter the same string twice");
			userScanner = in.nextLine();
			userUI = ui.getInput();
		}
		
	@Test
	void TestUI() { 
	assertEquals(userScanner,userUI);
	}
}

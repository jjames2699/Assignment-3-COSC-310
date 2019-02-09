package src;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	Scanner input;
	String user;

	public String getInput() {
		//Uses a Scanner to read user input from the Console.
		input = new Scanner(System.in);
		user = input.nextLine().toLowerCase(); //Read the whole line so that it can be parsed to find key words
		input.close();
		return user;
	}

	// Seperates User Input by white space and stores words into ArrayList
	public ArrayList<String> uiToArray() {
		ArrayList<String> al = new ArrayList<>();
		String[] strArr = user.trim().split("\\s+");
		for (int i = 0; i < strArr.length; i++) {
			al.add(strArr[i]);
		}
		return al;
	}

}

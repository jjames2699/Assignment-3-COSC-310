package src;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * Class: Testing
 * Description: -	Test class that executes Chatbot
 * 				-	Creates instance of Run Class
 * 				-	while loop allows user to go back to the beginning if they have more than one issue
 * 				-	Executes initialize method from Run Class
 * 				-	Executes initializeTree method from Run Class
 * 				-	Executes runLoop method from Run Class
 * Authors: Daulton Baird
 */
public class Testing {

	public static void main(String[] args) throws IOException {
		Run run = new Run();
		while(true) {
		    run.initialize();
		    run.initializeTree();
		    run.runLoop();
		}
		
	}
}

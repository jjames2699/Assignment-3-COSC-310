package UnitTesting;
import src.Run;
import java.io.IOException;


/*Unit Test for the Run Class that executes one run of the program.
 * Since it only does one run, no while loop as there is in testing class. 
 * Author: Daulton Baird
 */
public class RunTest {

	public static void main(String[] args) throws IOException {
		Run run = new Run();
		System.out.println("Hello, I am Chatbot. I will be assisting you today.");
		    run.initialize();
		    run.initializeTree();
		    run.runLoop();
	}
}

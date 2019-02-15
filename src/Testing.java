package src;

import java.io.FileNotFoundException;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {
		Run run = new Run();
		while(true) {
		run.initialize();
		run.initializeTree();
		run.runLoop();
		}
	}
}

package src;

import java.util.ArrayList;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user= "";
		//BotTree bot = new BotTree(0); //This is going to be the initial instance of whatever tree class we make
		Tree<String> start = new Tree<String>(0);
		String initialMsg = (String) start.getRootData(); //Root contains the first String
		System.out.println(initialMsg); //Print initial message
		UserInput ui= new UserInput(); //Create instance of User Input class
		user = ui.getInput();	//Read user input via Scanner in UI class
		
		int selection = 0; //select which tree to go to based on user's input
		if(user.contains("internet")) {selection = 1;} //internet = tree #1
		if(user.contains("tv")) {selection = 2;} //tv = tree #2
		if(user.contains("phone")) {selection = 3;} //phone = tree #3
		
		
		Tree<String> bot = new Tree<String>(selection); //the tree created from user's input
		ArrayList<Question> questions = bot.getNextQuestion();
		for(int i=0; i<questions.size(); i++) {
		questions.get(i).printQuestion();
		user = ui.getInput(); //read user input
		}
		
		//do next steps based on which tree is created
		
	}

}

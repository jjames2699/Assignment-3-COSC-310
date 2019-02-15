package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String user= "";
		//BotTree bot = new BotTree(0); //This is going to be the initial instance of whatever tree class we make
		Tree start = new Tree(0);
		ArrayList<Question> initial = new ArrayList<>(start.getNextQuestion().values());//
		initial.get(0).printQuestion();//print the initial question
		UserInput ui= new UserInput(); //Create instance of User Input class
		user = ui.getInput();	//Read user input via Scanner in UI class
		
		int selection = 0; //select which tree to go to based on user's input
		if(user.contains("internet")) {selection = 1;} //internet = tree #1
		else if(user.contains("phone")) {selection = 2;} //phone = tree #3
		
		
		Tree bot = new Tree(selection); //the tree created from user's input
		//standard file opening
		String file = "0-0.txt";
		HashMap<String, Question> questions = bot.getNextQuestion(); //ArrayList that hold the questions
		Decision_Matrix d = new Decision_Matrix();
		while(true){
			questions.get(file).printQuestion();
			user = ui.getInput();
			file = d.Decision(user, file, selection);
			System.out.println(file);
		}
//		ArrayList<Question> questions = bot.getNextQuestion(); //ArrayList that hold the questions
//		for(int i=0; i<questions.size(); i++) {
//			user = "";
//			questions.get(i).printQuestion(); //get next question
//			user = ui.getInput(); //read user input
//		}
		
	}

}

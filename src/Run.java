package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Run {
		int selection;
		String user;
		UserInput ui;
		String file;
		HashMap<String, Question> questions;
		Decision_Matrix d;
		
	public Run() {
		selection = 0;
		user = "";
		ui = null;
	}
	
	public void initialize() {
		Tree start = new Tree(0);
		ArrayList<Question> initial = new ArrayList<>(start.getNextQuestion().values());//
		setSelection(0); //select which tree to go to based on user's input
		while(true) {
		initial.get(0).printQuestion();//print the initial question
		setUI(new UserInput()); //Create instance of User Input class
		setUser(ui.getInput());	//Read user input via Scanner in UI class
		if(user.contains("internet")) {setSelection(1); break;} //internet = tree #1
		else if(user.contains("phone")) {setSelection(2); break;} //phone = tree #2
		//else if(user.contains("tv")) {selection = 3;} //tv = tree #3
		else {System.out.println("Entry invalid, try again");}
		}
	}
	
	public void initializeTree() throws FileNotFoundException {
		Tree bot = new Tree(getSelection()); //the tree created from user's input
		//standard file opening
		setFile("0-0.txt");
		setQuestions(bot.getNextQuestion()); //ArrayList that hold the questions
		setDecisionMatrix(new Decision_Matrix());
	}
	
	public void runLoop() throws FileNotFoundException {
		while (true) {
			getQuestions().get(getFile()).printQuestion();
			if(getFile().equals("loop-0.txt")){
				break;
			}else if(getFile().equals("end-0.txt")){
				System.exit(0);
			}
			setUser(ui.getInput());
			file = d.Decision(getUser(), getFile(), getSelection());
		}
	}
	//setters
	public void setSelection(int selection) {this.selection=selection;}
	public void setUser(String user) {this.user= user;}
	public void setUI(UserInput ui) {this.ui=ui;}	
	public void setFile(String file) {this.file= file;}
	public void setQuestions(HashMap<String, Question> questions) {this.questions=questions;}
	public void setDecisionMatrix(Decision_Matrix decisionMatrix) {this.d=decisionMatrix;}	
	
	//getters
	public int getSelection() {return this.selection;}
	public String getUser() {return this.user;}
	public UserInput getUI() {return ui;}
	public String getFile() {return this.file;}
	public HashMap<String, Question> getQuestions(){return this.questions;}
	public Decision_Matrix getDecisionMatrix() {return this.d;}	
	
	
}

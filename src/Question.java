package src;

import java.util.ArrayList;

/*
 * Class: Question
 * Description: -	Body that contains info from individual question file
 * 				-	Contains some variables and methods not currently used 
 * 					in program, but could be useful later on
 * Authors: Robin MacDonald
 */
public class Question {
	public static int questionID = 0;			//Currently unused, but may be useful for ID purposes
	
	private ArrayList<Integer> branchID;		//Acts as path for sorting questions
	private int questionPriority;				//Used in conjunction with branchID to prioritize questions with same branchID
	private String question;					//Question to be asked
	private int inputRange;						//Number of possible inputs (number of children)
	private ArrayList<String> answers;			//ArrayList of possible answers to Question
	//private ArrayList<Question> parents;		//Currently unused
	private ArrayList<Question> children;		//Child nodes
	
	/*
	 * Constructor
	 * Description: -	Initializes branchID, answers, parents, and children ArrayLists
	 * 				-	Increments questionID
	 */
	Question() {	
		this.branchID = new ArrayList<>();
		this.answers = new ArrayList<>();
		//this.parents = new ArrayList<>();
		this.children = new ArrayList<>();
		
		questionID++;
	}

	/*
	 * Setter Methods
	 * All currently used
	 */
	public void setQuestionPriority(int questionPriority) {this.questionPriority = questionPriority;}
	public void setQuestion(String question) {this.question = question;}
	public void setInputRange(int inputRange) {this.inputRange = inputRange;}
	
	/*
	 * Getter Methods
	 * Some unused
	 */
	public ArrayList<Integer> getBranchID() {return this.branchID;}
	public int getQuestionPriority() {return this.questionPriority;}
	public String getQuestion() {return this.question;}
	public int getInputRange() {return this.inputRange;}
	public ArrayList<String> getAnswers() {return this.answers;}
	//public ArrayList<Question> getParent() {return this.parents;}
	public ArrayList<Question> getChildren() {return this.children;}
	
	/*
	 * Specific ArrayList Modification Methods
	 * Some unused, but could be useful
	 */	
	//BranchID
	public void addBranch(int id) {this.branchID.add(id);}
	public void removeBranch(int pos) {this.branchID.remove(pos);}
	public void replaceBranchID(int pos, int newBranchID) {this.branchID.set(pos, newBranchID);}
	
	//Answers
	public void addAnswer(String ans) {this.answers.add(ans);}
	public void setAnswer(String ans, int pos) {this.answers.set(pos, ans);}
	public void removeAnswer(int pos) {this.answers.remove(pos);}
	
	//Parents - Currently unused
	/*
	public void addParent(Question parent) {this.parents.add(parent);}
	public void setParent(int pos, Question parent) {this.parents.set(pos, parent);}
	public void removeParent(Question parent) {this.parents.remove(parent);}
	public void trimParents() {this.parents.trimToSize();}
	public void setRoot() {this.parents = null;}
	*/
	
	//Children
	public void addChild(Question child) {this.children.add(child);}
	public void setChild(int pos, Question child) {this.children.set(pos, child);}
	public void removeChild(Question child) {this.children.remove(child);}
	public void trimChildren() {this.children.trimToSize();}
	public void setEnd() {this.children = null;}
	
	/*
	 * Method: printQuestion
	 * Description: -	Currently used for testing purposes
	 * 				-	Prints certain info regarding specific Question object
	 */
	public void printQuestion() {
		//System.out.println(this.branchID.toString());
		//System.out.println(this.questionPriority);
		System.out.println(this.question);
		//System.out.println(this.inputRange);
		//System.out.println(this.answers.toString());
	}
	
}

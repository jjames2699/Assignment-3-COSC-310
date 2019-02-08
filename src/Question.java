package main_bodies;

import java.util.ArrayList;

public class Question {
	public static int questionID = 0;
	
	private ArrayList<Integer> branchID;
	private int questionPriority;
	private String question;
	private int inputRange;
	private ArrayList<String> answers;
	private ArrayList<Question> parents;
	private ArrayList<Question> children;
	
	Question() {	
		branchID = new ArrayList<>();
		this.answers = new ArrayList<>();
		this.parents = new ArrayList<>();
		this.children = new ArrayList<>();
		
		questionID++;
	}

	//Setters
	public void setQuestionPriority(int questionPriority) {this.questionPriority = questionPriority;}
	public void setQuestion(String question) {this.question = question;}
	public void setInputRange(int inputRange) {this.inputRange = inputRange;}
	
	//Getters
	public int getQuestionPriority() {return this.questionPriority;}
	public String getQuestion() {return this.question;}
	public int getInputRange() {return this.inputRange;}
	public ArrayList<String> getAnswers() {return this.answers;}
	public ArrayList<Question> getParent() {return this.parents;}
	public ArrayList<Question> getChildren() {return this.children;}
	
	//ArrayList Modifiers
	public void addBranch(int id) {this.branchID.add(id);}
	public void removeBranch(int pos) {this.branchID.remove(pos);}
	public void replaceBranchID(int pos, int newBranchID) {this.branchID.set(pos, newBranchID);}
	
	public void addAnswer(String ans) {this.answers.add(ans);}
	public void setAnswer(String ans, int pos) {this.answers.set(pos, ans);}
	public void removeAnswer(int pos) {this.answers.remove(pos);}
	
	public void addParent(Question parent) {this.parents.add(parent);}
	public void removeParent(Question parent) {this.parents.remove(parent);}
	public void trimParents() {this.parents.trimToSize();}
	public void setRoot() {this.parents = null;}
	
	public void addChild(Question child) {this.children.add(child);}
	public void removeChild(Question child) {this.children.remove(child);}
	public void trimChildren() {this.children.trimToSize();}
	public void setEnd() {this.children = null;}
	
	//Class Methods
	public void printQuestion() {
		System.out.println(this.branchID.toString());
		System.out.println(this.questionPriority);
		System.out.println(this.question);
		System.out.println(this.inputRange);
		System.out.println(this.answers.toString());
	}
	
	//Parents and children lists will be formed in some sort of edge builder class
	
}

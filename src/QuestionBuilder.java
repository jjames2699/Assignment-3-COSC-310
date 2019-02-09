package src;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class QuestionBuilder {
	private File dir;
	private ArrayList<Question> builtQuestions;
	
	QuestionBuilder(String folderName) {
		this.dir = new File(folderName);
		this.builtQuestions = new ArrayList<>();
	}
	
	public ArrayList<Question> getBuiltQuestions() {return this.builtQuestions;}
	
	
	public void buildQuestions() {		
		Question temp;
		String tempLine;
		
		for(File file: this.dir.listFiles()) {
			try {
				Scanner s = new Scanner(file);
				temp = new Question();
				
				//Read BranchIDs
				tempLine = s.nextLine();
				for(int i=0; i<tempLine.length(); i++) {
					temp.addBranch(Character.getNumericValue(tempLine.charAt(i)));
				}
				
				//Read Question Priority
				tempLine = s.nextLine();
				temp.setQuestionPriority(Integer.parseInt(tempLine));
				
				//Read Question
				temp.setQuestion(s.nextLine());
				
				//Read inputRange
				tempLine = s.nextLine();
				temp.setInputRange(Integer.parseInt(tempLine));
				
				//Read Answers
				while(s.hasNextLine()) {
					temp.addAnswer(s.nextLine());
				}
				
				builtQuestions.add(temp);
				temp = null;
				
				s.close();	
			} catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
		}
	}
	


}

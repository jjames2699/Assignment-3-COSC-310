package main_bodies;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class QuestionBuilder {
	private Scanner fileIn;
	private File file;
	
	QuestionBuilder(String filename){
		this.file = new File(filename);
		
		try {
			fileIn = new Scanner(file);
			
			
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public Question buildQuestion() {
		Question q = new Question();
		String tempQuestion = "";
		
		fileIn.next();
		while(fileIn.hasNextInt()) {
			q.addBranch(fileIn.nextInt());
		}
		
		fileIn.nextLine();
		
		fileIn.next();
		q.setQuestionPriority(fileIn.nextInt());
		
		fileIn.nextLine();
		
		fileIn.next();
		while(fileIn.hasNext()) {
			tempQuestion += fileIn.next();
		}
		
		q.setQuestion(tempQuestion);
		
		fileIn.nextLine();
		
		fileIn.next();
		q.setInputRange(fileIn.nextInt());
		
		for(int i=0; i<q.getInputRange(); i++) {
			q.addAnswer(fileIn.nextLine());
		}
		
		return q;
	}
	
	public void closeScanner() {
		this.fileIn.close();
	}

}

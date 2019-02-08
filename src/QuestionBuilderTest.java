package main_bodies;

import java.util.ArrayList;

public class QuestionBuilderTest {

	public static void main(String[] args) {
		ArrayList<Question> q;
		String folderName = "Questions";
		
		QuestionBuilder qb = new QuestionBuilder(folderName);
		qb.buildQuestions();
		q = qb.getBuiltQuestions();
		
		q.get(0).printQuestion();
		q.get(1).printQuestion();

	}

}

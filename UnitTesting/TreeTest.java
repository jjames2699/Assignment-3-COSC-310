package UnitTesting;

import java.util.ArrayList;

import src.Question;
import src.Tree;

/*Unit Test for Tree Class that creates an instance of each tree and prints 1 question from it.
 * This is done the same way as in the Run Class
 * Author: Daulton Baird
 */

public class TreeTest {
	
	public static void main(String[] args) {
		Tree tree0 = new Tree(0);
		ArrayList<Question> list = new ArrayList<>(tree0.getNextQuestion().values());
		list.get(0).printQuestion();
		
		Tree tree1 = new Tree(1);
		ArrayList<Question> list1 = new ArrayList<>(tree1.getNextQuestion().values());
		list1.get(0).printQuestion();
		
		Tree tree2 = new Tree(2);
		ArrayList<Question> list2 = new ArrayList<>(tree2.getNextQuestion().values());
		list2.get(1).printQuestion();
	}

}

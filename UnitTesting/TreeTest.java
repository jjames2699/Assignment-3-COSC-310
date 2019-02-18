package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;


import src.Question;
import src.Tree;

/*Unit Test for Tree Class that creates an instance of each tree and prints 1 question from it.
 * 
 * Author: Daulton Baird
 */

public class TreeTest {
	
	@Test
	void TestTree0() {
		String initial = "Is your issue in regards to internet, or phone?";
		Tree tree0 = new Tree(0);
		ArrayList<Question> list = new ArrayList<>(tree0.getNextQuestion().values());
		assertTrue(list.get(0).getQuestion().equals(initial));
	}
	@Test
	void TestTree1() {
		String initial ="Are you connected to Wifi or Ethernet?";
		Tree tree1 = new Tree(1);
		HashMap<String, Question> questions = tree1.getNextQuestion();
		questions.get("0-0.txt").getQuestion();
		assertTrue(questions.get("0-0.txt").getQuestion().equals(initial));
	}
	@Test
	void TestTree2() {
		String initial = "Are you using a landline or a cell phone?";
		Tree tree2 = new Tree(2);
		HashMap<String, Question> questions = tree2.getNextQuestion();
		questions.get("0-0.txt").getQuestion();
		assertTrue(questions.get("0-0.txt").getQuestion().equals(initial));
	}

}

/*Source: https://stackoverflow.com/questions/3522454/java-tree-data-structure
 * uploaded by jjnguy 
 * changed to read Strings and work with QuestionBuilder class
 */
package src;

import java.util.ArrayList;


public class Tree{
	    private Node<String> root;
	    
		public Tree(int i) { //specific constructor for the 3 main trees
		  	if(i==0) {//start
		  		String initial = "Is your issue in regards to Internet, TV, or phone?";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.qb = new QuestionBuilder("Start");
		  		root.qb.buildQuestions();
		  		root.children = root.qb.getBuiltQuestions();
		  	}
		  	else if(i==1) { //Internet
		  		root = new Node<String>("Are you connected to wifi or ethernet?");
		  		root.qb = new QuestionBuilder("Internet");
		  		root.qb.buildQuestions();
		  		root.children = root.qb.getBuiltQuestions();
		  	}
		  	else if(i==2) {//TV
		  		root = new Node<String>("Are you watching Cable or Netflix?");
		  		root.qb = new QuestionBuilder("TV");
		  		root.children = root.qb.getBuiltQuestions();
		  	}
		  	else if(i==2) {//Phone
		  		root = new Node<String>("Are you using a Mobile phone or Landline phone?");
		  		root.qb = new QuestionBuilder("Phone");
		  		root.children = root.qb.getBuiltQuestions();
		  		
		  	}

		}
	    public ArrayList<Question> getNextQuestion() {
	    	return root.qb.getBuiltQuestions();
	    }
	    
	    
	    public void add(String question) {
	    	if(root==null) {
	    		root= new Node<String>(question); //create root node based on data
	    		root.data = question; 
	    		root.children = new ArrayList<Question>(); //initalize children arraylist
	    		
	    	}
	    	else { //root is already set to something
	    		Node<String> n = new Node<String>(question); //create new node for data
	    		n.data = question;
	    		n.parent = root; //parent is the root
	    		//root.children.add(new Question(n)); //add new node to root's child array list
	    	}
	    }
	    public static class Node<T> { //basic node class
	        private T data;
			private Node<T> parent;
	        private QuestionBuilder qb;
	        private ArrayList<Question> children;
	        
	        public Node(T data) {
	        	this.data = data;
	        	parent = null;
	        }
	    }
}

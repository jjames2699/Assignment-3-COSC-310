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
		  		root = new Node<String>("Is your issue in regards to Internet, TV, or phone?"); //creates a new node for the root
		  		root.qb = new QuestionBuilder("Start"); //Start stores the question(s) for the first Tree
		  		root.qb.buildQuestions(); //load questions into array
		  		root.children = getNextQuestion(); //load built questions into children
		  	}
		  	else if(i==1) { //Internet
		  		root = new Node<String>("Are you connected to wifi or ethernet?"); //load initial into new node
		  		root.qb = new QuestionBuilder("Internet"); //Internet folder stores questions
		  		root.qb.buildQuestions(); //load questions into array
		  		root.children = getNextQuestion(); //load built questions into children
		  	}
		  	else if(i==2) {//TV
		  		root = new Node<String>("Are you watching Cable or Netflix?"); //load initial into new node
		  		root.qb = new QuestionBuilder("TV"); //TV folder stores questions
		  		root.children = getNextQuestion(); //load built questions into children
		  	}
		  	else if(i==3) {//Phone
		  		root = new Node<String>("Are you using a Mobile phone or Landline phone?"); //load initial into new node
		  		root.qb = new QuestionBuilder("Phone"); //Phone folder stores questions
		  		root.children = getNextQuestion(); //load built questions into children
		  	}

		}
	    public ArrayList<Question> getNextQuestion() {
	    	return root.qb.getBuiltQuestions(); //returns ArrayList of built questions
	    }
	    
	    
	    public void add(String question) {
	    	if(root==null) {
	    		root= new Node<String>(question); //create root node based on data
	    		root.children = new ArrayList<Question>(); //Initialize children ArrayList
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
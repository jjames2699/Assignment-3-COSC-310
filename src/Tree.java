package src;

import java.util.ArrayList;


public class Tree<T>{
	    private Node<String> root;
	    
		public Tree(int i) { //specific constructor for the 3 main trees
		  	if(i==0) {//start
		  		root = new Node<String>("Is your issue in regards to Internet, TV, or phone?");
		  		root.data = "Is your issue in regards to Internet, TV, or phone?";
		  		root.children = null;
		  	}
		  	else if(i==1) { //Internet
		  		String initial = "Are you connected to wifi or ethernet?";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.qb = new QuestionBuilder("Internet");
		  		root.qb.buildQuestions();
		  		root.children = root.qb.getBuiltQuestions();
		  		root.children.get(0).printQuestion();
		  	}
		  	else if(i==2) {//TV
		  		String initial = "Are you watching Cable or Netflix?";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.qb = new QuestionBuilder("TV");
		  		root.children = root.qb.getBuiltQuestions();
		  	}
		  	else if(i==2) {//Phone
		  		String initial = "Are you using a Mobile phone or Landline phone?";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.children = new ArrayList<Question>();
		  		
		  	}

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
	    public static class Node<T> {
	        private T data;
			private Node<T> parent;
	        private QuestionBuilder qb;
	        private ArrayList<Question> children;
	        
	        public Node(T data) {
	        	this.data = data;
	        	parent = null;
	        }
	    }
		public String getRootData() {
			return root.data;
		}
}

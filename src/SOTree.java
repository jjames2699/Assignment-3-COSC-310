package src;

import java.util.ArrayList;
import java.util.List;



public class SOTree<T>{
	    private Node<String> root;
	    
		public SOTree(int i) { //specific constructor for the 3 main trees
		  	if(i==0) {//start
		  		root = new Node<String>("Is your issue in regards to Internet, TV, or phone?");
		  		root.data = "Is your issue in regards to Internet, TV, or phone?";
		  		root.children = new ArrayList<Node<String>>(); //To be replaced with reading ArrayList from QuestionBuilder class
		  	}
		  	else if(i==1) { //Internet
		  		String initial = "Are you connected to wifi or ethernet?";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.children = 
		  	}
		  	else if(i==2) {//TV
		  		String initial = "";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.children = new ArrayList<Node<String>>(); //To be replaced with reading ArrayList from QuestionBuilder class
		  	}
		  	else if(i==2) {//Phone
		  		String initial = "";
		  		root = new Node<String>(initial);
		  		root.data = initial;
		  		root.children = new ArrayList<Node<String>>(); //To be replaced with reading ArrayList from QuestionBuilder class
		  	}

		}
	    
	    public void add(String data) {
	    	if(root==null) {
	    		root= new Node<String>(data); //create root node based on data
	    		root.data = data; 
	    		root.children = new ArrayList<Node<String>>(); //initalize children arraylist
	    		
	    	}
	    	else { //root is already set to something
	    		Node<String> n = new Node<String>(data); //create new node for data
	    		n.parent = root; //parent is the root
	    		root.children.add(n); //add new node to root's child array list
	    	}
	    }
	    public static class Node<T> {
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;
	        
	        public Node(T data) {
	        	this.data = data;
	        	parent = null;
	        }
	    }
		public String getRootData() {
			return root.data;
		}
}

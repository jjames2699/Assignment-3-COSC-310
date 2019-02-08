package src;

import java.util.ArrayList;
import java.util.List;

public class SOTree<T>{
	    private Node<T> root;
	    
		public SOTree(int i) { //specific constructor for the 3 main trees
		  	root = null;
		  	initializeTree(i);//run the method to set up a tree based on the number
		}
	    public SOTree(T rootData) {
	        root = new Node<T>(rootData);
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }
	    
	    
	    public void initializeTree(int i) {
	    	if(i==1) {
	    		//***this needs to implemented using a class that allows non generics**
	    		/*
	    		root = new Node<String>("something about internet");
	    		root.data = "something about internet";
	    		root.children = new ArrayList<Node<String>>();
	    		add("branch 1 of internet");
	    		add("branch 2 of internet");
	    		add("branch 3 of internet");
	    		*/
	    	}
	    	else if(i==2) {
	    		/*
	    		root = new Node<String>("something about tv");
	    		root.data = "something about tv";
	    		root.children = new ArrayList<Node<String>>();
	    		add("branch 1 of tv");
	    		add("branch 2 of tv");
	    		add("branch 3 of tv");
	    		*/
	    	}
	    	else if(i==3) {
	    		/*
	    		root = new Node<String>("something about phone");
	    		root.data = "something about phone";
	    		root.children = new ArrayList<Node<String>>();
	    		add("branch 1 of phone");
	    		add("branch 2 of phone");
	    		add("branch 3 of phone");
	    		*/
	    	}
	    }
	    
	    public void addRoot(T rootData){
	    	root = new Node<T>(rootData);
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }
	    public void add(T data) {
	    	if(root==null) {
	    		root= new Node<T>(data); //create root node based on data
	    		root.data = data; 
	    		root.children = new ArrayList<Node<T>>(); //initalize children arraylist
	    		
	    	}
	    	else { //root is already set to something
	    		Node<T> n = new Node<T>(data); //create new node for data
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
		public T getRootData() {
			return root.data;
		}
}

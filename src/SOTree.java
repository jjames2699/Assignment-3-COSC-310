package src;

import java.util.ArrayList;
import java.util.List;

public class SOTree<T>{
	    private Node<T> root;

	    public SOTree(T rootData) {
	        root = new Node<T>(rootData);
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }

	    public static class Node<T> {
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;
	        
	        public Node(T data) {
	        	this.data = data;
	        }
	    }
	    
	    public Node<T> addChild(T child) {
	    	if(root==null) {
	    		root= new Node<T>(child);
	    	}
	    	else {
	    		root.children.add((Node<T>) child);
	    		
	    	}
			return root;
	    }
}

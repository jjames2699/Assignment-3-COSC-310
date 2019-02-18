package src;

/* We planned to implement this class but because of time constraints, were unable to
 */


import java.util.ArrayList;
import java.util.Iterator;

/*
 * Class: EdgeBuilder
 * Description: -	Takes ArrayList of unlinked questions (children nodes empty),
 * 					and links all of the nodes together using branchID and questionPriority
 * Authors: Robin MacDonald
 */
public class EdgeBuilder {
	private ArrayList<Question> edges;				//New ArrayList of the linked Question nodes

	/*
	 * Constructor
	 * Inputs: 		-	ArrayList of unlinked questions
	 * Description: -	Takes unlinked questions as inputs
	 * 				-	Initializes new ArrayList "edges"
	 * 				-	Ensures capacity of "edges" to save time
	 * 				-	Creates root question
	 * 				-	Inserts root node into 0th position of "edges"
	 * 				-	Copies all Questions from "list" into subsequent
	 * 					positions in "edges"
	 */
	EdgeBuilder(ArrayList<Question> list){
		this.edges = new ArrayList<>();
		this.edges.ensureCapacity(list.size() + 1);
		this.edges.add(buildRoot());
		
		
		for(int i=0; i<list.size(); i++) {
			this.edges.add(list.get(i));
		}
	}
	
	/*
	 * Method: buildRoot
	 * Outputs:		-	Question object identified as root node
	 * Description:	-	Creates "root" node
	 * 				-	Contains first question to be asked
	 * 				-	Sets branchID and questionPriority = 0,
	 * 					indicating that it is the root node when sorting
	 */
	public Question buildRoot() {
		Question root = new Question();
		
		root.setQuestionPriority(0);

		root.addBranch(0);
		root.setQuestion("Would you like help with Internet, Cable or Phone?");
		root.setInputRange(3);
		
		root.addAnswer("1) Internet");
		root.addAnswer("2) Cable");
		root.addAnswer("3) Phone");
				
		return root;
	}
	
	/* *WIP*
	 * Method: buildEdges
	 * Output:		-	ArrayList "edges" containing linked Questions
	 * Description: -	Iterates through ArrayList "edges" containing
	 * 					unlinked nodes
	 * 				-	Sets current node as "temp1"
	 * 				-	Loops through entire list again to find nodes
	 * 					corresponding to the children of temp1
	 * 				-	Matches are labeled as "temp2"
	 * 				-	If priority of "temp2"
	 * 				-	Adds corresponding children into "children" of "temp1"
	 * TODO:		- 	Integrate solution for case of matching branchID with
	 * 					different question priorities [Complete]
	 * 				-	Possible design change inside loop for simpler process
	 * 					[Complete]
	 */
	public ArrayList<Question> buildEdges() {
		Question temp1, temp2, temp3;
		int temp1Size, temp2Size, tempKey;
		Iterator<Question> itr = this.edges.iterator();
		
		//Main loop
		while(itr.hasNext()) {
			temp1 = itr.next();
			temp1Size = temp1.getBranchID().size();
			
			//Secondary loop (searches for child nodes of "temp1")
			for(int i=0; i<edges.size(); i++) {
				temp2 = edges.get(i);
				temp2Size = temp2.getBranchID().size();
				System.out.println(temp2Size);
				tempKey = temp2.getBranchID().get(temp2Size-1);
				
				//Integrate priority somewhere around here
				
				//Checks to see if "temp2" branchID minus last term matches "temp1" branchID
				if(temp2Size == temp1Size+1 && temp1.getChildren().contains(temp2) == false) {
					
					//Checks to see if the temp2 branchID-1 contains temp1 branchID
					if(temp2.getBranchID().subList(0, temp1Size).toString()
							.equals(temp1.getBranchID().toString())) {
						
						System.out.println("Match Found");
						
						if(temp1.getChildren().get(tempKey) == null)
							temp3 = temp1.getChildren().get(tempKey);
						else
							temp3 = null;
						
						do {							
							if(temp3 != null) {
								
								if(temp3.getQuestionPriority() < temp2.getQuestionPriority()) {
									tempKey = 0;
									temp3 = temp3.getChildren().get(tempKey);
								} else {
									temp2 = temp3;
									temp3 = null;
								}
							} else {
								
								//Set as child
								temp1.setChild(tempKey, temp2);
							}
							
						}while(temp3 != null);
							
					}
				}
			}
			
			/*
			 * If after traversing entire list to find child nodes yields no results,
			 * sets "temp1" as end node.
			 * After all children are determined, trims "children" ArrayList of "temp1"
			 * to size in order to eliminate unused space
			 */
			if(temp1.getChildren().isEmpty()) {
				temp1.setEnd();
			} else {
				temp1.trimChildren();
			}
			
		}
		
		System.out.println("All Edges Linked Successfully.");
		
		//Returns "edges" with all nodes properly linked
		return this.edges;
	}
}

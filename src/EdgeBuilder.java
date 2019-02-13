package src;

import java.util.ArrayList;
import java.util.Iterator;

public class EdgeBuilder {
	private ArrayList<Question> edges;

	EdgeBuilder(ArrayList<Question> list){
		this.edges = new ArrayList<>();
		this.edges.ensureCapacity(list.size() + 1);
		this.edges.add(buildRoot());
		
		
		for(int i=0; i<list.size(); i++) {
			this.edges.add(list.get(i));
		}
	}
	
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
	
	//Create sublist and compare
	public ArrayList<Question> buildEdges() {
		Question temp1, temp2;
		int temp1Size, temp2Size;
		Iterator<Question> itr = this.edges.iterator();
		
		while(itr.hasNext()) {
			temp1 = itr.next();
			temp1Size = temp1.getBranchID().size();
			
			for(int i=0; i<edges.size(); i++) {
				temp2 = edges.get(i);
				temp2Size = temp2.getBranchID().size();
				
				//Integrate priority
				if(temp2Size == temp1Size-1 && temp1.getChildren().contains(temp2) == false) {
					if(temp2.getBranchID().subList(0, temp1Size-1).toString()
							.equals(temp1.getBranchID().toString())) {
						
						temp1.setChild(temp2.getBranchID().get(temp2.getBranchID().size()-1), temp2);
					}
				}
			}
			
			if(temp1.getChildren().isEmpty()) {
				temp1.setEnd();
			} else {
				temp1.trimChildren();
			}
			
		}
		
		return this.edges;
	}
}

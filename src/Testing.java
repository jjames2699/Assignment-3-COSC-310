package src;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user= "";
		//BotTree bot = new BotTree(0); //This is going to be the initial instance of whatever tree class we make
		SOTree<String> start = new SOTree<String>(0);
		String initialMsg = (String) start.getRootData(); //Root contains the first String
		System.out.println(initialMsg); //Print initial message
		UserInput ui= new UserInput(); //Create instance of User Input class
		user = ui.getInput();	//Read user input via Scanner in UI class
		
		int selection = 0; //select which tree to go to based on user's input
		if(user.contains("internet")) {selection = 1;} //internet = tree #1
		if(user.contains("tv")) {selection = 2;} //tv = tree #2
		if(user.contains("phone")) {selection = 3;} //phone = tree #3
		
		
		//this doesnt work yet... see initializeTree method in SOTree
		SOTree<String> bot = new SOTree<String>(selection); //the tree created from user's input
		String response = (String) bot.getRootData(); //set the response to the root (first message of tree)
		System.out.println(response); //print first msg of tree
		user = ui.getInput(); //read user input
		//do next steps based on which tree is created
		
	}

}

package src;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user= "";
		//BotTree bot = new BotTree(0); //This is going to be the initial instance of whatever tree class we make
		Tree bot = new RedBlackTree();
		String response = bot.getRoot(); //Root contains the first String
		System.out.println(response); //Print initial message
		UserInput ui= new UserInput(); //Create instance of User Input class
		user = ui.getInput();	//Read user input via Scanner in UI class
	}

}

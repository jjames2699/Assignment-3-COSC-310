package src;
//coded by Randy Lee
//started Feb 8 worked for 1 hour
//Feb 12 worked on it for 3 hours
//Feb 13 worked on it for 3 hours

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Decision_Matrix {
  //inputs are userInput, filename
  //note number of answer = 4th line in txt file
  public String Decision(String userInput, String file, int selection) throws FileNotFoundException {
    String decision;
    String tryAgain = "Did not understand that, please try again.";
    //make the user input lowercase
    //userInput = userInput.toLowerCase();
    //this line makes the string into an array of string separated at every space
    String[] list = userInput.split(" ");
    //these 2 lines separates the file name by - and .
    String[] list2 = file.split("\\.");
    String[] ans = list2[0].split("-");
    //check selection
    File f = new File("");
    if(selection==1){
      f = new File("Internet");
    }
    else if(selection==2){
      f = new File("Phone");
    }
    for(File check: f.listFiles()){
      if(check.getName().equals(file)){
        f= check;
      }
    }
    //standard file opening
    Scanner in = new Scanner(f);
    //reading the file and getting what this program needs
    in.nextLine();//skip branch id
    in.nextLine(); //skip priority
    //this part checks the answers
    String check = in.nextLine(); //question
    String s1 = in.nextLine(); //num answers
    String[] answers = new String[3];
    int count =0;
    while(in.hasNextLine()){
      answers[count]=in.nextLine();
      count++;
    }

    int i = Integer.parseInt(s1);
    if(check.contains("anything else"))
    {
        //if the word says answer 1 point to begin the loop again
        if(list[0].contains("yes")){
          return "loop-0.txt";
        }
        //if the word says answer 2 point to end the program
        else if(list[0].contains("no")){
          return "end-0.txt";
        }else {
          System.out.println(tryAgain);
          return file;
        }
    }
      if(i==3){
        for(int j = 0; j<list.length; j++){
          //if the word says answer 1 add a 0 to the path
          if(list[j].equalsIgnoreCase(answers[0].split(" ")[1])){
            ans[0]=ans[0]+"0";
            //don't need to check anymore
            break;
            //if the word says answer 2 add a 1 to the path
          }else if(list[j].equalsIgnoreCase(answers[1].split(" ")[1])){
            ans[0]=ans[0]+"1";
            break;
            //if the word says answer 3 add a 2 to the path
          }else if(list[j].equalsIgnoreCase(answers[2].split(" ")[1])){
            ans[0]= ans[0]+"2";
            break;
          }else {
            System.out.println(tryAgain);
            return file;
          }
        }
        ans[1]="0";
      }else if(i==2){
    	  if(check.contains("Did that"))
    	    {
    	        //if the word says answer 1 point to begin the loop again
    		  if(list[0].contains(answers[0].split(" ")[1])){ //if they say yes
    	          return "anythingElse-0.txt";
    	        }
    	        //if the word says answer 2 point to end the program
    	        else if(list[0].contains(answers[1].split(" ")[1])){ //if they say no
    	        		//nothing here so continues
    	        }else {
    	          System.out.println(tryAgain);
    	          return file;
    	        }
    	    }
        for(int j = 0; j<list.length; j++){
          //if the word says answer 1 add a 0 to the path
          if(list[j].equalsIgnoreCase(answers[0].split(" ")[1])){
            ans[0]=ans[0]+"0";
            break;
          }
          //if the word says answer 2 add a 1 to the path
          else if(list[j].equalsIgnoreCase(answers[1].split(" ")[1])){
            ans[0]=ans[0]+"1";
            break;
          }else{
            System.out.println(tryAgain);
            return file;
          }
        }
        //change priority
        ans[1]="0";
      }
      else if(i==1){
        //new priority if empty question
        ans[1]="1";
      }
      else if(i==0){
        //ends program
    	in.close();
        System.exit(0);
      }
      else if(i==-1){
        //return the first file in the sequence
        return "0-0.txt";
      }
      //decision = path, priority and file type
      decision = ans[0]+"-"+ans[1]+"."+list2[1];
      return decision;
  }
}

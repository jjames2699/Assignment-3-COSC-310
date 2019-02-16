package src;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileMaker {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Folder name (must be an existing folder)");
		String folderName = in.nextLine();
		System.out.println("Enter the BranchID");
		String branchID = in.nextLine();
		System.out.println("Enter the Priority");
		String priority = in.nextLine();
		System.out.println("Enter the Question");
		String question = in.nextLine();
		System.out.println("Enter the number of answers");
		String numAns = in.nextLine();
		int num = Integer.parseInt(numAns);
		String[] ans = new String[num];
		for(int i = 0; i<num; i++) {
			System.out.println("Enter answer "+(i+1)+": (ex. '1) yes')");
			ans[i]= in.nextLine();
		}
		String fileAndPath = folderName+"/"+branchID+"-"+priority+".txt";
		File newFile = new File(fileAndPath);
		PrintWriter writer = new PrintWriter(newFile, "UTF-8");
		writer.println(branchID);
		writer.println(priority);
		writer.println(question);
		writer.println(numAns);
		for(int i=0; i<Integer.parseInt(numAns); i++) {
			writer.println(ans[i]);
		}
		System.out.println("Done writing new file");
		writer.close();
		in.close();
	}
}

package src;

import java.io.File;
import java.util.ArrayList;

public class readingFileName{
	public static void main(String[] args) {
		File root = new File("Internet");
		File[] files = root.listFiles();
		ArrayList<String> filelist = new ArrayList<>();
		
		for(File f: files) {
			filelist.add(f.getName());
		}
		System.out.println(filelist);
	}
//
//	public static ArrayList<String> sort(ArrayList<String> al) {
//		ArrayList<String> list = new ArrayList<>();	
//		for(int i = 0; i < al.size()-1; i++) {
//			String filename1 = al.get(i);
//			String filename2 = al.get(i+1);
//			
//			int length = 0;
//			
//			if(filename1.length()<filename2.length()) {length = filename1.length();}
//			else if(filename1.length()<filename2.length()) {length = filename2.length();}
//			
//			for(int j=0; i<length; i++) {
//				if(filename1.charAt(i) < filename2.charAt(i)) {
//					list.add(filename1);
//				}
//				else if(filename1.charAt(i) > filename2.charAt(i)) {
//					list.add(filename2);
//				}	
//			}
//		}
//		return list;
//	}
}

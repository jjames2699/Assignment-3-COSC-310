package src;

import java.util.Date;
import java.util.Stack;
import java.io.*;
import java.text.*;

public class StackHandler {
    
    private Stack<String> conversationLog = null;
    private Stack<String> filePathLog = null;
    
    // Initializes conversationLog to be used outside of this class
    public Stack<String> initConversationLog() {
        conversationLog = new Stack<>();
        return conversationLog;
    }
    // Initializes filePathLog to be used outside of this class
    public Stack<String> initFileLog() {
        filePathLog = new Stack<>();
        return filePathLog;
    }
    // Prints Conversation Log to file
    public void conToFile() throws IOException {
        // These three Lines add the current date to the File StackLog
        Date timeStamp = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd_hh.mm.ss");
        String fileName = ft.format(timeStamp) + ".txt";
        // File Paths for Logs
        File logFolder = new File("StackLog");
        File conLog = new File(logFolder+ "/" + "ConversationLog_" + fileName);
        // Write to Files       
        PrintWriter writer = new PrintWriter(conLog, "UTF-8");       
        while (!(conversationLog.empty())) {
            writer.println(conversationLog.pop());
        }
        writer.close();        
    }
    // Prints Path Log to File
    public void pathToFile() throws IOException {
        // These three Lines add the current date to the File StackLog
        Date timeStamp = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd_hh.mm.ss");
        String fileName = ft.format(timeStamp) + ".txt";
        // File Paths for Logs
        File logFolder = new File("StackLog");
        File pathLog = new File(logFolder+ "/" + "FilePathLog_" + fileName);
        // Write to Files       
        PrintWriter writer = new PrintWriter(pathLog, "UTF-8");       
        while (!(filePathLog.empty())) {
            writer.println(filePathLog.pop());
        }
        writer.close();
    }
    // Test Class
    public static void main(String[] args) throws IOException {
        StackHandler sh = new StackHandler();      
        Stack<String> cons = sh.initConversationLog();
        Stack<String> path = sh.initFileLog();
        cons.push("Test Converation Log");
        cons.push("newline");
        path.push("001-0.txt");
        path.push("newline");
        sh.conToFile();
        sh.pathToFile();   
    }  
}

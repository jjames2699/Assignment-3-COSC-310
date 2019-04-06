package src;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	JTextArea dialog=new JTextArea(20,50);
	JScrollPane scroll=new JScrollPane(
			dialog,
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//new ChatBot();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1340, 742);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hello();
				 
				
			}
		});
		btnSubmit.setBounds(1181, 609, 115, 29);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setBounds(15, 612, 1133, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 lblNewLabel = new JLabel("Hello, I am Chatbot. I will be assisting you today. ");
		 lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		 lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(15, 0, 1281, 534);
		//lblNewLabel.getFont(new Font ("Tahoma", Font.BOLD,15));
		
		
		frame.getContentPane().add(lblNewLabel);
	}
	public void hello() {
		textField.setBounds(15, 612, 1133, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		lblNewLabel = new JLabel("Hello!");
		 lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		 lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		//lblNewLabel.setBounds(15, 0, 1281, 604);
		
		frame.getContentPane().add(lblNewLabel);
	}
}


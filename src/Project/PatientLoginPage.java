package Project;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class PatientLoginPage{

	JFrame frame;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientLoginPage window = new PatientLoginPage();
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
	public PatientLoginPage() {
		initialize();
	}
	String docname;
	public PatientLoginPage(String docname) {
		this.docname=docname;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Patient ID");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(170, 21, 89, 41);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(88, 81, 247, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				frame.setVisible(false);
				new SampleFile(id,docname);
			}
		});
		btnNewButton.setBounds(170, 151, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Patient's List");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if(docname.equalsIgnoreCase("sharath")) {
					docname="Dr.Sharath";
				}
				else if(docname.equalsIgnoreCase("sridhar")) {
					docname="Dr.Sridhar";
				}
				else if(docname.equalsIgnoreCase("radhika")) {
					docname="Dr.Radhika";
				}
				new PatientDetailsPage(docname);
				
			}
		});
		btnNewButton_1.setBounds(150, 210, 135, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new DoctorLoginPage();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClose.setBounds(299, 152, 89, 23);
		frame.getContentPane().add(btnClose);
	}
}

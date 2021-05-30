package Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SampleFile {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextArea textArea;
	private JTextField textField;
	private JTextField txtBpLevels;
	private JTextField txtWeight;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea txtrAdditionalInformationOf;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JButton btnSave;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	String ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SampleFile window = new SampleFile();
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
	public SampleFile() {
		initialize();
	}
	
	String id;
	String fn,ln;
	private JTextField textField_1;
	String docname;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_7;

	SampleFile(String id,String docname){
		this.id=id;
		this.docname=docname;
		System.out.println(id+docname);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.setBounds(100, 100, 650, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setBounds(10,112,86,20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
				txtAge = new JTextField();
				txtAge.setEditable(false);
		txtAge.setColumns(10);
		txtAge.setBounds(10, 197, 42, 20);
		frame.getContentPane().add(txtAge);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(255, 228, 181));
		textArea.setBounds(169, 175, 425, 86);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(255, 218, 185));
		textField.setBounds(169, 297, 425, 86);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtBpLevels = new JTextField();
		txtBpLevels.setEditable(false);
		txtBpLevels.setBounds(269, 74, 92, 28);
		frame.getContentPane().add(txtBpLevels);
		txtBpLevels.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setEditable(false);
		txtWeight.setColumns(10);
		txtWeight.setBounds(490, 74, 104, 28);
		frame.getContentPane().add(txtWeight);
		
		label = new JLabel("New label");
		label.setBounds(198, 215, 21, -57);
		frame.getContentPane().add(label);
		
		lblNewLabel = new JLabel("Health issues:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(169, 144, 129, 28);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Medices prescribed");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(171, 272, 141, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtrAdditionalInformationOf = new JTextArea();
		txtrAdditionalInformationOf.setEditable(false);
		txtrAdditionalInformationOf.setBackground(new Color(173, 216, 230));
		txtrAdditionalInformationOf.setForeground(new Color(255, 99, 71));
		txtrAdditionalInformationOf.setText("Additional information of reports:");
		txtrAdditionalInformationOf.setBounds(10, 394, 528, 114);
		frame.getContentPane().add(txtrAdditionalInformationOf);
		
		btnNewButton = new JButton("Diet");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PanelDiet(id,fn,ln,docname);
			}
		});
		btnNewButton.setBounds(10, 241, 77, 39);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Patient's profile");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(274, 11, 296, 55);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PatientLoginPage(docname);

			}
		});
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSave.setBackground(Color.GREEN);
		btnSave.setBounds(221, 581, 77, 39);
		frame.getContentPane().add(btnSave);
		
		lblNewLabel_3 = new JLabel("BP:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(224, 77, 35, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Weight:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(426, 80, 54, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 80, 66, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Age:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 175, 35, 21);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 46, 86, 20);
		frame.getContentPane().add(textField_1);
		
		ID=textField_1 .getText();
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ID = textField_1.getText();
				new UpdateTable(ID,docname);
				
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUpdate.setBackground(Color.RED);
		btnUpdate.setBounds(179, 519, 192, 39);
		frame.getContentPane().add(btnUpdate);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(106, 112, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(75, 197, 54, 20);
		frame.getContentPane().add(textField_3);
		
		lblNewLabel_7 = new JLabel("Gender:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(75, 175, 54, 21);
		frame.getContentPane().add(lblNewLabel_7);
		String line="";
		try {
			if(docname.equalsIgnoreCase("sridhar")) {
			FileReader fin=new FileReader("profile2");
			BufferedReader br=new BufferedReader(fin); 
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()) {
				line=sc.nextLine();
				String[] row;
				for(int i=0;i<line.length();i++) {
					
				}
				if(line.startsWith(id)) {
					String s=line;
					sc.close();
					FileWriter fw = new FileWriter("profile22");
					int len=s.length();
					String[] str[];
					int j=0;
					for(int i=0;i<s.length();i++)
					{
						fw.write(s.charAt(i));
					}
					fw.close();
					String lines = null;
					FileInputStream fin1=new FileInputStream("profile22");
					Scanner sc1 = new Scanner(fin1);
					while(sc1.hasNext()){
						lines=sc1.next();
						String id=sc1.next();
						String lname=sc1.next();
						String age=sc1.next();
						String sex=sc1.next();
						String bp=sc1.next();
						String wt=sc1.next();
						String health=sc1.next();
						String med=sc1.next();
						String add=sc1.next();
						textField_1.setText(lines);
						txtName.setText(id);
						fn=id;
						textField_2.setText(lname);
						ln=lname;
						txtAge.setText(age);
						textField_3.setText(sex);
						txtBpLevels.setText(bp);
						txtWeight.setText(wt);
						textArea.setText(health);
						textField.setText(med);
						txtrAdditionalInformationOf.setText(add);
						
						System.out.println(lines);
				
					}
					
					sc1.close();
			}}}else if(docname.equalsIgnoreCase("sharath")) {
				FileReader fin=new FileReader("profile1");
				BufferedReader br=new BufferedReader(fin); 
				Scanner sc = new Scanner(fin);
				while(sc.hasNextLine()) {
					line=sc.nextLine();
					String[] row;
					for(int i=0;i<line.length();i++) {
						
					}
					if(line.startsWith(id)) {
						String s=line;
						sc.close();
						FileWriter fw = new FileWriter("profile11");
						int len=s.length();
						String[] str[];
						int j=0;
						for(int i=0;i<s.length();i++)
						{
							fw.write(s.charAt(i));
						}
						fw.close();
						String lines = null;
						FileInputStream fin1=new FileInputStream("profile11");
						Scanner sc1 = new Scanner(fin1);
						while(sc1.hasNext()){
							lines=sc1.next();
							String id=sc1.next();
							String lname=sc1.next();
							String age=sc1.next();
							String sex=sc1.next();
							String bp=sc1.next();
							String wt=sc1.next();
							String health=sc1.next();
							String med=sc1.next();
							String add=sc1.next();
							textField_1.setText(lines);
							txtName.setText(id);
							textField_2.setText(lname);
							txtAge.setText(age);
							textField_3.setText(sex);
							txtBpLevels.setText(bp);
							txtWeight.setText(wt);
							textArea.setText(health);
							textField.setText(med);
							txtrAdditionalInformationOf.setText(add);
							System.out.println(lines);
						}
						
						sc1.close();
				}}
		}else if(docname.equalsIgnoreCase("radhika")) {
			FileReader fin=new FileReader("profile3");
			BufferedReader br=new BufferedReader(fin); 
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()) {
				line=sc.nextLine();
				String[] row;
				for(int i=0;i<line.length();i++) {
					
				}
				if(line.startsWith(id)) {
					String s=line;
					sc.close();
					FileWriter fw = new FileWriter("profile33");
					String[] str[];
					int j=0;
					for(int i=0;i<s.length();i++)
					{
						fw.write(s.charAt(i));
					}
					fw.close();
					String lines = null;
					FileInputStream fin1=new FileInputStream("profile33");
					Scanner sc1 = new Scanner(fin1);
					while(sc1.hasNext()){
						lines=sc1.next();
						String id=sc1.next();
						String lname=sc1.next();
						String age=sc1.next();
						String sex=sc1.next();
						String bp=sc1.next();
						String wt=sc1.next();
						String health=sc1.next();
						String med=sc1.next();
						String add=sc1.next();
						textField_1.setText(lines);
						txtName.setText(id);
						textField_2.setText(lname);
						txtAge.setText(age);
						textField_3.setText(sex);
						txtBpLevels.setText(bp);
						txtWeight.setText(wt);
						textArea.setText(health);
						textField.setText(med);
						txtrAdditionalInformationOf.setText(add);
						System.out.println(lines);
				
					}
					
					sc1.close();
			}}
			}
			}
		catch(IOException ioe){
			ioe.printStackTrace();
		}					
	
	}
}


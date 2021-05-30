package Project;





import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class PatientDetailsPage{

	protected static final java.util.logging.Level Level = null;
	JFrame frame;
	private JTable table;
	private JButton btnImportx;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetailsPage window = new PatientDetailsPage();
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
	public PatientDetailsPage() {
		initialize();
	}
	String name;
	
	
	public PatientDetailsPage(String name) {
		this.name=name;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(new Color(255, 204, 255));
		frame.setBounds(100, 100, 509, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 103, 352, 135);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Phone Number", "FName", "LName", "Age", "Sex"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnSave = new JButton("<<Back");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(name.equals("Dr.Sharath")) {
					FileWriter fw = new FileWriter("patients1");
					BufferedWriter bw = new BufferedWriter(fw);
					
					for(int i=0;i<table.getRowCount();i++) {
						for(int j=0;j<table.getColumnCount();j++) {
							bw.write(table.getValueAt(i, j).toString()+" ");
						}
						bw.newLine();
					}					bw.close();
					fw.close();
					frame.setVisible(false);
					name="sharath";
					new PatientLoginPage(name);}
					else if(name.equals("Dr.Sridhar")) {
						FileWriter fw = new FileWriter("patientssridhar");
						BufferedWriter bw = new BufferedWriter(fw);
						
						for(int i=0;i<table.getRowCount();i++) {
							for(int j=0;j<table.getColumnCount();j++) {
								bw.write(table.getValueAt(i, j).toString()+" ");
							}
							bw.newLine();
						}					bw.close();
						fw.close();
						frame.setVisible(false);
						name="sridhar";
						new PatientLoginPage(name);
					}
					else if(name.equals("Dr.Radhika")) {
						FileWriter fw = new FileWriter("patients2");
						BufferedWriter bw = new BufferedWriter(fw);
						
						for(int i=0;i<table.getRowCount();i++) {
							for(int j=0;j<table.getColumnCount();j++) {
								bw.write(table.getValueAt(i, j).toString()+" ");
							}
							bw.newLine();
						}					bw.close();
						fw.close();
						name="radhika";
						frame.setVisible(false);
						new PatientLoginPage(name);
					}
				}
				catch(IOException ex) {
					Logger.getLogger(PatientDetailsPage1.class.getName()).log(Level,null,ex);
					ex.printStackTrace();
				}
				
				
			}
		});
		btnSave.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblNewLabel = new JLabel("Patient's List");
		lblNewLabel.setBackground(new Color(219, 112, 147));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel.setBounds(150, 55, 145, 32);
		frame.getContentPane().add(lblNewLabel);
		
		//btnImportx.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
				//String filePath = "C:\\Users\\AREEFA\\Desktop\\table.txt";
				//File file = new File(filePath);
				
				
	//	btnImportx.setBounds(155, 249, 123, 35);
		//frame.getContentPane().add(btnImportx);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText(name);
		textField.setBounds(279, 11, 145, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDoctor = new JLabel("Doctor:");
		lblDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoctor.setBounds(222, 9, 73, 23);
		frame.getContentPane().add(lblDoctor);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(name.equals("Dr.Sharath")) {
						System.out.println("Hii");
					FileReader fr = new FileReader("patients1");
					BufferedReader br = new BufferedReader(fr);
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					Object[] lines = br.lines().toArray();
					
					for(int i=0;i<lines.length;i++) {
						String[] row= lines[i].toString().split(" ");
						model.addRow(row);
						
					}}
					else if(name.equals("Dr.Sridhar")) {
						FileReader fr = new FileReader("patientssridhar");
						BufferedReader br = new BufferedReader(fr);
						System.out.println("Hiiloo");
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						Object[] lines = br.lines().toArray();
						
						for(int i=0;i<lines.length;i++) {
							String[] row= lines[i].toString().split(" ");
							model.addRow(row);
							
						}
					}
					else if(name.equals("Dr.Radhika")) {
						FileReader fr = new FileReader("patients2");
						BufferedReader br = new BufferedReader(fr);
						
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						Object[] lines = br.lines().toArray();
						
						for(int i=0;i<lines.length;i++) {
							String[] row= lines[i].toString().split(" ");
							model.addRow(row);
							
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnImport.setBounds(139, 270, 169, 23);
		frame.getContentPane().add(btnImport);
	}
}

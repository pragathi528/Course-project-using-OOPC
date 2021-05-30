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

public class PatientDetailsPage1 {

	protected static final java.util.logging.Level Level = null;
	JFrame frame;
	private JTable table;
	private JTextField first;
	private JTextField second;
	private JTextField third;
	private JButton btnImportx;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetailsPage1 window = new PatientDetailsPage1();
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
	public PatientDetailsPage1() {
		initialize();
	}
	String name;
	private JTextField fourth;
	private JTextField fifth;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField sixth;
	
	
	public PatientDetailsPage1(String name) {
		this.name=name;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(new Color(240, 230, 140));
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
		
		first = new JTextField();
		first.setBounds(10, 311, 86, 35);
		frame.getContentPane().add(first);
		first.setColumns(10);
		
		second = new JTextField();
		second.setColumns(10);
		second.setBounds(222, 311, 209, 35);
		frame.getContentPane().add(second);
		
		third = new JTextField();
		third.setColumns(10);
		third.setBounds(10, 380, 101, 35);
		frame.getContentPane().add(third);
		
		JButton btnRun = new JButton("Add Patient");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new Object [] {Integer.parseInt(first.getText()), second.getText(), third.getText(),fourth.getText(),fifth.getText(),sixth.getText()});
				try {
					if(name.equals("Dr.Sridhar")){
					FileWriter fw = new FileWriter("profile2",true);
					BufferedWriter bw = new BufferedWriter(fw);
					//bw.newLine();
					bw.write(first.getText());
					bw.write(" ");
					bw.write(third.getText());
					bw.write(" ");
					bw.write(fourth.getText());
					bw.write(" ");
					bw.write(fifth.getText());
					bw.write(" ");
					bw.write(sixth.getText());
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.write("Null");
					bw.write(" ");
					bw.newLine();
					bw.close();}
					else if(name.equals("Dr.Sharath")) {
							FileWriter fw = new FileWriter("profile1",true);
							BufferedWriter bw = new BufferedWriter(fw);
							//bw.newLine();
							bw.write(first.getText());
							bw.write(" ");
							bw.write(third.getText());
							bw.write(" ");
							bw.write(fourth.getText());
							bw.write(" ");
							bw.write(fifth.getText());
							bw.write(" ");
							bw.write(sixth.getText());
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.write("Null");
							bw.write(" ");
							bw.newLine();
							bw.close();
					}
					else if(name.equals("Dr.Radhika")) {
						FileWriter fw = new FileWriter("profile3",true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(first.getText());
						bw.write(" ");
						bw.write(third.getText());
						bw.write(" ");
						bw.write(fourth.getText());
						bw.write(" ");
						bw.write(fifth.getText());
						bw.write(" ");
						bw.write(sixth.getText());
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.write("Null");
						bw.write(" ");
						bw.newLine();
						bw.close();
				}
				
				}catch(IOException ex) {
					Logger.getLogger(PatientDetailsPage1.class.getName()).log(Level,null,ex);
					ex.printStackTrace();
				}
				first.setText(" ");
				second.setText(" ");
				third.setText(" ");
				fourth.setText(" ");
				fifth.setText(" ");
				sixth.setText(" ");
				
			}
		});
		btnRun.setBounds(167, 426, 128, 43);
		frame.getContentPane().add(btnRun);
		
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
						new HomePage();}
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
							new HomePage();
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
							frame.setVisible(false);
							new HomePage();
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
		
		btnImportx = new JButton("Import Details");
		btnImportx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(name.equals("Dr.Sharath")) {
						System.out.println("Hii");
					FileReader fr = new FileReader("patients1");
					BufferedReader br = new BufferedReader(fr);
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					Object[] lines = br.lines().toArray();
					
					for(int i=0;i<lines.length;i++) {
						if(i==(lines.length)-1) {
							System.out.println(lines[i].toString());
							String str=lines[i].toString();
							System.out.println(str);
							//String s[]=lines
							int len=str.length();
							System.out.println(len);
							int j=0;
							int a[] = null;
							for(int k=0;k<6;k++)
							{
								
								System.out.println(str.charAt(k));
								
							}
							
						}
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
		btnImportx.setBounds(158, 245, 123, 35);
		frame.getContentPane().add(btnImportx);
		
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
		
		fourth = new JTextField();
		fourth.setColumns(10);
		fourth.setBounds(127, 380, 101, 35);
		frame.getContentPane().add(fourth);
		
		fifth = new JTextField();
		fifth.setColumns(10);
		fifth.setBounds(254, 380, 57, 35);
		frame.getContentPane().add(fifth);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(10, 291, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone Number");
		lblNewLabel_1_1.setBounds(306, 291, 88, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("FName");
		lblNewLabel_2.setBounds(10, 357, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("LName");
		lblNewLabel_3.setBounds(127, 357, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setBounds(251, 355, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Sex(M/F)");
		lblNewLabel_5.setBounds(333, 357, 61, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		sixth = new JTextField();
		sixth.setColumns(10);
		sixth.setBounds(333, 380, 73, 35);
		frame.getContentPane().add(sixth);
	}
}

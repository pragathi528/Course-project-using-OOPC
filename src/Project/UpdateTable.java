package Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UpdateTable {

	protected static final Level Level = null;
	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	String Id;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateTable window = new UpdateTable();
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
	public UpdateTable() {
		initialize();
	}
 String keyid;
 String docname;
 private JTextField textField_9;
 private JTextField textField_10;
	public UpdateTable(String ID,String docname) {
		keyid=ID;
		this.docname=docname;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 845, 888);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JTextArea textArea = null;
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 24, 625, 292);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				textField.setText(model.getValueAt(selectedRow, 0).toString());
				textField_1.setText(model.getValueAt(selectedRow, 1).toString());
				textField_9.setText(model.getValueAt(selectedRow, 2).toString());
				textField_2.setText(model.getValueAt(selectedRow, 3).toString());
				textField_10.setText(model.getValueAt(selectedRow, 4).toString());
				textField_3.setText(model.getValueAt(selectedRow, 5).toString());
				textField_4.setText(model.getValueAt(selectedRow, 6).toString());
				textField_5.setText(model.getValueAt(selectedRow, 7).toString());
				textField_6.setText(model.getValueAt(selectedRow, 8).toString());
				textField_7.setText(model.getValueAt(selectedRow, 9).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last name", "age", "gender", "weight", "BP", "Health issue", "Medicines", "Additional Reports"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Import From FIle");
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String filePath="C:\\Users\\AREEFA\\Desktop\\names.txt";
			//	File file=new File(filePath);
				
				try {
					if(docname.equalsIgnoreCase("sridhar")) {
					FileReader fr=new FileReader("profile2");
					BufferedReader br = new BufferedReader(fr);
					
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					Object[] lines = br.lines().toArray();
					
					for(int i=0;i<lines.length;i++) {
						String[] row= lines[i].toString().split(" ");
						model.addRow(row);
						
					}}
					else if(docname.equalsIgnoreCase("sharath")){
						FileReader fr=new FileReader("profile1");
						BufferedReader br = new BufferedReader(fr);
						
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						Object[] lines = br.lines().toArray();
						
						for(int i=0;i<lines.length;i++) {
							String[] row= lines[i].toString().split(" ");
							model.addRow(row);
							
						}
					}
					else if(docname.equalsIgnoreCase("radhika")) {
						FileReader fr=new FileReader("profile3");
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
					Logger.getLogger(PatientDetailsPage.class.getName()).log(Level,null,e1);

					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(23, 72, 176, 48);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(98, 344, 80, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(98, 389, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(98, 420, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Weight");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(98, 464, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Health issue");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(470, 327, 110, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Medicines");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(480, 500, 120, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(190, 345, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 386, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 417, 46, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 492, 86, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Additional Reports ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 539, 134, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(190, 462, 86, 20);
		frame.getContentPane().add(textField_4);
		
		JButton btnUpdate = new JButton("Update & Save");
		btnUpdate.setBackground(new Color(173, 255, 47));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(i>=0) {
					model.setValueAt(textField.getText(),i,0);
					Id=textField.getText();
					model.setValueAt(textField_1.getText(),i,1);
					model.setValueAt(textField_9.getText(),i,2);
					model.setValueAt(textField_2.getText(),i,3);
					model.setValueAt(textField_10.getText(),i,4);
					model.setValueAt(textField_3.getText(),i,5);
					model.setValueAt(textField_4.getText(),i,6);
					model.setValueAt(textField_5.getText(),i,7);
					model.setValueAt(textField_6.getText(),i,8);
					model.setValueAt(textField_7.getText(),i,9);
					JOptionPane.showMessageDialog(frame,"Updated Successfully");
					try {
						if(docname.equalsIgnoreCase("sridhar")){
						FileWriter fw = new FileWriter("profile2");
						BufferedWriter bw = new BufferedWriter(fw);
						
						for(int k=0;k<table.getRowCount();k++) {
							for(int j=0;j<table.getColumnCount();j++) {
								bw.write(table.getValueAt(k, j).toString()+" ");
							}
							bw.newLine();
						}					bw.close();
						fw.close();
						frame.setVisible(false);
						new SampleFile(Id,docname);
						}
						else if(docname.equalsIgnoreCase("sharath")){
							FileWriter fw = new FileWriter("profile1");
							BufferedWriter bw = new BufferedWriter(fw);
							
							for(int k=0;k<table.getRowCount();k++) {
								for(int j=0;j<table.getColumnCount();j++) {
									bw.write(table.getValueAt(k, j).toString()+" ");
								}
								bw.newLine();
							}					bw.close();
							fw.close();
							frame.setVisible(false);
							new SampleFile(Id,docname);	
						}
						else if(docname.equalsIgnoreCase("radhika")) {
							FileWriter fw = new FileWriter("profile3");
							BufferedWriter bw = new BufferedWriter(fw);
							
							for(int k=0;k<table.getRowCount();k++) {
								for(int j=0;j<table.getColumnCount();j++) {
									bw.write(table.getValueAt(k, j).toString()+" ");
								}
								bw.newLine();
							}					bw.close();
							fw.close();
							System.out.println("Done");
							frame.setVisible(false);
							new SampleFile(Id,docname);
						}
					}
					catch(IOException ex) {
						Logger.getLogger(PatientDetailsPage.class.getName()).log(Level,null,ex);
						ex.printStackTrace();
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		btnUpdate.setBounds(162, 623, 158, 40);
		frame.getContentPane().add(btnUpdate);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(470, 362, 325, 131);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(470, 541, 325, 131);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(145, 523, 262, 71);
		frame.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("BP");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(98, 495, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_8 = new JTextField();
		System.out.println(keyid);
		textField_8.setText(keyid);
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				String search = textField_8.getText().toLowerCase();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(102, 271, 86, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(306, 387, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(265, 418, 46, 20);
		frame.getContentPane().add(textField_10);
	}
}

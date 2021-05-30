package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PanelDiet {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelDiet window = new PanelDiet();
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
	public PanelDiet() {
		initialize();
	}

	String id,fn,ln,docname;
	public PanelDiet(String id,String fn,String ln,String docname) {
		this.id=id;
		this.fn=fn;
		this.ln=ln;
		this.docname=docname;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HRAP HOMEO CLINIC");
		frame.getContentPane().setBackground(new Color(255,240,245));
		frame.setBounds(100, 100, 960, 788);
		//frame.setBackground(255,240,245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 83, 705, 547);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 641, 810, 108);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.PINK);
		layeredPane.add(panel1, "name_1555880615500");
		panel1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Have Suppliments for Bone strength");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(29,194, 230,44);
		panel1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxOmegaTablets = new JCheckBox("Omega 3 Tablets daily twice");
		chckbxOmegaTablets.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxOmegaTablets.setBounds(29, 196, 230, 44);
		panel1.add(chckbxOmegaTablets);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Nutrishake");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_2.setBounds(29, 264, 230, 38);
		panel1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Vitamins intake");
		chckbxNewCheckBox_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_2_1.setBounds(29, 322, 230, 38);
		panel1.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("Proteins intake");
		chckbxNewCheckBox_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_2_2.setBounds(29, 376, 230, 38);
		panel1.add(chckbxNewCheckBox_2_2);

		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(62, 449, 726, 44);
		panel1.add(lblNewLabel_4);
		
		
		
		textField = new JTextField();
		textField.setText("Daily walk:");
		textField.setColumns(10);
		textField.setBounds(446, 144, 240, 38);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Exercise hours:");
		textField_1.setColumns(10);
		textField_1.setBounds(446, 196, 240, 38);
		panel1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Calories intake:");
		textField_2.setColumns(10);
		textField_2.setBounds(446, 245, 240, 38);
		panel1.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(29, 55, 33, 23);
		panel1.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(62, 57, 157, 20);
		panel1.add(textField_3);
		textField_3.setText(id);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(10,88, 100, 20);
		panel1.add(textField_4);

		textField_4.setText(fn);
	
		
		
		
		
		textField_5 = new JTextField();
		textField_5.setText((String) null);

		
		//J
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(122, 88, 97, 20);
		panel1.add(textField_5);
		textField_5.setText(ln);
		
		JLabel lblNewLabel = new JLabel("Diet");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 29));
		lblNewLabel.setBounds(350, 27, 67, 21);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(29, 89, 62, 23);
		panel1.add(lblNewLabel_1_1_1);
		
		JPanel panel2 = new JPanel();
		layeredPane.add(panel2, "name_1877305070300");
		panel2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("This is panel2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(49, 60, 400, 132);
		panel2.add(lblNewLabel_1);
		
		JPanel panel3 = new JPanel();
		layeredPane.add(panel3, "name_1897299946100");
		panel3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("This is panel3");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(48, 61, 376, 127);
		panel3.add(lblNewLabel_2);
		
		JButton btn = new JButton("<<Back");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new SampleFile(id,docname);
			}
			
		});
		btn.setBounds(17,30,102,29);
		frame.getContentPane().add(btn);
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBackground(new Color(255, 182, 193));
		btnDisplay.setBounds(779, 133, 108, 59);
		frame.getContentPane().add(btnDisplay);
		
		JButton btnPrintdiet = new JButton("PrintDiet");
		btnPrintdiet.setBackground(new Color(255, 255, 0));
		btnPrintdiet.setBounds(779, 286, 108, 52);
		frame.getContentPane().add(btnPrintdiet);
		btnPrintdiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printRecord(panel1);
			}
		});
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				String s1,s2,s3,s4,s5;
					if(chckbxNewCheckBox.isSelected())
						s1="Have Suppliments for Bone strength ,";
					else
						s1="";
					if(chckbxOmegaTablets.isSelected())
						s2="Omega 3 Tablets daily twice ,";
					else
						s2="";
					if(chckbxNewCheckBox_2.isSelected())
						s3="Nutrishake ,";
					else
						s3="";
					if(chckbxNewCheckBox_2_1.isSelected())
						s4="Vitamins intake ,";
					else
						s4="";
					if(chckbxNewCheckBox_2_2.isSelected())
						s5="Proteins intake";
					else
						s5="";
					lblNewLabel_4.setText("Diet : "+s1+s2+s3+s4+s5);
				}
		});
		
		
	}
	private void printRecord(JPanel panel) {
		//Create PrinterJob here
		PrinterJob printerJob = PrinterJob.getPrinterJob();
		//Set printer job name
		printerJob.setJobName("Print Diet");
		//Set Printable
		printerJob.setPrintable(new Printable() {

			@Override
			public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
				// TODO Auto-generated method stub
				if(pageIndex>0) {
					return Printable.NO_SUCH_PAGE;
				}
				
				//Make 2D Graphics to map content
				Graphics2D graphics2D=(Graphics2D)graphics;
				//set Graphics Translation
				
				graphics2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
				
				//This is a page scale. Default should be 0.3 I am using 0.5
				graphics2D.scale(0.5, 0.5);
				
				//Now paint panel as graphics2D
				panel.paint(graphics2D);
				
				//return if page exists
				return Printable.PAGE_EXISTS;
				
				//return pageIndex;
			}
		});
		//Store printerDialog as boolean
		
		boolean returningResult = printerJob.printDialog();
		//check if dialog is showing
		if(returningResult) {
			//use try catch exception for failure
			try {
				printerJob.print();
			}catch(PrinterException printerException) {
				JOptionPane.showMessageDialog(frame,"Print Error: "+printerException.getMessage());
			}
			

				//return 0;
			}
			
		}
}

package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

public class PanelTrial {

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
					PanelTrial window = new PanelTrial();
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
	public PanelTrial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 83, 620, 380);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.PINK);
		layeredPane.add(panel1, "name_1555880615500");
		panel1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Have Suppliments for Bone strength");
		chckbxNewCheckBox.setBounds(38, 150, 199, 23);
		panel1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Omega 3 Tablets daily twice");
		chckbxNewCheckBox_1.setBounds(38, 185, 178, 23);
		panel1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Nutrishake");
		chckbxNewCheckBox_1_1.setBounds(38, 221, 97, 23);
		panel1.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Proteins - soya intake");
		chckbxNewCheckBox_1_1_1.setBounds(38, 251, 135, 23);
		panel1.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("Wellness");
		chckbxNewCheckBox_1_1_1_1.setBounds(38, 286, 122, 23);
		panel1.add(chckbxNewCheckBox_1_1_1_1);
		
		textField = new JTextField();
		textField.setText("Daily walk:");
		textField.setColumns(10);
		textField.setBounds(357, 112, 240, 38);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Exercise hours:");
		textField_1.setColumns(10);
		textField_1.setBounds(357, 181, 240, 38);
		panel1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Calories intake:");
		textField_2.setColumns(10);
		textField_2.setBounds(357, 243, 240, 38);
		panel1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(80, 38, 157, 20);
		panel1.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(37, 38, 33, 23);
		panel1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Diet");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(290, 11, 78, 25);
		panel1.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(80, 69, 108, 20);
		panel1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText((String) null);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(214, 69, 97, 20);
		panel1.add(textField_5);
		
		
		//JPanel panelbtn = null ;
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
		
		JPanel panelbtn = new JPanel();
		panelbtn.setBounds(44, 507, 568, 124);
		layeredPane.add(panel1, "name_1555880615500");
		//frame.getContentPane().add(panelbtn);
		panelbtn.setLayout(null);
		
		JButton btnNewButton = new JButton("Panel1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel1);
				layeredPane.add(panelbtn);
				layeredPane.repaint();
				layeredPane.revalidate();

			}
		});
		btnNewButton.setBounds(25, 30, 89, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPanel = new JButton("Panel2");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnPanel.setBounds(157, 33, 89, 29);
		frame.getContentPane().add(btnPanel);
		
		JButton btnNewButton_1_1 = new JButton("Panel3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel3);
			
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_1.setBounds(296, 33, 89, 29);
		frame.getContentPane().add(btnNewButton_1_1);
		

		
		JButton btnNewButton_2 = new JButton("Display");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1;
				if(chckbxNewCheckBox.isSelected())
					s1="Have Suppliments for Bone strength ,";
				else
					s1="";
				String s2;
				if(chckbxNewCheckBox_1.isSelected())
					s2="Omega 3 Tablets daily twice ,";
				else
					s2="";
				String s3;
				if(chckbxNewCheckBox_1_1.isSelected())
					s3="Nutrishake ,";
				else
					s3="";
				String s4;
				if(chckbxNewCheckBox_1_1_1.isSelected())
					s4="Vitamins intake ,";
				else
					s4="";
				String s5;
				if(chckbxNewCheckBox_1_1_1_1 .isSelected())
					s5="Proteins intake";
				else
					s5="";
				lblNewLabel_2.setText("Diet : "+s1+s2+s3+s4+s5);
			}
		});
		btnNewButton_2.setBounds(37, 33, 89, 23);
		panelbtn.add(btnNewButton_2);
	}
}

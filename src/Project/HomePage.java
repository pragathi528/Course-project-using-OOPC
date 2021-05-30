package Project;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frmHrapHomeoClinic;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmHrapHomeoClinic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmHrapHomeoClinic = new JFrame();
		frmHrapHomeoClinic.getContentPane().setBackground(Color.PINK);
		frmHrapHomeoClinic.getContentPane().setForeground(Color.WHITE);
		frmHrapHomeoClinic.setTitle("HOME PAGE");
		frmHrapHomeoClinic.setBounds(100, 100, 700, 453);
		frmHrapHomeoClinic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHrapHomeoClinic.getContentPane().setLayout(null);
		frmHrapHomeoClinic.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/8.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(211, 77, 291, 217);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HRAP HOMEO CLINIC");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(174, 11, 350, 55);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New Patient?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new DoctorsList();
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(110, 322, 175, 42);
		frmHrapHomeoClinic.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOCTOR'S LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new DoctorLoginPage();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(403, 321, 185, 44);
		frmHrapHomeoClinic.getContentPane().add(btnNewButton_1);
	}
}
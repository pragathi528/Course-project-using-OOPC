package Project;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class DoctorsList {

	private JFrame frmHrapHomeoClinic;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsList window = new DoctorsList();
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
	public DoctorsList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHrapHomeoClinic = new JFrame("HRAP HOMEO CLINIC");
		frmHrapHomeoClinic.getContentPane().setBackground(Color.PINK);
		frmHrapHomeoClinic.getContentPane().setLayout(null);
		frmHrapHomeoClinic.setVisible(true);
		String name;
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/p3.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(61, 70, 188, 189);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dr.Sharath");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(100, 270, 98, 31);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("OP:10am-1pm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(87, 313, 111, 31);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new PatientDetailsPage1("Dr.Sharath");
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(87, 355, 89, 23);
		frmHrapHomeoClinic.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/doc.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(284, 70, 188, 192);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dr.Sridhar");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(329, 273, 98, 24);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("OP:10am-1:00pm");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(315, 313, 128, 31);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new PatientDetailsPage1("Dr.Sridhar");
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(338, 355, 89, 23);
		frmHrapHomeoClinic.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("DOCTOR'S AVAILABLE");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_6.setBounds(258, 11, 225, 30);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/p2.jpeg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img2));
		lblNewLabel_7.setBounds(493, 70, 181, 192);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Dr.Radhika");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_8.setBounds(538, 275, 109, 21);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("OP:9:30am-2:00pm");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(514, 323, 155, 21);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("BOOK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new PatientDetailsPage1("Dr.Radhika");
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(538, 355, 89, 23);
		frmHrapHomeoClinic.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_10 = new JLabel("M.D. (Hom) Gynaeic");
		lblNewLabel_10.setBounds(538, 304, 109, 21);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("M.D. (Hom)");
		lblNewLabel_10_1.setBounds(339, 304, 89, 21);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("M.D. (Hom)");
		lblNewLabel_10_1_1.setBounds(100, 304, 89, 21);
		frmHrapHomeoClinic.getContentPane().add(lblNewLabel_10_1_1);
		
		JButton btnBack = new JButton("HOME");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHrapHomeoClinic.setVisible(false);
				new HomePage();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 17, 89, 23);
		frmHrapHomeoClinic.getContentPane().add(btnBack);
		
		
		//frmHrapHomeoClinic.getContentPane().add(button);
		frmHrapHomeoClinic.setTitle("HRAP HOMEO CLINIC");
		frmHrapHomeoClinic.setBounds(100, 100, 759, 452);
		frmHrapHomeoClinic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	
	}
}
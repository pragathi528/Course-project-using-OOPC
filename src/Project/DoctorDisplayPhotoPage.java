package Project;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorDisplayPhotoPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorDisplayPhotoPage window = new DoctorDisplayPhotoPage();
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
	public DoctorDisplayPhotoPage() {
		initialize();
	}

	String docname;
	public DoctorDisplayPhotoPage(String docname) {
		this.docname=docname;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Welcome Doctor :"+docname);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(176, 47, 317, 24);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 603, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel_1 = new JLabel("HRAP HOMEO CLINIC");
		if(docname.equalsIgnoreCase("sridhar")) {
		Image img1=new ImageIcon(this.getClass().getResource("/doc.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(168, 93, 208, 190);
		frame.getContentPane().add(lblNewLabel_1);}
		else if(docname.equalsIgnoreCase("sharath")) {
			Image img1=new ImageIcon(this.getClass().getResource("/p3.jpeg")).getImage();
			lblNewLabel_1.setIcon(new ImageIcon(img1));
			lblNewLabel_1.setBounds(168, 93, 208, 190);
			frame.getContentPane().add(lblNewLabel_1);
		}
		else if(docname.equalsIgnoreCase("radhika")) {
			Image img1=new ImageIcon(this.getClass().getResource("/p2.jpeg")).getImage();
			lblNewLabel_1.setIcon(new ImageIcon(img1));
			lblNewLabel_1.setBounds(168, 93, 208, 190);
			frame.getContentPane().add(lblNewLabel_1);
		}
		JButton btnNewButton = new JButton("Next>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PatientLoginPage(docname);
			}
		});
		btnNewButton.setBounds(439, 319, 89, 38);
		frame.getContentPane().add(btnNewButton);
	}
}

package Project;



import java.awt.event.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;

import javax.swing.*;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Window;

class Details implements Serializable{
	private String user,pwd;
	Details(String user,String pwd){
		this.user=user;
		this.pwd=pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return user;
	}
}
public class DoctorLoginPage {

	JFrame frame;
	private JTextField textField;
	private static JLabel icon1;
	private static JLabel icon2;
	FileInputStream fin;
	ObjectInputStream ois;
	FileOutputStream fout;
	ObjectOutputStream oos;
	File file;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorLoginPage window = new DoctorLoginPage();
					window.frame.setVisible(true);
					
					icon2.setVisible(false);
					icon1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DoctorLoginPage() {
		initialize();
		this.icon1.setVisible(true);
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
		ArrayList<Details> al = new ArrayList<Details>();
		JLabel lblNewLabel_1 = new JLabel("Doctor Login");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_1.setBounds(155, 11, 145, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(49, 73, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(49, 114, 72, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(155, 65, 192, 30);
		frame.getContentPane().add(textField);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(155,106,192,30);
		frame.getContentPane().add(passwordField);
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=textField.getText();
				String pwd=passwordField.getText();
				al.add(new Details(user,pwd));
				textField.setText("");
				passwordField.setText("");
					try {
						file=new File("project.txt");
						if(file.exists()) {
							oos=new ObjectOutputStream(new FileOutputStream(file,true)) {
								protected void writeStreamHeader() throws IOException{
									reset();
								}
							};
						}
						else
							oos=new ObjectOutputStream(new FileOutputStream(file));
						     oos.writeObject(al);
						JOptionPane.showMessageDialog(frame,"Registration Successfull");
						al.clear();
						oos.close();
			}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(frame,"Registration unsucessfull");	
				}
			}
		});
		btnRegister.setBounds(66, 206, 95, 30);
		frame.getContentPane().add(btnRegister);
		
		JButton btnPassword = new JButton("Login");
		btnPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String user=textField.getText();
				//String pwd=passwordField.getText();
				boolean flag = false;
				try {
					fin = new FileInputStream("project.txt");
					ois= new ObjectInputStream(fin);
					ArrayList<Details> al1;
					String pwd = passwordField.getText();
					String user = textField.getText();
					try {
						
					while((al1=(ArrayList)ois.readObject())!=null){
						Details e1 = al1.get(0);
						if(pwd.equals(e1.getPwd())&&user.equalsIgnoreCase(e1.getName())){
							//System.out.println("1");
							flag = true;
							break;
						}
					}
				}
						
					catch(EOFException a) {
					}
					//System.out.println(flag);
					if(flag==true){
						JOptionPane.showMessageDialog(frame,"Login Successfull:)");
						frame.setVisible(false);
						DoctorDisplayPhotoPage a=new DoctorDisplayPhotoPage(user);

					}
					else{
						//System.out.println("2");
						JOptionPane.showMessageDialog(frame,"Login Failed");
					}
					passwordField.setText("");
					textField.setText("");
				} catch(Exception er){
					er.printStackTrace();
				}	
			}
		});
		btnPassword.setBounds(267, 206, 95, 30);
		frame.getContentPane().add(btnPassword);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBounds(155, 143, 125, 30);
		chckbxNewCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0); 
					icon1.setVisible(false);
					icon2.setVisible(true);
				}
				else {
					passwordField.setEchoChar('*'); 
					icon2.setVisible(false);
					icon1.setVisible(true);
				}
			}
			
		});
		frame.getContentPane().add(chckbxNewCheckBox);
		
		icon1 = new JLabel("");
		icon1.setIcon(new ImageIcon("C:\\Users\\AREEFA\\eclipse-workspace\\18K41A0505\\Assignment\\images\\eye9.png"));
		icon1.setBounds(357, 105, 46, 23);
		icon1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				icon2.setVisible(true);
				icon1.setVisible(false);
				
				passwordField.setEchoChar('*'); 
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.getContentPane().add(icon1);
		
		icon2 = new JLabel("");
		
		icon2.setIcon(new ImageIcon("C:\\Users\\AREEFA\\eclipse-workspace\\18K41A0505\\Assignment\\images\\in9.png"));
		icon2.setBounds(357, 105, 46, 23);
		icon2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				icon1.setVisible(false);
				icon2.setVisible(true);
				passwordField.setEchoChar((char)0); 
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.getContentPane().add(icon2);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new HomePage();
			}
		});
		btnHome.setBackground(Color.PINK);
		btnHome.setBounds(10, 11, 81, 30);
		frame.getContentPane().add(btnHome);
		
		
		
		
	}

}

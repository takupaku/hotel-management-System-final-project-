package GrandVile;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;




import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class logIn {
	
	//connect to database
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;


	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logIn window = new logIn();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public logIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(27, 62, 81, 27);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(27, 110, 81, 23);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(159, 67, 110, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					 //add database
					conn=mySqlConnect.ConnectDB();
					String Sql="Select * from reservations where Name =? and Password = ?";
					
					try {
						 
						 
						
						pst=conn.prepareStatement(Sql);
						pst.setString(1, textField.getText());
						pst.setString(2, passwordField.getText());
						rs=pst.executeQuery();
						if(rs.next()){
						JOptionPane.showMessageDialog(null,"welcome to Grand Ville!!");
						
						JointTwoPage.main(null);
						}
						
						else
						{JOptionPane.showMessageDialog(null,"Invalid username or password","Access denied",JOptionPane.ERROR_MESSAGE);
						
					
				}
						}catch(Exception exc)
					{
				     JOptionPane.showMessageDialog(null, exc);
					}
					
					if(textField.getText().isEmpty()||passwordField.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter the fields");
					}
					
				}
			}
		});
		passwordField.setBounds(159, 113, 110, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 //add database
				conn=mySqlConnect.ConnectDB();
				String Sql="Select * from reservations where Name =? and Password = ?";
				
				try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					rs=pst.executeQuery();
					if(rs.next()){
					JOptionPane.showMessageDialog(null,"welcome to Grand Ville!!");
					
					JointTwoPage.main(null);
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Invalid username or password","Access denied",JOptionPane.ERROR_MESSAGE);
					
				
			}
					}catch(Exception exc)
				{
			     JOptionPane.showMessageDialog(null, exc);
				}
				//enter fields
				if(textField.getText().isEmpty()||passwordField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter the fields");
				}
				 
			}
		});
		btnNewButton.setBounds(19, 179, 89, 23);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Home");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.main(null);
			}
		});
		btnExit.setBounds(161, 179, 89, 23);
		frmLogin.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon("H:\\logincover.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 249);
		frmLogin.getContentPane().add(lblNewLabel_2);
	}
}

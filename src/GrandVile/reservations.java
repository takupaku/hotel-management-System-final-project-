package GrandVile;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class reservations {
	
	//database
			Connection conn=null;
			PreparedStatement pst=null;

	private JFrame frmReservation;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservations window = new reservations();
					window.frmReservation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reservations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReservation = new JFrame();
		frmReservation.setTitle("Reservation");
		frmReservation.setBounds(100, 100, 750, 500);
		frmReservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReservation.getContentPane().setLayout(null);
		
		JLabel lblReservation = new JLabel("reServation");
		lblReservation.setForeground(Color.WHITE);
		lblReservation.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblReservation.setBounds(35, 11, 343, 52);
		frmReservation.getContentPane().add(lblReservation);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(35, 84, 140, 26);
		frmReservation.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(35, 113,  91, 26);
		frmReservation.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblPleaseEnterThe = new JLabel("Additional information:");
		lblPleaseEnterThe.setBackground(Color.WHITE);
		lblPleaseEnterThe.setForeground(Color.BLACK);
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblPleaseEnterThe.setBounds(35, 169, 285, 26);
		frmReservation.getContentPane().add(lblPleaseEnterThe);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(35, 208, 91, 26);
		frmReservation.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 150, 248, 8);
		frmReservation.getContentPane().add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Email id");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(35, 245, 140, 26);
		frmReservation.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nationality");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(35, 282,  140, 26);
		frmReservation.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("National id");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_5.setBounds(35, 319,  140, 26);
		frmReservation.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(143, 89,140, 20);
		frmReservation.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 121, 140, 20);
		frmReservation.getContentPane().add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 213, 140, 20);
		frmReservation.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 250, 140, 20);
		frmReservation.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select nationality", "American", "Bangladeshi", "Chinease", "English", "French", "German", "Italian", "Indian", "Japanease", "Korean", "Malaysian", "Pakistani"}));
		comboBox.setBounds(143, 287, 140, 20);
		frmReservation.getContentPane().add(comboBox);
		
		JLabel lblNumbersOnly = new JLabel("Numbers only");
		lblNumbersOnly.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNumbersOnly.setForeground(Color.WHITE);
		lblNumbersOnly.setBounds(305, 326, 102, 14);
		frmReservation.getContentPane().add(lblNumbersOnly);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					conn=mySqlConnect.ConnectDB();
					String Sql="Insert into reservations(Name,Password,Age,Email_id,Nationality,National_id) values (?,?,?,?,?,?)";
					
					//add try and catch block
					
	try {
						 
						 
						
						pst=conn.prepareStatement(Sql);
						pst.setString(1, textField.getText());
						pst.setString(2, passwordField.getText());
						pst.setString(3, textField_2.getText());
						pst.setString(4, textField_3.getText());
						String value=comboBox.getSelectedItem().toString();//for combobox
						pst.setString(5, value);
						pst.setString(6, textField_4.getText());
						//pst.setString(7, textField_6.getText());
						pst.execute();
						JOptionPane.showMessageDialog(null,"data saved successfully");
						
						
			}catch(Exception exc)
					{
				    // JOptionPane.showMessageDialog(null, exc);
					}

	if(textField.getText().isEmpty()||passwordField.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty())
	{
		JOptionPane.showMessageDialog(null, "Please enter the fields");
	}
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) {
				
				char c=evt.getKeyChar();
				if(!(Character.isDigit(c) ||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)))
						{
					Toolkit.getDefaultToolkit().beep();     
					        evt.consume();
						}
			}
		});
		textField_4.setBounds(143, 324, 140, 20);
		frmReservation.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				conn=mySqlConnect.ConnectDB();
				String Sql="Insert into reservations(Name,Password,Age,Email_id,Nationality,National_id) values (?,?,?,?,?,?)";
				
				//add try and catch block
				
try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					String value=comboBox.getSelectedItem().toString();//for combobox
					pst.setString(5, value);
					pst.setString(6, textField_4.getText());
					//pst.setString(7, textField_6.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null,"data saved successfully");
					
					
		}catch(Exception exc)
				{
			    // JOptionPane.showMessageDialog(null, exc);
				}

if(textField.getText().isEmpty()||passwordField.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty())
{
	JOptionPane.showMessageDialog(null, "Please enter the fields");
}
			}
		});
		btnNewButton.setBounds(37, 384, 89, 23);
		frmReservation.getContentPane().add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainPage.main(null);
			}
		});
		btnHome.setBounds(163, 384, 89, 23);
		frmReservation.getContentPane().add(btnHome);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setIcon(new ImageIcon("H:\\reservationCover.jpg"));
		lblNewLabel_6.setBounds(0, 0, 724, 449);
		frmReservation.getContentPane().add(lblNewLabel_6);
		
		
	}
}

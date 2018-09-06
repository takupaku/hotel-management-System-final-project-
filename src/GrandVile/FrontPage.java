package GrandVile;

import java.awt.EventQueue;

import javax.swing.border.LineBorder;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
public class FrontPage {
	
	//database
		Connection conn=null;
		PreparedStatement pst=null;


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
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
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0,15));
		//panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(134, 37, 328, 355);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPenthhouse = new JLabel("Penthouse");
		lblPenthhouse.setForeground(Color.WHITE);
		lblPenthhouse.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblPenthhouse.setBounds(10, 27, 91, 26);
		panel.add(lblPenthhouse);
		
		JLabel lblSuit = new JLabel("Suit");
		lblSuit.setForeground(Color.WHITE);
		lblSuit.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblSuit.setBounds(10, 64, 91, 26);
		panel.add(lblSuit);
		
		JLabel lblFamilyroom = new JLabel("Family Room");
		lblFamilyroom.setForeground(Color.WHITE);
		lblFamilyroom.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblFamilyroom.setBounds(10, 101, 91, 26);
		panel.add(lblFamilyroom);
		
		JLabel lblStandardRoom = new JLabel("Standard Room");
		lblStandardRoom.setForeground(Color.WHITE);
		lblStandardRoom.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblStandardRoom.setBounds(10, 138, 112, 26);
		panel.add(lblStandardRoom);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 226, 246, 2);
		panel.add(separator);
		
		JLabel lblService = new JLabel("service");
		lblService.setForeground(Color.WHITE);
		lblService.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblService.setBounds(10, 258, 46, 14);
		panel.add(lblService);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select service", "gymnast", "laundry", "swimming"}));
		comboBox.setBounds(10, 294, 112, 20);
		panel.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tax");
		chckbxNewCheckBox.setBounds(159, 293, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblSingleRoom = new JLabel("Single Room");
		lblSingleRoom.setForeground(Color.WHITE);
		lblSingleRoom.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblSingleRoom.setBounds(10, 180, 91, 26);
		panel.add(lblSingleRoom);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setForeground(Color.WHITE);
		lblHours.setBounds(163, 232, 46, 14);
		panel.add(lblHours);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner.setBounds(210, 32, 46, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_1.setBounds(210, 69, 46, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_2.setBounds(210, 106, 46, 20);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_3.setBounds(210, 143, 46, 20);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_4.setBounds(210, 185, 46, 20);
		panel.add(spinner_4);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_6.setBounds(159, 257, 97, 20);
		panel.add(spinner_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(134, 450, 328, 164);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cost of rooms");
		lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 21, 107, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblCostOfServices = new JLabel("Cost of services");
		lblCostOfServices.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblCostOfServices.setBounds(10, 57, 107, 25);
		panel_1.add(lblCostOfServices);
		
		JLabel lblNights = new JLabel("Nights");
		lblNights.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblNights.setBounds(10, 93, 107, 25);
		panel_1.add(lblNights);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_3.setBounds(141, 21, 134, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label.setBounds(141, 60, 134, 20);
		panel_1.add(label);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_5.setBounds(141, 96, 134, 20);
		panel_1.add(spinner_5);
		
		JLabel lblNewLabel_1 = new JLabel("EXPLORE rooms and services..............");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 26));
		lblNewLabel_1.setBounds(850, 0, 492, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,0,0,15));
		//panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(1099, 450, 169, 164);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(521, 450, 305, 164);
		frame.getContentPane().add(panel_3);
		//panel_3.setBackground(new Color(0,0,0,15));
		
		JLabel lblTotal = new JLabel("Sub Total");
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblTotal.setBounds(10, 56, 107, 25);
		panel_3.add(lblTotal);
		
		JLabel lblSubTotal = new JLabel("Total");
		lblSubTotal.setForeground(Color.BLACK);
		lblSubTotal.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSubTotal.setBounds(10, 92, 107, 25);
		panel_3.add(lblSubTotal);
		
		JLabel lblFinal = new JLabel("Final Budget");
		lblFinal.setForeground(Color.BLACK);
		lblFinal.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblFinal.setBounds(10, 128, 107, 25);
		panel_3.add(lblFinal);
		
		JLabel label_4 = new JLabel("0");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(141, 21, 134, 20);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("0");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(141, 60, 134, 20);
		panel_3.add(label_5);
		
		JLabel label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(141, 99, 134, 20);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBounds(141, 133, 134, 20);
		panel_3.add(label_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(Color.BLACK);
		lblTax.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblTax.setBounds(10, 20, 107, 25);
		panel_3.add(lblTax);
		
		
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//connect database
				conn=mySqlConnect.ConnectDB();
				String Sql="Insert into inputrooms(sub_total,total,final) values (?,?,?)";
				
				 //total for penthouse
				double penthouse = (Double) spinner.getValue();
				//double penthouse= Double.parseDouble(textField.getText());
				double ipenthouse=10000;
				double Penthouse;
				Penthouse= (penthouse * ipenthouse);
				String pRoom = String.format("%.2f",+Penthouse );
				lblNewLabel_3.setText(pRoom);
				
				
				
				//total for suit
				double suit = (Double) spinner_1.getValue();
				//double suit= Double.parseDouble(textField_1.getText());
				double isuit=5000;
				double Suit;
				Suit= (suit * isuit);
				String cbRoom = String.format("%.2f",Suit+Penthouse );
				lblNewLabel_3.setText(cbRoom);
				
				//total for Family room
				double familyRoom = (Double) spinner_2.getValue();
				//double familyRoom= Double.parseDouble(textField_2.getText());
				double ifamilyRoom=4000;
				double FamilyRoom;
				FamilyRoom= (familyRoom * ifamilyRoom);
				String abRoom = String.format("%.2f",FamilyRoom+Suit+Penthouse );
				lblNewLabel_3.setText(abRoom);
				
				//total for standard room
				double standardRoom = (Double) spinner_3.getValue();
				//double standardRoom= Double.parseDouble(textField_3.getText());
				double istandardRoom=2000;
				double StandardRoom;
				StandardRoom= (standardRoom * istandardRoom);
				String efRoom = String.format("%.2f",StandardRoom+FamilyRoom+Suit+Penthouse );
				lblNewLabel_3.setText(efRoom);
				
				//total for single room
				double singleRoom = (Double) spinner_4.getValue();
				//double singleRoom= Double.parseDouble(textField_4.getText());
				double isingleRoom=1500;
				double SingleRoom;
				SingleRoom= (singleRoom * isingleRoom);
				String ghRoom = String.format("%.2f",SingleRoom+StandardRoom+FamilyRoom+Suit+Penthouse);
				lblNewLabel_3.setText(ghRoom);
				
				//services
				double service = (Double) spinner_6.getValue();
				//double service= Double.parseDouble(textField_5.getText());
				double gymnast=800 *service;
				double laundry=320 *service;
				double swimming=1200 *service;
				
				if (comboBox.getSelectedItem().equals("gymnast"))
				{
					String cgymnast =String.format("%.2f", gymnast);
					label.setText(cgymnast);
					
				}
				
				if (comboBox.getSelectedItem().equals("laundry"))
				{
					String claundry =String.format("%.2f", laundry);
					label.setText(claundry);
					
				}
				
				if (comboBox.getSelectedItem().equals("swimming"))
				{
					String cswimming =String.format("%.2f", swimming);
					label.setText(cswimming);
					
				}
				
				if (comboBox.getSelectedItem().equals("select a drink"))
				{
					
					label.setText("0");
					
				}
				
				 //--------------------end service----------------
				
				
				
				//======================TAX RATE=================
				
				
				double cTotal1= Double.parseDouble(lblNewLabel_3.getText());
				double cTotal2= Double.parseDouble(label.getText());
				
				double AllTotal = (cTotal1+cTotal2)/100;
				
				if(chckbxNewCheckBox.isSelected())
				{
					String iTotal = String.format("%.2f",AllTotal);
					label_4.setText(iTotal);
					
				}
				
				//==========================Total====================
				
				
				double cTotal4 =Double.parseDouble(label_4.getText());
				
				double subTotal=(cTotal1+cTotal2);
				String isubTotal=String.format(" %.2f", subTotal);
				label_5.setText(isubTotal);
				
				double allTotal=(cTotal1+cTotal2+cTotal4);
				String iTotal=String.format(" %.2f", allTotal);
				label_1.setText(iTotal);
				
				double nights = (Double) spinner_5.getValue();
				//double nights=Double.parseDouble(textField_7.getText());
				double allfinal=allTotal*nights;
				String cbfinal = String.format("%.2f",allfinal );
				label_2.setText(cbfinal);
				
				
				 try {
					 
					 
					
					pst=conn.prepareStatement(Sql);
					pst.setString(1, label_5.getText());
					pst.setString(2, label_1.getText());
					pst.setString(3, label_2.getText());
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Rooms and services Successfully reserved");
					
					
		}catch(Exception exc)
				{
			     JOptionPane.showMessageDialog(null, exc);
				}
				 
				
				
				 
				 
				 
				
				
			}
		});
		btnNewButton.setBounds(10, 56, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//textField.setText("0");
				//textField_1.setText("0");
				//textField_2.setText("0");
				//textField_3.setText("0");
				//textField_4.setText("0");
				spinner.setValue(((SpinnerNumberModel) spinner.getModel()).getMinimum());
				spinner_1.setValue(((SpinnerNumberModel) spinner_1.getModel()).getMinimum());
				spinner_2.setValue(((SpinnerNumberModel) spinner_2.getModel()).getMinimum());
				spinner_3.setValue(((SpinnerNumberModel) spinner_3.getModel()).getMinimum());
				spinner_4.setValue(((SpinnerNumberModel) spinner_4.getModel()).getMinimum());
				spinner_5.setValue(((SpinnerNumberModel) spinner_5.getModel()).getMinimum());
				spinner_6.setValue(((SpinnerNumberModel) spinner_6.getModel()).getMinimum());
				lblNewLabel_3.setText("0");
				label.setText("0");
				comboBox.setSelectedIndex(0);
				chckbxNewCheckBox.setSelected(false);
				//textField_7.setText("0");
				label_4.setText("0");
				label_5.setText("0");
				label_1.setText("0");
				label_2.setText("0");
			}
		});
		btnNewButton_1.setBounds(10, 90, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JointTwoPage.main(null);
			}
		});
		btnNewButton_2.setBounds(10, 124, 89, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnFood = new JButton("Food ");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FoodPackage.main(null);
			}
		});
		btnFood.setBounds(10, 22, 89, 23);
		panel_2.add(btnFood);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon("H:\\Untitled-1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1352, 638);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		
		
	}
}

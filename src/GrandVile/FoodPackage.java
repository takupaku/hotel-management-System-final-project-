package GrandVile;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class FoodPackage {

	Connection conn = null;
	PreparedStatement pst = null;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodPackage window = new FoodPackage();
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
	public FoodPackage() {
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

		JLabel lblNewLabel = new JLabel("DISCOVER food and beverage.............");
		lblNewLabel.setBounds(43, 38, 465, 49);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 26));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(806, 115, 295, 512);
		panel_1.setBackground(new Color(0, 0, 0, 30));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Food package");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 11, 102, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setForeground(Color.WHITE);
		lblBreakfast.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblBreakfast.setBounds(10, 36, 75, 14);
		panel_1.add(lblBreakfast);

		JLabel lblNewLabel_5 = new JLabel("breakfast sandwich");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(10, 75, 117, 14);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("bread and butter");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_6.setBounds(10, 100, 102, 14);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("earl gray");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_7.setBounds(10, 125, 75, 14);
		panel_1.add(lblNewLabel_7);

		JLabel lblMeal_1 = new JLabel("meal");
		lblMeal_1.setForeground(Color.WHITE);
		lblMeal_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblMeal_1.setBounds(10, 185, 46, 14);
		panel_1.add(lblMeal_1);

		JLabel lblNewLabel_8 = new JLabel("chinese rice");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_8.setBounds(10, 218, 75, 14);
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("chinease vegetable");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_9.setBounds(10, 243, 117, 14);
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("milk shake");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_10.setBounds(10, 268, 75, 14);
		panel_1.add(lblNewLabel_10);

		JLabel lblDinner = new JLabel("dinner");
		lblDinner.setForeground(Color.WHITE);
		lblDinner.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblDinner.setBounds(10, 344, 46, 14);
		panel_1.add(lblDinner);

		JLabel lblNewLabel_11 = new JLabel("burger");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_11.setBounds(10, 369, 46, 14);
		panel_1.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("sausage");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_12.setBounds(10, 394, 46, 14);
		panel_1.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("expresso");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_13.setBounds(10, 419, 75, 14);
		panel_1.add(lblNewLabel_13);

		JLabel lblNewLabel_15 = new JLabel("450 tk");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_15.setBounds(137, 76, 102, 14);
		panel_1.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("250 tk");
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_16.setBounds(137, 101, 102, 14);
		panel_1.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("120 tk");
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_17.setBounds(137, 126, 46, 14);
		panel_1.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("1000 tk");
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_18.setBounds(127, 219, 66, 14);
		panel_1.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("620 tk");
		lblNewLabel_19.setForeground(Color.WHITE);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_19.setBounds(127, 244, 102, 14);
		panel_1.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("220 tk");
		lblNewLabel_20.setForeground(Color.WHITE);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_20.setBounds(127, 269, 66, 14);
		panel_1.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("300 tk");
		lblNewLabel_21.setForeground(Color.WHITE);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_21.setBounds(127, 370, 46, 14);
		panel_1.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("200 tk");
		lblNewLabel_22.setForeground(Color.WHITE);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_22.setBounds(127, 395, 46, 14);
		panel_1.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("100 tk");
		lblNewLabel_23.setForeground(Color.WHITE);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_23.setBounds(127, 420, 46, 14);
		panel_1.add(lblNewLabel_23);

		JLabel lblNewLabel_14 = new JLabel("number of pack");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(10, 145, 86, 24);
		panel_1.add(lblNewLabel_14);

		JLabel label_8 = new JLabel("number of pack");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_8.setBounds(10, 293, 86, 24);
		panel_1.add(label_8);

		JLabel label_9 = new JLabel("number of pack");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_9.setBounds(10, 444, 86, 24);
		panel_1.add(label_9);

		JLabel lblNewLabel_3 = new JLabel("Days");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(10, 479, 86, 14);
		panel_1.add(lblNewLabel_3);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner.setBounds(137, 151, 36, 20);
		panel_1.add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_1.setBounds(137, 296, 36, 20);
		panel_1.add(spinner_1);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_2.setBounds(137, 445, 34, 20);
		panel_1.add(spinner_2);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0.0, 0.0, 15.0, 1.0));
		spinner_3.setBounds(137, 477, 36, 20);
		panel_1.add(spinner_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(516, 425, 132, -211);
		frame.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(616, 413, 158, 214);
		panel_3.setBackground(new Color(0, 0, 0, 30));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(379, 522, 203, 105);
		frame.getContentPane().add(panel);

		JLabel label_3 = new JLabel("Total");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_3.setBounds(10, 26, 79, 34);
		panel.add(label_3);

		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(99, 40, 86, 20);
		panel.add(label_5);

		JLabel lblFinal = new JLabel("Final Budget");
		lblFinal.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblFinal.setBounds(10, 73, 79, 14);
		panel.add(lblFinal);

		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(99, 71, 86, 20);
		panel.add(label_7);

		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// database connect
				conn = mySqlConnect.ConnectDB();
				String Sql = "Insert into inputfoods(total,final) values (?,?)";

				// -------------------Food----------------------

				// total for breakfast
				double breakfast = (Double) spinner.getValue();
				// double breakfast= Double.parseDouble(textField_2.getText());
				double ibreakfast = 820;
				double Breakfast;
				Breakfast = (breakfast * ibreakfast);
				String pfood = String.format("%.2f", +Breakfast);
				label_5.setText(pfood);

				// total for meal
				double meal = (Double) spinner_1.getValue();
				// double meal= Double.parseDouble(textField_6.getText());
				double imeal = 1840;
				double Meal;
				Meal = (meal * imeal);
				String cbfood = String.format("%.2f", Meal + Breakfast);
				label_5.setText(cbfood);

				// total for dinner
				double dinner = (Double) spinner_2.getValue();
				// double dinner= Double.parseDouble(textField_7.getText());
				double idinner = 600;
				double Dinner;
				Dinner = (dinner * idinner);
				String abfood = String.format("%.2f", Meal + Breakfast + Dinner);
				label_5.setText(abfood);

				double cTotal1 = Double.parseDouble(label_5.getText());
				double nights = (Double) spinner_3.getValue();
				// double nights=Double.parseDouble(textField.getText());

				String iTotal = String.format(" %.2f", cTotal1);
				label_5.setText(iTotal);

				double allfinal = cTotal1 * nights;
				String cbfinal = String.format("%.2f", allfinal);
				label_7.setText(cbfinal);

				try {
					if(!spinner.getValue().equals("0")||!spinner_1.getValue().equals("0")||!spinner_2.getValue().equals("0")||!spinner_3.getValue().equals("0"))
					{
						//JOptionPane.showMessageDialog(null, "Please enter the fields");
					}
					

					pst = conn.prepareStatement(Sql);
					pst.setString(1, label_5.getText());
					pst.setString(2, label_7.getText());

					pst.execute();
					JOptionPane.showMessageDialog(null, "Successfully reserved!!");

				} catch (Exception exc) {
					//JOptionPane.showMessageDialog(null, exc);
				}
				
				
				
				
				

			}
		});
		btnNewButton.setBounds(39, 69, 89, 23);
		panel_3.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// textField_2.setText("0");
				// textField_6.setText("0");
				// textField_7.setText("0");
				spinner.setValue(((SpinnerNumberModel) spinner.getModel()).getMinimum());
				spinner_1.setValue(((SpinnerNumberModel) spinner_1.getModel()).getMinimum());
				spinner_2.setValue(((SpinnerNumberModel) spinner_2.getModel()).getMinimum());
				spinner_3.setValue(((SpinnerNumberModel) spinner_3.getModel()).getMinimum());
				label_5.setText("0");
				label_7.setText("0");

			}
		});
		btnNewButton_1.setBounds(39, 115, 89, 23);
		panel_3.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JointTwoPage.main(null);
			}
		});
		btnNewButton_2.setBounds(39, 164, 89, 23);
		panel_3.add(btnNewButton_2);

		JButton btnRooms = new JButton("Rooms");
		btnRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FrontPage.main(null);
			}
		});
		btnRooms.setBounds(39, 24, 89, 23);
		panel_3.add(btnRooms);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("H:\\xpublic-new-york-penthouse-hotel-room-jpg-pagespee.jpg"));
		label_20.setBounds(0, 0, 1372, 649);
		frame.getContentPane().add(label_20);

	}
}

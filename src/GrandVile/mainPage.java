package GrandVile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class mainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
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
	public mainPage() {
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
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn.main(null);
			}
		});
		btnNewButton.setBounds(1197, 506, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reservation");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reservations.main(null);
			}
		});
		btnNewButton_1.setBounds(1197, 540, 106, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("GRAND ville");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Angsana New", Font.ITALIC, 66));
		lblNewLabel.setBounds(35, 30, 435, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Luxurious suits");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(36, 175, 222, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblDeliciousFoodPackage = new JLabel("Delicious Food package");
		lblDeliciousFoodPackage.setForeground(Color.WHITE);
		lblDeliciousFoodPackage.setFont(new Font("Angsana New", Font.ITALIC, 40));
		lblDeliciousFoodPackage.setBounds(35, 222, 339, 36);
		frame.getContentPane().add(lblDeliciousFoodPackage);
		
		JLabel lblDelightfulServices = new JLabel("Delightful services");
		lblDelightfulServices.setForeground(Color.WHITE);
		lblDelightfulServices.setFont(new Font("Angsana New", Font.ITALIC, 40));
		lblDelightfulServices.setBounds(35, 269, 298, 36);
		frame.getContentPane().add(lblDelightfulServices);
		
		JLabel label = new JLabel("Comfy suits with topmost environment, neat and clean aura, deliciouse");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Angsana New", Font.ITALIC, 29));
		label.setBounds(10, 494, 729, 36);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(" and healthy food made by our experianced chefs, come and enjoy,");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Angsana New", Font.ITALIC, 29));
		label_1.setBounds(10, 531, 606, 37);
		frame.getContentPane().add(label_1);
		
		JLabel lblWelcomeToHotel = new JLabel(" welcome to Hotel Grand Ville.");
		lblWelcomeToHotel.setVerticalAlignment(SwingConstants.TOP);
		lblWelcomeToHotel.setForeground(Color.WHITE);
		lblWelcomeToHotel.setFont(new Font("Angsana New", Font.ITALIC, 29));
		lblWelcomeToHotel.setBounds(10, 569, 606, 27);
		frame.getContentPane().add(lblWelcomeToHotel);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(1197, 574, 106, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("H:\\cover main.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1352, 638);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}

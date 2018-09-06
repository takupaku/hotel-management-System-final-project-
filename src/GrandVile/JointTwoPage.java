package GrandVile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JointTwoPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JointTwoPage window = new JointTwoPage();
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
	public JointTwoPage() {
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
		
		JButton btnBookRooms = new JButton("Reserve rooms");
		btnBookRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrontPage.main(null);
			}
		});
		btnBookRooms.setBounds(1157, 515, 162, 23);
		frame.getContentPane().add(btnBookRooms);
		
		JButton btnNewButton = new JButton("Food and beverage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FoodPackage.main(null);
			}
		});
		btnNewButton.setBounds(1157, 549, 162, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFhome = new JButton("Home");
		btnFhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.main(null);
			}
		});
		btnFhome.setBounds(1157, 587, 162, 23);
		frame.getContentPane().add(btnFhome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("H:\\TwoPageCover.jpg"));
		lblNewLabel.setBounds(0, 0, 1352, 638);
		frame.getContentPane().add(lblNewLabel);
	}

}

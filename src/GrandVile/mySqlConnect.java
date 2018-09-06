package GrandVile;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class mySqlConnect {
	
	Connection conn=null;
	//public static void main(String[] args) 
	
		// TODO Auto-generated method stub
		
		public static Connection ConnectDB() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelvilla","root","@sunrise@");
				//JOptionPane.showMessageDialog(null,"Connected to database");
				return conn;
			}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
			return null;
			
		}
		}

}

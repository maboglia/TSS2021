package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connessione {

	private static String URL = "jdbc:mysql://localhost:3306/Its2020";
	private static String USER = "Its2020";
	private static String PASS = "Its2020";
	
	//private static Connection conn = connetti();
	
	private static Connection connetti() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		return con;
		
	}
	
	public static Connection getConn() {
		return connetti();
	}
	
}

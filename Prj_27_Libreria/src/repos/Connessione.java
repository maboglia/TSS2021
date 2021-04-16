package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	//parametri di connessione
	private final String DB_URL = "jdbc:mysql://localhost:3306/Its2020";
	private final String USER = "Its2020";
	private final String PASS = "Its2020";
	
	//oggetto connessione
	private static Connection connessione;
	
	//istanza singleton
	private static Connessione conn = new Connessione();
	
	//costruttore privato!
	private  Connessione() {
		this.connetti();
	}
	//getter del singleton
	public static Connessione getConn() {
		return conn;
	}
	
	public static Connection getConnessione() {
		return connessione;
	}
	
	private void connetti() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connessione = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("siamo connessi :)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

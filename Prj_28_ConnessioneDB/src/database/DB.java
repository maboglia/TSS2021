package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	Connection connessione = null;
	Statement statement = null;
	ResultSet rs = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/Its2020";
	private final String USER = "Its2020";
	private final String PASS = "Its2020";
	
	public Connection getConnessione() {
		try {
			connessione = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("connesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Non CONNESSO");
		}
		return connessione;
	}
	
	public void stopConnessione() {
		try {
			connessione.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DB miodb = new DB();
		miodb.getConnessione();
		
		try {
			miodb.statement = miodb.connessione.createStatement();
			String query = "insert into studenti (nome, cognome) values ('pippo', 'pippi')";
			int i = miodb.statement.executeUpdate(query);
			
			System.out.println("inseriti " + i +" record");
			
			query = "select nome, cognome from studenti";
			
			miodb.rs = miodb.statement.executeQuery(query);
			
			while (miodb.rs.next()) {
				System.out.print(miodb.rs.getString("nome"));
				System.out.println(miodb.rs.getString("cognome"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

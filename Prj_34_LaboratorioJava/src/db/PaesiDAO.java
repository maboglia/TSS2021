package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaesiDAO {

	private Connection con;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	private String QUERY = "insert into paesi (name, capital, region, subregion, population, languages) "
			+ " VALUES(?,?,?,?,?,?)";
	
	public Map<String, String> paesiCapitali() throws SQLException{
		//List<Map<String, String>> pc = new ArrayList<>();
		Map<String, String> hm = new HashMap<>();
		con = Connessione.getConn();
		stat = con.createStatement();
		rs = stat.executeQuery("select name, capital from paesi");
		
		while (rs.next()) {
			hm.put(rs.getString("name"), rs.getString("capital"));
			

		}
		
		return hm;
		
				
	} 
	
	
	public void aggiungiPaese(String name,String  capital, String region, String subregion, long population, String languages) throws SQLException {
		
		con = Connessione.getConn();
		ps = con.prepareStatement(QUERY);
		
		ps.setString(1, name);
		ps.setString(2, capital);
		ps.setString(3, region);
		ps.setString(4, subregion);
		ps.setLong(5, population);
		ps.setString(6, languages);
		
		ps.execute();
		
		System.out.println(name + " aggiunto!");
		
	}
	
	
	
}

package repos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.sql.ResultSet;

import entities.Autore;

public class AutoreDAO implements AutoreIDAO {

	private Connessione c;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public void addAutore(Autore l) throws SQLException {
		this.ps = Connessione.getConnessione().prepareStatement(INSERT);
		this.ps.setString(1, l.getNome());
		this.ps.setString(2, l.getCognome());
		int i = this.ps.executeUpdate();
		System.out.println("Inseriti " + i  + " record") ;
	}

	
	@Override
	public Autore getAutore(int id) throws SQLException {
		this.ps = Connessione.getConnessione().prepareStatement(TROVA_UNO);
		this.ps.setInt(1, id);
		this.rs = this.ps.executeQuery();
		
		rs.next();
		Autore a = new Autore(rs.getInt("id"), rs.getString("nome"), rs.getString("cognome"));
				
		return a;

	}


	@Override
	public void updateAutore(Autore l) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAutore(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Autore> getAutori() throws SQLException {
		
		this.ps = Connessione.getConnessione().prepareStatement(TROVA_TUTTI);
		this.rs = this.ps.executeQuery();
		
		Map<Integer, Autore> autori = new HashMap<Integer, Autore>();
		
		while (rs.next()) {
			Autore a = new Autore(rs.getInt("id"), rs.getString("nome"), rs.getString("cognome"));
			autori.put(a.getId(), a);		
		}		
		return autori;
	}

}

package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Editore;
import entities.Libro;

public class LibroDAO implements LibroIDAO {

	private Connection conn = Connessione.getConnessione();
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	private EditoreDAOImpl editoreDAO = new EditoreDAOImpl();
	
	@Override
	public void addLibro(Libro l) throws SQLException {
		//connessione e ottenimento di PreparedStament
		ps = conn.prepareStatement(INSERT);
		ps.setString(1, l.getTitolo());
		ps.setInt(2, l.getPagine());
		ps.setDouble(3, l.getPrezzo());
		ps.setInt(4, l.getEditore_id());
		int i = ps.executeUpdate();
		System.out.println("Aggiunti " + i + " record alla tabella libro");

	}

	@Override
	public Libro getLibro(int id) throws SQLException {
		
		ps = conn.prepareStatement(TROVA_UNO);
		//rs = stat.executeQuery("SELECT * FROM libro where id = " + id);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		
		rs.next();
		Libro l = new Libro();
		l.setId(id);
		l.setTitolo(rs.getString("titolo"));
		l.setPagine(rs.getInt("pagine"));
		l.setPrezzo(rs.getDouble("prezzo"));
		l.setEditore_id(rs.getInt("editore_id"));
		Editore editore = editoreDAO.getById(rs.getInt("editore_id"));
		l.setEditore(editore);
		return l;
	}

	@Override
	public Map<Integer, Libro> getLibri() throws SQLException {
		
		Map<Integer, Libro> libri = new HashMap();
		
		stat = conn.createStatement();
		rs = stat.executeQuery(TROVA_TUTTI);
		
		while (rs.next()) {
			Libro l = new Libro();
			l.setId(rs.getInt("id"));
			l.setTitolo(rs.getString("titolo"));
			l.setPagine(rs.getInt("pagine"));
			l.setPrezzo(rs.getDouble("prezzo"));
			l.setEditore_id(rs.getInt("editore_id"));
			Editore e = editoreDAO.getById(rs.getInt("editore_id"));
			l.setEditore(e);
			
			libri.put(l.getId(), l);
		}
		
		return libri;
	}

	@Override
	public void updateLibro(Libro l) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		ps.setInt(1, l.getEditore_id());		
		ps.setInt(2, l.getPagine());
		ps.setDouble(3, l.getPrezzo());
		ps.setString(4, l.getTitolo());
		ps.setInt(5, l.getId());
		int i = ps.executeUpdate();
		System.out.println("Modificati " + i + " record nella tabella libro");		
	}

	@Override
	public void deleteLibro(int id) throws SQLException {
		ps = conn.prepareStatement(DELETE);
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println("Eliminato " + i +" record dalla tabella libro");
	}

}

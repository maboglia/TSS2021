package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Editore;

public class EditoreDAOImpl implements EditoreDAO {

	private Connection conn = Connessione.getConnessione();
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public Map<Integer, Editore> getAll() throws SQLException {
		Map<Integer, Editore> editori = new HashMap<>();
		
		this.stat = this.conn.createStatement();
		
		this.rs = this.stat.executeQuery(FIND_ALL);
		
		while (this.rs.next()) {
			Editore e = new Editore(this.rs.getInt("id"), this.rs.getString("nome"));
			editori.put(e.getId(), e);
		
		}
		
		return editori;
	}

	@Override
	public Editore getById(int id) throws SQLException {
		Editore e = null;
		
		this.stat = this.conn.createStatement();
		
		String query = FIND_ONE + id;
		
		this.rs = this.stat.executeQuery(query);
		
		this.rs.next();
		
		e = new Editore(this.rs.getInt("id"), this.rs.getString("nome"));
		
		return e;
		
		
	}

	@Override
	public void addEditore(Editore e) throws SQLException {
		ps = conn.prepareStatement("INSERT INTO editore (nome) values (?)");
		ps.setString(1, e.getNome());
		ps.executeUpdate();
		
	}

	@Override
	public void deleteEditore(Editore e) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEditore(Editore e) throws SQLException {
		// TODO Auto-generated method stub

	}

}

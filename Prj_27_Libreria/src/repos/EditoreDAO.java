package repos;

import java.sql.SQLException;
import java.util.Map;

import entities.Editore;

public interface EditoreDAO {

	String FIND_ALL = "SELECT * from editore";
	String FIND_ONE = "SELECT * FROM editore WHERE id = ";
	String DELETE = "DELETE FROM editore WHERE id = ";
//	String UPDATE = "UPDATE editore SET ";
//	String CREATE = "INSERT INTO editore (nome) VALUES (?) ";
	
	Map<Integer, Editore> getAll() throws SQLException;
	Editore getById(int id) throws SQLException;
	void addEditore(Editore e) throws SQLException;
	void deleteEditore(Editore e) throws SQLException;
	void updateEditore(Editore e) throws SQLException;
	
}

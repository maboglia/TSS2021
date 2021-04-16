package repos;

import java.sql.SQLException;
import java.util.Map;

import entities.Libro;

public interface LibroIDAO {

	//crud
	String INSERT = "INSERT INTO libro (titolo, pagine, prezzo, editore_id) values (?,?,?,?) ";

	String TROVA_TUTTI = "SELECT * from libro";
	String TROVA_UNO = "SELECT * FROM libro where id = ?";
	
	String UPDATE = "UPDATE libro set editore_id = ?, pagine = ?, prezzo = ?, titolo = ? where id = ?";
	
	String DELETE = "DELETE FROM libro where id = ?";
	
	void addLibro(Libro l) throws SQLException;
	Libro getLibro(int id) throws SQLException;
	Map<Integer, Libro> getLibri() throws SQLException;
	void updateLibro(Libro l) throws SQLException;
	void deleteLibro(int id) throws SQLException;
	
	
}

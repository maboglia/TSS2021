package repos;

import java.sql.SQLException;
import java.util.Map;

import entities.Autore;

public interface AutoreIDAO {

	//crud
	String INSERT = "INSERT INTO autore (nome, cognome) values (?,?) ";

	String TROVA_TUTTI = "SELECT * from autore";
	String TROVA_UNO = "SELECT * FROM autore where id = ?";
	
	String UPDATE = "UPDATE autore set nome = ?, cognome = ? where id = ?";
	
	String DELETE = "DELETE FROM autore where id = ?";
	
	void addAutore(Autore l) throws SQLException;
	Autore getAutore(int id) throws SQLException;
	Map<Integer, Autore> getAutori() throws SQLException;
	void updateAutore(Autore l) throws SQLException;
	void deleteAutore(int id) throws SQLException;
	
	
}

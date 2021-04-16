package libreria.services;

import java.util.List;

import libreria.entities.Libro;

public interface LibroIService {

	List<Libro> getLibri();
	Libro getLibro(int id);
	void addLibro(Libro l);
	void updateLibro(Libro l);
	void deleteLibro(int id);
	
}

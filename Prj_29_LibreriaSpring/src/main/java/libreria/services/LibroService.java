package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libro;
import libreria.repos.LibroIDAO;

@Service
public class LibroService implements LibroIService {

	@Autowired
	private LibroIDAO dao;//IOC
	
	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Libro getLibro(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void addLibro(Libro l) {
		// TODO Auto-generated method stub
		dao.save(l);
	}

	@Override
	public void updateLibro(Libro l) {
		// TODO Auto-generated method stub
		dao.save(l);
	}

	@Override
	public void deleteLibro(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}

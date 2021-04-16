package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Editore;
import libreria.repos.EditoreDAO;


@Service
public class EditoreServiceImpl implements EditoreService {

	@Autowired
	private EditoreDAO repo;
	
	@Override
	public List<Editore> getAll() {
		return repo.findAll();
	}

	@Override
	public Editore getOne(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void addEditore(Editore e) {
		repo.save(e);
	}

	@Override
	public void updEditore(Editore e) {
		repo.save(e);
	}

	@Override
	public void delEditore(int id) {
		repo.deleteById(id);
	}

}

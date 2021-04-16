package paesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paesi.dal.PaesiDAO;
import paesi.entities.Paese;

@Service
public class PaesiServiceImpl implements PaesiService {

	@Autowired
	private PaesiDAO repo;
	
	@Override
	public List<Paese> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Paese> getBySubRegion(String subregion) {
		return repo.findBySubregion(subregion);
	}

	@Override
	public Paese getPaese(String nome) {
		return repo.getPaese(nome);
	}

}

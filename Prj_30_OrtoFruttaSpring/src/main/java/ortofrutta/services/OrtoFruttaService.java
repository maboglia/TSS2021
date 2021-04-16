package ortofrutta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ortofrutta.entities.OrtoFrutta;
import ortofrutta.repos.OrtoFruttaDAO;

@Service
public class OrtoFruttaService implements OrtoFruttaIService {

	@Autowired
	private OrtoFruttaDAO db;
	
	
	@Override
	public OrtoFrutta getProdotto(int id) {
		return db.findById(id).get();
	}

	@Override
	public List<OrtoFrutta> getProdotti() {
		return db.findAll();
	}

	@Override
	public OrtoFrutta addProdotto(OrtoFrutta p) {
		return db.save(p);
	}

	@Override
	public OrtoFrutta updProdotto(OrtoFrutta p) {
		return db.save(p);
	}

	@Override
	public void delProdottoById(int id) {
		db.deleteById(id);
	}

	@Override
	public void delProdotto(OrtoFrutta p) {
		db.delete(p);
	}

}

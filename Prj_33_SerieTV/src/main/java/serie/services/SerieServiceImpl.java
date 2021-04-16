package serie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serie.dal.SerieDAO;
import serie.entities.Serie;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	private SerieDAO dao;
	
	@Override
	public Serie addSerie(Serie s) {
		
		return dao.save(s);
	}

	@Override
	public List<Serie> getAll() {
		
		return dao.findAll();
	}

	@Override
	public Serie getOneById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Serie updateSerie(Serie s) {
		
		return dao.save(s);
	}

	@Override
	public void deleteSerieById(int id) {
		dao.deleteById(id);

	}

}

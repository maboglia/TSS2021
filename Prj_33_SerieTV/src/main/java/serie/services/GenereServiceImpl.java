package serie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serie.dal.GenereDAO;
import serie.entities.Genere;

@Service
public class GenereServiceImpl implements GenereService {

	@Autowired
	private GenereDAO dao;

	@Override
	public Genere addGenere(Genere s) {

		return dao.save(s);

	}

	@Override
	public List<Genere> getAll() {

		return dao.findAll();
	}

	@Override
	public Genere getOneById(int id) {

		return dao.findById(id).get();
	}

	@Override
	public Genere updateGenere(Genere s) {

		return dao.save(s);

	}

	@Override
	public void deleteGenereById(int id) {
		dao.deleteById(id);

	}

}

package serie.services;

import java.util.List;

import serie.entities.Serie;

public interface SerieService {

	Serie addSerie(Serie s);//c

	List<Serie> getAll();//r
	Serie getOneById(int id);//r
	
	Serie updateSerie(Serie s);//u
	void deleteSerieById(int id);//d

	
}

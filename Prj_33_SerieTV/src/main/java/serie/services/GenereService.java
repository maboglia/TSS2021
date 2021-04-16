package serie.services;

import java.util.List;

import serie.entities.Genere;

public interface GenereService {

	Genere addGenere(Genere s);//c

	List<Genere> getAll();//r
	Genere getOneById(int id);//r
	
	Genere updateGenere(Genere s);//u
	void deleteGenereById(int id);//d

	
}

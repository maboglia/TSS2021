package libreria.services;

import java.util.List;

import libreria.entities.Editore;

public interface EditoreService {
	List<Editore> getAll();
	Editore getOne(int id);
	void addEditore(Editore e);
	void updEditore(Editore e);
	void delEditore(int id);	
}

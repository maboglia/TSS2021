package paesi.services;

import java.util.List;

import paesi.entities.Paese;

public interface PaesiService {

	List<Paese> getAll();
	List<Paese> getBySubRegion(String subregion);
	Paese getPaese(String nome);
	
}

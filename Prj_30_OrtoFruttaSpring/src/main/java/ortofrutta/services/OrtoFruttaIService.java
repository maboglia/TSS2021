package ortofrutta.services;

import java.util.List;

import ortofrutta.entities.OrtoFrutta;

public interface OrtoFruttaIService {

	OrtoFrutta getProdotto(int id);
	List<OrtoFrutta> getProdotti();
	
	OrtoFrutta addProdotto(OrtoFrutta p);
	OrtoFrutta updProdotto(OrtoFrutta p);
	void delProdottoById(int id);
	void delProdotto(OrtoFrutta p);
	
}

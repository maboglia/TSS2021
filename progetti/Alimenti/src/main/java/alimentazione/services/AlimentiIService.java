package alimentazione.services;

import java.util.List;
import java.util.Set;

import alimentazione.entities.Alimenti;

public interface AlimentiIService {
	
	Alimenti getAlimento(int id);
	List<Alimenti> getAlimenti();
	List<Alimenti> getCategoria(String cat);
	Set<String> getCategorie();
	
	Alimenti addAlimento(Alimenti p);
	Alimenti updAlimento(Alimenti p);
	void delAlimentoById(int id);
	void delAlimento(Alimenti p);

}

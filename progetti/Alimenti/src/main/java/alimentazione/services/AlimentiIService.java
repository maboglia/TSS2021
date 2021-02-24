package alimentazione.services;

import java.util.List;

import alimentazione.entities.Alimenti;

public interface AlimentiIService {
	
	Alimenti getAlimento(int id);
	List<Alimenti> getAlimenti();
	
	Alimenti addAlimento(Alimenti p);
	Alimenti updAlimento(Alimenti p);
	void delAlimentoById(int id);
	void delAlimento(Alimenti p);

}

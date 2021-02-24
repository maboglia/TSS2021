package alimentazione.services;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alimentazione.entities.Alimenti;
import alimentazione.repos.AlimentiDAO;

@Service
public class AlimentiService implements AlimentiIService {
	
	@Autowired
	private AlimentiDAO db;

	@Override
	public Alimenti getAlimento(int id) {
		return db.findById(id).get();
	}

	@Override
	public List<Alimenti> getAlimenti() {
		return db.findAll();
	}

	@Override
	public Alimenti addAlimento(Alimenti p) {
		return db.save(p);
	}

	@Override
	public Alimenti updAlimento(Alimenti p) {
		return db.save(p);
	}

	@Override
	public void delAlimentoById(int id) {
		db.deleteById(id);

	}

	@Override
	public void delAlimento(Alimenti p) {
		db.delete(p);

	}

	@Override
	public List<Alimenti> getCategoria(String cat) {
		
		List<Alimenti> findByCategoria = db.findByCategoria(cat);
		Collections.sort(findByCategoria);
		return findByCategoria;
		
	}

	@Override
	public Set<String> getCategorie() {

		Set<String> alimenti = new TreeSet<>();
		

		for (Alimenti alimento : this.getAlimenti()) {
			alimenti.add(alimento.getCategoria());
		}
		
		return alimenti;
	}

}

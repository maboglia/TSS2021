package alimentazione.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import alimentazione.entities.Alimenti;

public interface AlimentiDAO extends JpaRepository<Alimenti, Integer> {

	public List<Alimenti> findByCategoria(String categoria);
	
}

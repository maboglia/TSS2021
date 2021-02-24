package alimentazione.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import alimentazione.entities.Alimenti;

public interface AlimentiDAO extends JpaRepository<Alimenti, Integer> {

	public List<Alimenti> findByCategoria(String categoria);
//	@Query("FROM Alimenti where categoria = :cat order by energia")
//	public List<Alimenti> findByCategoria(@Param("cat")String categoria);

	
}

package paesi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import paesi.entities.Paese;

public interface PaesiDAO extends JpaRepository<Paese, Integer>{

	
	List<Paese> findBySubregion(String subregion);
	
	@Query("FROM Paese where name = :n")
	Paese getPaese(@Param("n") String name);
	
	
	
}

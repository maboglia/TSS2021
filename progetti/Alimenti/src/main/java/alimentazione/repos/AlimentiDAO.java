package alimentazione.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import alimentazione.entities.Alimenti;

public interface AlimentiDAO extends JpaRepository<Alimenti, Integer> {

}

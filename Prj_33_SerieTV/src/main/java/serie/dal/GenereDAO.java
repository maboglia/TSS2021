package serie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import serie.entities.Genere;

public interface GenereDAO extends JpaRepository<Genere, Integer> {

}

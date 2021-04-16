package serie.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import serie.entities.Serie;

public interface SerieDAO extends JpaRepository<Serie, Integer> {

}

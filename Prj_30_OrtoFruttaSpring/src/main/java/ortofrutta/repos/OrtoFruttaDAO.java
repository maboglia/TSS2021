package ortofrutta.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ortofrutta.entities.OrtoFrutta;

public interface OrtoFruttaDAO extends JpaRepository<OrtoFrutta, Integer> {

}

package libreria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import libreria.entities.Editore;

public interface EditoreDAO extends JpaRepository<Editore, Integer> {

}

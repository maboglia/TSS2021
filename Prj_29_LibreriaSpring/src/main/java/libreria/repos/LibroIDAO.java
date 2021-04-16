package libreria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import libreria.entities.Libro;

public interface LibroIDAO extends JpaRepository<Libro, Integer> {

}

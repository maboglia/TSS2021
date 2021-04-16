package relazioni.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Viaggio;


public interface ViaggioRepo extends CrudRepository<Viaggio, Integer> {

	//derived query
	List<Viaggio> findByDestinazioneAndGenere(String destinazione, String genere);
}

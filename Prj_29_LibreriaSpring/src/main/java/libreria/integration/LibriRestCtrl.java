package libreria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Libro;
import libreria.services.LibroService;

@RestController
@RequestMapping("/rest")
public class LibriRestCtrl {

	@Autowired
	private LibroService servizio;
	
	@GetMapping("/libri")
	List<Libro> tutti(){
		System.out.println("vuoi vedere tutti i libri in formato json");
		return servizio.getLibri();
	}
	@GetMapping("/libri/{id}")
	Libro uno(@PathVariable("id") int id){
		System.out.println("vuoi vedere un solo libro in formato json");
		return servizio.getLibro(id);
	}
	

	
}

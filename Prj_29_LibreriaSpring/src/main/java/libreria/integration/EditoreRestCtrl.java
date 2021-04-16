package libreria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Editore;
import libreria.entities.Libro;
import libreria.services.EditoreServiceImpl;
import libreria.services.LibroService;

@RestController
@RequestMapping("/rest")
public class EditoreRestCtrl {

	@Autowired
	private EditoreServiceImpl servizio;
	
	@GetMapping("/editori")
	List<Editore> tutti(){
		System.out.println("tutti gli editori");
		return servizio.getAll();
	}
	@GetMapping("/editori/{id}")
	Editore uno(@PathVariable("id") int id){
		System.out.println("vuoi vedere un solo libro in formato json");
		return servizio.getOne(id);
	}
	@PostMapping("/editori")
	public ResponseEntity<?> addEditore(@RequestBody Editore e) {
		servizio.addEditore(e);
		return ResponseEntity.ok().body("Ho aggiunto un nuovo editore  "+ e.getNome());
	}
	
	
}

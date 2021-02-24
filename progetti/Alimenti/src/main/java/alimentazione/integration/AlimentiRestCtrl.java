package alimentazione.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alimentazione.entities.Alimenti;
import alimentazione.services.AlimentiService;

@RestController
@RequestMapping("/alimenti")
public class AlimentiRestCtrl {
	
	@Autowired
	private AlimentiService servizio;
	
	@GetMapping("")
	public List<Alimenti> tutti(){
		return servizio.getAlimenti();
	}

	@GetMapping("/find/{categoria}")
	public List<Alimenti> trovaCategoria(@PathVariable("categoria") String cat){
		try {
			return servizio.getCategoria(cat);
		} catch (Exception e) {
			return null;
		}
	}	
	
	@GetMapping("/{id}")
	public Alimenti uno(@PathVariable("id") int id){
		try {
			return servizio.getAlimento(id);
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping(path = "", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Alimenti addAlimento(@RequestBody Alimenti o) {
		return servizio.addAlimento(o);
	}
	
	@PutMapping(path = "", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Alimenti updAlimento(@RequestBody Alimenti o) {
		return servizio.updAlimento(o);
	}
	
	@DeleteMapping("/{id}")
	public void elimina(@PathVariable("id") int id){
		servizio.delAlimentoById(id);
	}

}

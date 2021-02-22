package ortofrutta.integration;

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

import ortofrutta.entities.OrtoFrutta;
import ortofrutta.services.OrtoFruttaService;

@RestController
@RequestMapping("/REST/ortaggi")
public class OrtoFruttaRestCtrl {

	@Autowired
	private OrtoFruttaService servizio;
	
	@GetMapping("")
	public List<OrtoFrutta> tutti(){
		return servizio.getProdotti();
	}
	
	@GetMapping("/{id}")
	public OrtoFrutta uno(@PathVariable("id") int id){
		return servizio.getProdotto(id);
	}
	
	@PostMapping(path = "", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public OrtoFrutta addProdotto(@RequestBody OrtoFrutta o) {
		return servizio.addProdotto(o);
	}
	@PutMapping(path = "", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public OrtoFrutta updProdotto(@RequestBody OrtoFrutta o) {
		return servizio.updProdotto(o);
	}	
	@DeleteMapping("/{id}")
	public void elimina(@PathVariable("id") int id){
		servizio.delProdottoById(id);
	}
}

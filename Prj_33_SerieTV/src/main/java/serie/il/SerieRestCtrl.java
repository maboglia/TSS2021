package serie.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import serie.entities.Genere;
import serie.entities.Serie;
import serie.services.GenereService;
import serie.services.SerieService;

@RestController
@RequestMapping("/api")
public class SerieRestCtrl {

	@Autowired
	private GenereService service;
	
	@Autowired
	private SerieService serie;
	
	//gestione dei generi
	//1 tutti i generi in json
	@GetMapping("/generi")
	public List<Genere> getAll(){
		return service.getAll();
	}
	
	//2 aggiungi/modifica un genere via POST con form html
	@PostMapping("/generi")
	public Genere addGenere(@ModelAttribute @Validated  Genere g) {
		return service.addGenere(g);
	}	
	
	//3 aggiungi/modifica un genere via POST con client rest (formato json)
	@PostMapping(path="/generi/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Genere addGenereJson(@RequestBody  Genere g) {
		return service.addGenere(g);
	}		
	//--------------------------------------------------------------
	//gestione delle serie
	//1 tutti le serie in json
	@GetMapping("/serie")
	public List<Serie> getAllSerie(){
		return serie.getAll();
	}
	
	//2 aggiungi/modifica una seria via POST con form html
	@PostMapping("/serie")
	public Serie addSerie(@ModelAttribute @Validated  Serie s) {
		
		return serie.addSerie(s);
	}	

	//3 aggiungi/modifica una serie via POST con client rest (formato json)
	@PostMapping(path="/serie/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Serie addSerieJson(@RequestBody  Serie s) {
		return serie.addSerie(s);
	}		
}

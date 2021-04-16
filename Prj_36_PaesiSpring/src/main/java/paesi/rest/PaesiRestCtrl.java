package paesi.rest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import paesi.entities.Paese;
import paesi.services.PaesiService;

@RestController
@RequestMapping("/api")
public class PaesiRestCtrl {
	
	@Autowired
	private PaesiService service;
	
	@GetMapping("/paesi")
	public List<Paese> getAll(){
		return service.getAll();
	}

	@GetMapping("/paese/{nome}")
	public Paese getPaese(@PathVariable("nome") String nome) {
		return service.getPaese(nome);
	}
	
	@GetMapping("/capitali")
	public List<String> getCapitali(){
		return service.getAll().stream().map(e->e.getCapital()).collect(
				Collectors.toList()
				);
	}
	
	@GetMapping("/sub")
	public Map<String, List<Paese>> getSubRegions(){
		Map<String, List<Paese>> subregions = service
				.getAll().stream()
				.filter(p->p.getPopulation()>30_000_000)
				.sorted()
				.collect(Collectors.groupingBy(Paese::getSubregion));
		return subregions;
	}
	
	@GetMapping("/sub/{sr}")
	public List<Paese> getSR(@PathVariable("sr") String sr){
		return service.getBySubRegion(sr);
	}
	
	
	@GetMapping("/paesi/{continente}")
	public List<Paese> getByContinente(@PathVariable("continente") String cont){
		
		return service.getAll()
			.stream()
			.filter(e->e.getRegion().equalsIgnoreCase(cont))
			.sorted()
			.collect(Collectors.toList());
		
	}
	
	
	
	
}

package alimentazione.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import alimentazione.entities.Alimenti;
import alimentazione.services.AlimentiIService;

@Controller
@RequestMapping("/web")
public class AlimentiCtrl {

	@Autowired
	private AlimentiIService service;
	
	@RequestMapping("/prodotti/{id}")
	public String getProdotto(@PathVariable("id") int id,   Model model) {
		
		Alimenti alimento = service.getAlimento(id);
		
		model.addAttribute("prodotto", alimento);
		
		return "dettaglio";
	}
	
	@RequestMapping("/prodotti")
	public String getProdotti(Model model) {
		
		List<Alimenti> alimenti = service.getAlimenti();
		
		model.addAttribute("prodotti", alimenti);
		
		return "index";
	}
	
}

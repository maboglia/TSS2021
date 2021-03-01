package alimentazione.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
//endpoint per eliminare record	
	//1 ricevo l'id da eliminare e redirigo alla lista prodotti
	@RequestMapping("/delete/{id}")
	public String deleteProdotto(@PathVariable("id") int id) {
		
		if (service.getAlimento(id)!=null) {
			service.delAlimentoById(id);
		}
		
		return "redirect:/web/prodotti";
	}
	
//	endpoint per aggiungere record:
	//1 mostrare il form per aggiungere
	@RequestMapping("/add")
	public String addProdotto() {
		return "addAlimento";
	}
	//2 ricevere i dati del form e aggiungere il record, reindirizzare all'elenco prodotti
	@RequestMapping("/aggiungi")
	public String aggiungiProdotto(@ModelAttribute("alimento") Alimenti a) {
		
		service.addAlimento(a);
		
		return "redirect:/web/prodotti";
	}
	
}

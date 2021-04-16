package serie.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import serie.services.GenereService;
import serie.services.SerieService;

@Controller
@RequestMapping("/mvc")
public class SerieCtrl {

	@Autowired
	private GenereService genereService;
	
	@Autowired
	private SerieService serieService;

	
	@RequestMapping("")
	public String home(ModelMap model) {
		model.addAttribute("elenco",serieService.getAll());
		return "home";
	}
	
	@RequestMapping("/serie/view/{id}")
	public String viewSerie(@PathVariable("id") int id, ModelMap model) {
		model.addAttribute("serie",serieService.getOneById(id));
		return "viewSerie";
	}
	
	@RequestMapping("/serie/update/{id}")
	public String updateSerie(@PathVariable("id") int id, ModelMap model) {
		model.addAttribute("serie",serieService.getOneById(id));
		return "updateSerie";
	}
	
	
	
}

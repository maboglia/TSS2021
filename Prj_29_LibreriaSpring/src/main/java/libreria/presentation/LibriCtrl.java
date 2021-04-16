package libreria.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import libreria.services.LibroService;

@Controller
public class LibriCtrl {

	@Autowired
	private LibroService servizio;
	
	@RequestMapping("/libri")
	public String getAll(Model model) {
		model.addAttribute("libri", servizio.getLibri());
		System.out.println("chiedi la jsp elenco_libri");
		return "elenco_jquery";
	}
	
	@RequestMapping("/libriMVC")
	public String getAllMVC(Model model) {
		model.addAttribute("libri", servizio.getLibri());
		System.out.println("chiedi la jsp elenco_libri");
		return "elenco_libri";
	}
	
}

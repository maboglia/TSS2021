package paesi.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import paesi.entities.Paese;
import paesi.services.PaesiService;

@Controller
public class PaesiCtrl {

	
	@Autowired
	private PaesiService service;
	
	@RequestMapping("/paesi")
	public String getPaesi(Model model) {
		List<Paese> all = service.getAll();
		model.addAttribute("paesi", all);
		return "paesi";
	}
	
	
}

package ortofrutta.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ortofrutta.entities.OrtoFrutta;
import ortofrutta.services.OrtoFruttaService;

@Controller
@RequestMapping("/ortaggi")
public class OrtaggiCtrl {

		@Autowired
		private OrtoFruttaService servizio;		
		
		
		@RequestMapping("")
		public String tutti(Model model) {
			List<OrtoFrutta> prodotti = servizio.getProdotti();
			
			model.addAttribute("p", prodotti);
			
			return "index";
			
		}
		
		
		@RequestMapping("/{id}")
		public String ortaggi(@PathVariable("id") int prodottoN, Model model) {
			OrtoFrutta prodotto;
			try {
				prodotto = servizio.getProdotto(prodottoN);
				model.addAttribute("p", prodotto);
			} catch (Exception e) {
				prodotto = new OrtoFrutta();
				prodotto.setProdotto("Non disponibile");
				model.addAttribute("p", prodotto);
				//e.printStackTrace();
			}
			return "index";
		}
	
	
}

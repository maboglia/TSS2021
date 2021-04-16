package alimenti;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class LibriCtrl {

	@Autowired
	private JdbcTemplate template;
	
	@RequestMapping("/template")
	public String rispondi(Model model) {
		Libro l = new Libro();
		l.setTitolo("il nome della rosa");
		model.addAttribute("libro", l);
		return "prova-thyme";
	}
	
	@ResponseBody
	@RequestMapping("/libro")
	public Libro libro() {
		Libro l = new Libro();
		l.setTitolo("il nome della rosa");
		return l;
	}
	
	@ResponseBody
	@RequestMapping("/libri")
	public List<Libro> libri() {
		
		
		Libro l = new Libro();
		l.setTitolo("il nome della rosa");
		
		Libro l2 = new Libro();
		
		l2.setTitolo("il nome della rosa2");
		
		List<Libro> libri = new ArrayList<Libro>();
		libri.add(l);
		libri.add(l2);
		
		return libri;
	}
	
		
	
}

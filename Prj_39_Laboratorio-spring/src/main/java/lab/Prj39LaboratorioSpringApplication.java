package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
@Controller
public class Prj39LaboratorioSpringApplication implements ErrorController{

	@Value("${messaggio}")
	private String msg;
	
	@GetMapping("")
	public ModelAndView welcome() {
		
		List<String> continenti = Arrays.asList(
				"Asia", "Europe", "Americas"
				);
		return new ModelAndView("index", "continenti", continenti ) ;
	}
	
	@GetMapping(value = {"/api", "/api/{continente}"})
	public String getPaesi(@PathVariable(required = false) String continente, Model model) {
		if(continente != null) {
		List<String> continenti = Arrays.asList(
				"Asia", "Europe", "Americas", continente
				);
		model.addAttribute("continenti", continenti);
		model.addAttribute("continente", continente);
		
		return "index";
		} 

		return "pippo";
		
	}
	
	@GetMapping(value= {"/pippo", "/pippo/{id}"})
	public @ResponseBody Object fetch(@PathVariable Optional<Integer> id) {
		if (id.isPresent()) {
			return id;
			
		}
		return 54;
		
	}
	
	
	
	
	
	
	@RequestMapping("/pippo")
	public String home(Model m, HttpSession session) {
		session.setAttribute("logged", "admin");
		m.addAttribute("msg",msg);
		return "pippo";
	}
	
	@RequestMapping("/pluto")
	public String home2(Model m) {
		System.out.println("questo metodo fa una serie di operazioni sul gestionale");
		System.out.println(msg);
		return "redirect:/pippo";
	}
	
	@RequestMapping("/rispondi")
	@ResponseBody
	public Marf home3(Model m) {
		System.out.println("questo metodo fa una serie di operazioni sul gestionale");
		System.out.println(msg);
		
		return new Marf();
	}	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Prj39LaboratorioSpringApplication.class, args);
	}

	@RequestMapping("/error")
	public String gestioneError(HttpServletRequest request) {
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if (status != null) {
			int statusCode = Integer.parseInt(status.toString());
			
			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				return "error/404";
			}
			
			
		}
		
		return "error";
		
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

}

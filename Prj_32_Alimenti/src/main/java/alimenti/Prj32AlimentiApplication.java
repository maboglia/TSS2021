package alimenti;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Prj32AlimentiApplication {

	@Autowired
	private JdbcTemplate template;
	
	@GetMapping("/libri")
	public List<Map<String, Object>> libri(){
		return template.queryForList("select * from libro");
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Prj32AlimentiApplication.class, args);
	}

}

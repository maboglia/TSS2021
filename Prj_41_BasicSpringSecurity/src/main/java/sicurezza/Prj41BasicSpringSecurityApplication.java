package sicurezza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class Prj41BasicSpringSecurityApplication extends WebSecurityConfigurerAdapter{

	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Prj41BasicSpringSecurityApplication.class, args);
	}

}

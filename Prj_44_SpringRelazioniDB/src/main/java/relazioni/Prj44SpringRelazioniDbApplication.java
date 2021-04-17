package relazioni;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Documento;
import relazioni.entities.Viaggio;
import relazioni.repos.DocRepo;
import relazioni.repos.ViaggioRepo;

@SpringBootApplication
public class Prj44SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj44SpringRelazioniDbApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner esempio1(ViaggioRepo viaggioRepo, DocRepo docRepo) {
//		
//		
//		return a -> {
//			
//			Viaggio v = new Viaggio("Roma");
//			Documento d = new Documento("locandina_roma.pdf");
//			
//			v.setDocumento(d);
//			d.setViaggio(v);
//			
//			viaggioRepo.save(v);
//			
//			
//			
//		};
//		
//	}

	@Bean
	public CommandLineRunner esempio2(ViaggioRepo viaggioRepo, DocRepo docRepo) {
		
		
		return a -> {
			
			Viaggio v = new Viaggio("Roma");
			Documento d = new Documento("locandina_roma.pdf");
			Documento d2 = new Documento("foto_colosseo.jpg");
			d.setViaggio(v);
			d2.setViaggio(v);
			
			Set<Documento> docs = new HashSet<>();
			
			docs.add(d);
			docs.add(d2);
			
			v.setDocumento(docs);
			viaggioRepo.save(v);
			
			
			
		};
		
	}
		
	
	
}

package serie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import serie.entities.Genere;
import serie.services.GenereService;
import serie.services.SerieService;

@SpringBootTest
class Prj33SerieTvApplicationTests {

	@Autowired
	private GenereService serv;
	
	@Test
	void contextLoads() {
	
		/*
		Genere g = new Genere();
		g.setGenere("prova");
		
		serv.addGenere(g);
		
		g.setGenere("drama");
		
		serv.updateGenere(g);
		g.setGenere("comedy");
		serv.updateGenere(g);
		
		Genere oneById = serv.getOneById(3);
		System.out.println(oneById.getGenere());

		serv.deleteGenereById(3);

		serv.getAll().forEach(e->System.out.println(e.getId() + ": " +e.getGenere()));
		*/
		
	}

}

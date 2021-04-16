package view;

import controller.Schedario;
import model.Libro;

public class Gestione {

	public static void main(String[] args) {
		

		Schedario narrativaStr = new Schedario(4);
	
		Libro l1 = new Libro("Harry Potter", "Rowling", 100);
		Libro l2 = new Libro("Il signore degli anelli", "Tolkien", 1000);
		Libro l3 = new Libro("Io, robot", "Asimov", 500);
		Libro l4 = new Libro("Io, Diego", "D.A. Maradona", 1500);
		
		narrativaStr.aggiungiLibro(l1, 0);
		narrativaStr.aggiungiLibro(l2, 1);
		narrativaStr.aggiungiLibro(l3, 2);
		narrativaStr.aggiungiLibro(l4, 3);
		
		narrativaStr.elenco();
		

	}

}

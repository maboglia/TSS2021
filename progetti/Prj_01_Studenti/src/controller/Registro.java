package controller;

import model.Studente;

public class Registro {

	//registro vuoto con 18 posti liberi
	public Studente[] studenti = new Studente[18];
	
	public Registro() {
		System.out.println("Ho costruito un registro");
	}
	
	
	
	
	
	public void inizializza() {
		System.out.println("inizializzo il registro");
		addStudente(new Studente("nome",	"cognome", 2000), 0);
		/* elenco nomi nascosto */
		System.out.println("registro inizializzato");
		
	}
	
	//ogni volta che aggiungo uno studente occupo una delle 18 posizioni
	public void addStudente(Studente s, int i) {
		studenti[i] = s;
	}
	
	
	
}

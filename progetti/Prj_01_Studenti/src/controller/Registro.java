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
		addStudente(new Studente("Amal",	"El Arabi", 2000), 0);
		addStudente(new Studente("Ayoub",	"Bettaieb",	2001), 1);
		addStudente(new Studente("Dario",	"Iapicca",	1995), 2);
		addStudente(new Studente("Davide",	"Beltramo",	1997), 3);
		addStudente(new Studente("Diego",	"Pellegrino",	1998), 4);
		addStudente(new Studente("Emanuele",	"Sandrone",	1996), 5);
		addStudente(new Studente("Federica",	"Corbezzolo",	1995), 6);
		addStudente(new Studente("giacomo",	"mosso",	1998), 7);
		addStudente(new Studente("Giada",	"Squillaci",	1993), 8);
		addStudente(new Studente("Luca",	"Basello",	1996), 9);
		addStudente(new Studente("Maryam",	"Alimohammadi",	1987), 10);
		addStudente(new Studente("Matteo",	"Tosin",	1994), 11);
		addStudente(new Studente("Mattia",	"Vazzoler",	1989), 12);
		addStudente(new Studente("Mirko",	"Franco",	1990), 13);
		addStudente(new Studente("Nabil",	"Bougarech",	1993), 14);
		addStudente(new Studente("Rebecca",	"Ghergo",	1996), 15);
		addStudente(new Studente("Salvatore",	"Zollino",	1994), 16);
		addStudente(new Studente("Tommaso",	"Angeli",	1999), 17);
		System.out.println("registro inizializzato");
		
	}
	
	//ogni volta che aggiungo uno studente occupo una delle 18 posizioni
	public void addStudente(Studente s, int i) {
		studenti[i] = s;
	}
	
	
	
}

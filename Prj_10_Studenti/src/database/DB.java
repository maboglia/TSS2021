package database;

import java.util.ArrayList;

import model.Studente;

public class DB {

	//persistenza
	//1) scarico i dati da un database, per ogni record creo un oggetto di tipo studente
	//2) leggo un file di testo, con valori separati da virgola e per ogni linea creo un oggetto di tipo studente

	private Studente[] studentiAR;
	private ArrayList<Studente> studentiAL;

	public DB() {
		studentiAR = new Studente[18];
		studentiAL = new ArrayList<>();
		this.init();
	}
	
	private void init(){
		//inizializzo l'array di studenti
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
		
		//inizializzo i valori dell'AL
		for (Studente studente : studentiAR) {
			this.studentiAL.add(studente);
		}
		
	}
	
	private void addStudente(Studente studente, int i) {
		studentiAR[i] = studente;
		}

	public Studente[] getStudentiAR() {
		return studentiAR;
	}

	public ArrayList<Studente> getStudentiAL() {
		return studentiAL;
	}


}

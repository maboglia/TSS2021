package database;

import java.util.ArrayList;

import model.Studente;

public class DB {

	private ArrayList<Studente> studenti;

	public DB() {
		this.studenti = new ArrayList<>();
		this.inizializza();
	}
	
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	private void inizializza() {
		this.studenti.add(new Studente("Amal",	"El Arabi", 2000));
		this.studenti.add(new Studente("Ayoub",	"Bettaieb",	2001));
		this.studenti.add(new Studente("Dario",	"Iapicca",	1995));
		this.studenti.add(new Studente("Davide",	"Beltramo",	1997));
		this.studenti.add(new Studente("Diego",	"Pellegrino",	1998));
		this.studenti.add(new Studente("Emanuele",	"Sandrone",	1996));
		this.studenti.add(new Studente("Federica",	"Corbezzolo",	1995));
		this.studenti.add(new Studente("giacomo",	"mosso",	1998));
		this.studenti.add(new Studente("Giada",	"Squillaci",	1993));
		this.studenti.add(new Studente("Luca",	"Basello",	1996));
		this.studenti.add(new Studente("Maryam",	"Alimohammadi",	1987));
		this.studenti.add(new Studente("Matteo",	"Tosin",	1994));
		this.studenti.add(new Studente("Mattia",	"Vazzoler",	1989));
		this.studenti.add(new Studente("Mirko",	"Franco",	1990));
		this.studenti.add(new Studente("Nabil",	"Bougarech",	1993));
		this.studenti.add(new Studente("Rebecca",	"Ghergo",	1996));
		this.studenti.add(new Studente("Salvatore",	"Zollino",	1994));
		this.studenti.add(new Studente("Tommaso",	"Angeli",	1999));	
	
	}
	
}

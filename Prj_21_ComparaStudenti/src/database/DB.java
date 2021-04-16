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
		this.studenti.add(new Studente("nome",	"cognome", 2000));
		/* elenco nomi nascosto */
	
	}
	
}

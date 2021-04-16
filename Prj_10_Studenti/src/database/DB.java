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
		addStudente(new Studente("esempio",	"cognome", 2000), 0);
		/* elenco nomi nascosto */
	
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

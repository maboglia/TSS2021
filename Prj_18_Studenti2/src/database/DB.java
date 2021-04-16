package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Studente;

public class DB {

	//persistenza
	//1) scarico i dati da un database, per ogni record creo un oggetto di tipo studente
	//2) leggo un file di testo, con valori separati da virgola e per ogni linea creo un oggetto di tipo studente


	private ArrayList<Studente> studenti;

	public DB() {
		studenti = new ArrayList<>();
		this.init();
	}
	
	private void init(){
		//inizializzo l'arraylist di studenti
		
		File f = new File("documenti/studenti.txt");
		
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				String[] elementi = riga.split(", ");
				
				String nome = elementi[0];
				String cognome = elementi[1];
				int eta =  Integer.parseInt(elementi[2]);
				
				Studente s = new Studente(nome, cognome, eta);
				
				studenti.add(s);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		
//		
//		
//		
/		/* elenco nomi nascosto */
	
		//inizializzo i valori dell'AL
//		for (Studente studente : studentiAR) {
//			this.studentiAL.add(studente);
//		}
		
	}
	
	
	

	public ArrayList<Studente> getStudenti() {
		return studenti;
	}


}

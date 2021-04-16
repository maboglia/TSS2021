package controller;

import java.util.ArrayList;

import database.DB;
import model.Studente;

public class Registro {

	//registro vuoto con 18 posti liberi
	private ArrayList<Studente> studenti = new ArrayList<>();
	
	public void inizializza() {
		DB db = new DB();
		studenti = db.getStudenti();
	}

	//getters
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	
}

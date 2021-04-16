package controller;

import java.util.ArrayList;

import database.DB;
import model.Studente;

public class Registro {

	//registro vuoto con 18 posti liberi
	private Studente[] studenti = new Studente[18];
	private ArrayList<Studente> studentiAL = new ArrayList<>();
	
	public void inizializza() {
		DB db = new DB();
		studenti = db.getStudentiAR();
		studentiAL = db.getStudentiAL();
	}

	//getters
	public Studente[] getStudenti() {
		return studenti;
	}

	public ArrayList<Studente> getStudentiAL() {
		return studentiAL;
	}
	
	
	
	
}

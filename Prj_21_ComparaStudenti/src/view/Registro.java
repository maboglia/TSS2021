package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.DB;
import model.Studente;

public class Registro {

	public static void main(String[] args) {
		
		DB db = new DB();
		
		for(Studente s: db.getStudenti()) {
//			System.out.println(s);
		}           

		List<Studente> studenti = db.getStudenti();
		Collections.sort(studenti);
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
		
	}

}

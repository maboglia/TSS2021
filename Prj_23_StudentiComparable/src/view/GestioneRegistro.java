package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import controller.Registro;
import model.Studente;

public class GestioneRegistro {

	public static void main(String[] args) {
		
		
		
		Studente[] registroA = {
				new Studente("pippo", "pippi", 100),
				new Studente("paperino", "paolino", 150),
				new Studente("gastone", "paperone", 120),
				};
		
		ArrayList<Studente> registroB = new ArrayList<Studente>();

		registroB.add(new Studente("pippo", "pippi", 100));
		registroB.add(new Studente("paperino", "paolino", 150));
		registroB.add(new Studente("gastone", "paperone", 120));
		
		
		Registro r = new Registro(registroA, registroB);

		Arrays.sort(r.getRegistroA());
		
//		Comparatore c = new Comparatore();
		
		Collections.sort(r.getRegistroB(), (questo, altro) -> questo.getCognome().compareTo(altro.getCognome()));
		
		for (int i = 0; i < r.getRegistroA().length; i++) {
			System.out.println(r.getRegistroA()[i]);
		}
		
		System.out.println("------------------------------");
		
//		for (Studente studente : r.getRegistroB()) {
//			System.out.println(studente);
//		}

		r.getRegistroB()
			.stream()
			.filter(s->s.getNome().startsWith("p"))
			.forEach(s -> System.out.println(s.getNome()));
		
	}

}



package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Studente;

public class ProvaStudenti {

	public static void main(String[] args) {

		
		Studente[] studenti = {
				new Studente("m", "ad", 1),
				new Studente("n", "xe", 2),
				new Studente("b", "r", 3),
				new Studente("c", "t", 4),
				new Studente("v", "g", 5),
				new Studente("f", "f", 6),
		};
		
		List<Studente> studentiList = Arrays.asList(studenti);
		
		//studentiList.forEach(System.out::println);
		
		Collections.sort(studentiList, (s1, s2) -> s1.getCognome().compareTo(s2.getCognome()));
		
		studentiList.forEach(System.out::println);
	}
}


package collezioni;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import model.Studente;

public class MapStudente {

	public static void main(String[] args) {


		Map<Integer, Studente> studenti = new HashMap<>();
		
		studenti.put(1, new Studente("mattia", "v", 55));
		studenti.put(2, new Studente("matteo", "t", 65));
		studenti.put(4, new Studente("rebecca", "g", 15));
		
		Set<Integer> chiavi = studenti.keySet();
		
		for (Integer id : chiavi) {
			System.out.print(id + ": ");
			System.out.println(studenti.get(id));
		}
		

	}

}

package collezioni;

import java.util.ArrayList;
import java.util.List;

public class ProvaList {

	public static void main(String[] args) {
		
		List<String> note = new ArrayList<>();

		note.add("do");
		note.add("re");
		note.add("mi");
		note.add("fa");
		note.add("sol");
		
		System.out.println(note.size()  +  " - " + note.get(3) );
		note.remove(3);
		System.out.println(note.size()  +  " - " + note.get(3) );
		
		for (String string : note) {
			System.out.println(string);
		}
		
		System.out.println("------------------");
		
		ArrayList<ArrayList<String>> regioni = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> citta = new ArrayList<String>();
		citta.add("torino");
		citta.add("cuneo");
		citta.add("vercelli");
		
		regioni.add(citta);
		
		ArrayList<String> citta2 = new ArrayList<String>();
		citta2.add("milano");
		citta2.add("como");
		citta2.add("lecco");
		regioni.add(citta2);
		
		System.out.println(regioni.size());
		
		System.out.println(regioni.get(0));
		
		
		for (ArrayList<String> cittaReg : regioni) {
			for (String cit : cittaReg) {
				System.out.println(cit);
			}
			
		}
		
		
		
		
		
	}
	
	
	
}

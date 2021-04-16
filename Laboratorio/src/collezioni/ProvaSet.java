package collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		
//		Set<String> note = new HashSet<>();
		Set<String> note = new TreeSet<>();

		note.add("do");
		note.add("re");
		note.add("mi");
		note.add("fa");
		note.add("sol");
		note.add("mi");

		System.out.println(note.size()  );
		note.remove("fa");
		System.out.println(note.size());
		
		for (String string : note) {
			System.out.println(string);
		}
	
		
		
		
	}

}

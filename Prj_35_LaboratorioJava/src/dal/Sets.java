package dal;

import java.util.HashSet;
import java.util.Set;

import model.Paese;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> paesi = new HashSet<>();
		Paese p1 = new Paese(1, "ita", "roma", "region", "sub",1000);
		paesi.add(new String("pippo"));
		paesi.add(new String("pippo"));
		
		System.out.println(paesi.size());
		
		
	}
	
}

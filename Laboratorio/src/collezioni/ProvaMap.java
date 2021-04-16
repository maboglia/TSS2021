package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ProvaMap {


	
	public static void main(String[] args) {
		
		//nested class
		class CittaPerRegion {
			List<String> citta = new ArrayList<>();

			public CittaPerRegion(List<String> citta) {
				this.citta = citta;
			}
		}
		
		ArrayList<String> citta2 = new ArrayList<String>();
		citta2.add("milano");
		citta2.add("como");
		citta2.add("lecco");

		ArrayList<String> citta = new ArrayList<String>();
		citta.add("torino");
		citta.add("cuneo");
		citta.add("vercelli");		
		
		CittaPerRegion lombardia = new CittaPerRegion(citta2);
		CittaPerRegion piemonte = new CittaPerRegion(citta);
		Map<String, CittaPerRegion> capoluoghi = new HashMap<>();
		
		capoluoghi.put("piemonte", piemonte);
		capoluoghi.put("lombardia", lombardia);
//		capoluoghi.put("piemonte", "torino");
//		capoluoghi.put("campania", "napoli");

//		System.out.println(capoluoghi.size());
		
//		System.out.println(capoluoghi.get("piemonte"));
		
		Set<String> regioni = capoluoghi.keySet();

		for (String regione : regioni) {
			System.out.println(regione);
			System.out.println(capoluoghi.get(regione).citta);
			System.out.println("-------");
		}
		
//	Collection<CittaPerRegion> citta3 = capoluoghi.values();
//		//Collections.sort((List<String>)  citta);
//		for (String string : citta3.) {
//			System.out.println(string);
//		}
	}

}

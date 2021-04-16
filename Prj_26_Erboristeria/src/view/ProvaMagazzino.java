package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import controller.Magazzino;
import model.Pomate;
import model.Prodotto;
import model.Refrigerabile;
import model.Spezie;
import model.SpezieOfficinali;

public class ProvaMagazzino {

	public static void main(String[] args) {
		
		Spezie s1 = new Spezie();
		s1.setCodProdotto("S01");
		s1.setDescrizione("cannella");
		
		SpezieOfficinali s2 = new SpezieOfficinali();
		s2.setCodProdotto("SP05");
		s2.setDescrizione("cardamomo");
		
		Pomate p1 = new Pomate();
		p1.setCodProdotto("P012");
		p1.setDescrizione("arnica");
		
		Magazzino m1 = new Magazzino();
		ArrayList<Refrigerabile> frigorifero = new ArrayList<Refrigerabile>();
		
		
		m1.addProdotto(s1);
		m1.addProdotto(s2);
		m1.addProdotto(p1);

		
		Set<String> codiciP = m1.getProdotti().keySet();
		
		for (String string : codiciP) {
			System.out.println(string);
		}
		
		Collection<Prodotto> prodotti = m1.getProdotti().values();
		
		for (Prodotto prodotto : prodotti) {
			if (prodotto instanceof Refrigerabile)
				System.out.print("*");
			System.out.println(prodotto.getDescrizione());
		}
		
		for (Map.Entry<String, Prodotto> p : m1.getProdotti().entrySet()) {
			System.out.print(p.getKey() + ": ");
			System.out.println(p.getValue().getDescrizione());
			
			if (p.getValue() instanceof Refrigerabile)
				frigorifero.add((Refrigerabile) p.getValue());
		}
	
		for (Refrigerabile pr : frigorifero) {
			  System.out.println(((Prodotto) pr).getDescrizione());
		}
		
		
		
	}

}

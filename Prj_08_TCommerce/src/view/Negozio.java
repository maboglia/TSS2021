package view;

import controller.Carrello;
import controller.Prodotti;
import model.Prodotto;

public class Negozio {

	public static void main(String[] args) {
		
		Prodotti negozio1 = new Prodotti();
		
		//stampo elenco prodotti
		for (Prodotto p : negozio1.getMagazzino()) {
			System.out.println(p);
		}
		//chiedo all'utente di scegliere dei prodotti

		Carrello utente1 = new Carrello();
		Prodotto p1 = negozio1.getMagazzino()[0];
		Prodotto p2 = negozio1.getMagazzino()[1];		
		Prodotto p3 = negozio1.getMagazzino()[2];		
		
		//aggiungo i prodotti al carrello
		utente1.aggiungiAlCarrello(p1);
		utente1.aggiungiAlCarrello(p1);
		utente1.aggiungiAlCarrello(p1);
		utente1.aggiungiAlCarrello(p2);
		utente1.aggiungiAlCarrello(p1);
		utente1.aggiungiAlCarrello(p3);
		utente1.aggiungiAlCarrello(p1);

		
		//stampo elenco carrello
		System.out.println("Il carrello contiene");
		for (Prodotto p : utente1.getContenitore()) {
			System.out.println(p);
		}
		System.out.println("Prezzo totale: " + utente1.calcolaPrezzo());
	}

}

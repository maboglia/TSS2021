package controller;

import java.util.ArrayList;

import model.Prodotto;

public class Carrello {

	private ArrayList<Prodotto> contenitore;

	public Carrello() {
		this.contenitore = new ArrayList<>();
	}
	
	public void aggiungiAlCarrello(Prodotto p) {
		this.contenitore.add(p);
	}

	public ArrayList<Prodotto> getContenitore() {
		return contenitore;
	}
	
	public double calcolaPrezzo() {
		double prezzo = 0;
		
		for (Prodotto p : contenitore) {
			prezzo += p.getPrezzo();
		}
		
		return prezzo;
	}
	
}

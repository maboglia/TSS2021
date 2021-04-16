package controller;

import java.util.HashMap;
import java.util.Map;

import model.Prodotto;

public class Magazzino {

	Map<String, Prodotto> prodotti;

	public Magazzino() {
		this.prodotti = new HashMap<String, Prodotto>();
	}
	
	public void addProdotto(Prodotto p) {
		prodotti.put(p.getCodProdotto(), p);
	}
	public Map<String, Prodotto> getProdotti() {
		return prodotti;
	}
	
}

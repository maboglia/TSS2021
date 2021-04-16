package controller;

import model.Prodotto;

public class Prodotti {

	private Prodotto[] magazzino;
	
	public Prodotti() {
		this.magazzino = Magazzino.getAll();
	}

	public Prodotto[] getMagazzino() {
		return magazzino;
	}
	
}

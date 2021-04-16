package controller;

import model.Prodotto;

public class Magazzino {

	public static Prodotto[] getAll() {
		
		Prodotto[] array = {
			new Prodotto(1, "Pasta", 0.85),	
			new Prodotto(2, "Riso", 1.85),	
			new Prodotto(3, "Biscotti", 1.15),	
			new Prodotto(4, "Latte", 1.55),	
			new Prodotto(5, "Pane", 1.99),	
			new Prodotto(6, "Vino", 2.85),	
			new Prodotto(7, "Sale", 0.85),	
			new Prodotto(8, "Pepe", 0.95),	
			new Prodotto(9, "Grissini", 1.35),	
			new Prodotto(10, "Mele", 1.05),	
		};
		
		return array;
	}
	
	
}

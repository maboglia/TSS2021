package controller;

import model.Libro;

public class Schedario {

	public Libro[] schedario;

	public Schedario(int i) {
		this.schedario = new Libro[i];
	}
	
	public void aggiungiLibro(Libro l, int i) {
		this.schedario[i] = l;
	}
	
	public void elenco() {
		for (int i = 0; i < schedario.length; i++) {
			System.out.println( "Libro " + i + ": " +   schedario[i].mostra());
		}
	}
	
	
}

package model;

public class Libro {

	public String titolo;
	public String autori;
	public int pagine;
	
	public Libro(String titolo, String autori, int pagine) {
		this.titolo = titolo;
		this.autori = autori;
		this.pagine = pagine;
	}
	
	public String mostra() {
		return titolo + ", " + autori + ", " + pagine;
	}
	
	
}

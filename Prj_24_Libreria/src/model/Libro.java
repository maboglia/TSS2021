package model;

public class Libro {

	private String titolo;
	private String autore;
	private int pagine;

	public Libro(String autore, String titolo, int pagine) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + "]";
	}
	
}

package model;
/**
 * Classe che rappresenta un geneico prodotto ...
 * @author mauro
 *
 */
public class Prodotto {

	private int codProdotto;
	private String descrizione;
	private double prezzo;

	/**
	 * Costruttore di un generico Prodotto
	 * @param codProdotto inserire un codice prodotto di tipo intero
	 * @param descrizione inserire una stringa descrittiva del prodotto
	 * @param prezzo inserire il prezzo del prodotto
	 */
	public Prodotto(int codProdotto, String descrizione, double prezzo) {
		this.codProdotto = codProdotto;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	//getters (accessori) and setters(mutatori)
	public int getCodProdotto() {
		return codProdotto;
	}
	public void setCodProdotto(int codProdotto) {
		this.codProdotto = codProdotto;
	}
	public String getDescrizione() {
		return descrizione.toUpperCase();
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "" + this.codProdotto + ", " + this.getDescrizione() + ", " + this.prezzo + "";
	}
	
	
	
}

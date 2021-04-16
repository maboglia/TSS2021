package model;

public class Prodotto {

	private String codProdotto;
	private String descrizione;
	public String getCodProdotto() {
		return codProdotto;
	}
	public void setCodProdotto(String codProdotto) {
		this.codProdotto = codProdotto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Override
	public String toString() {
		return "{\"codProdotto\":\"" + codProdotto + "\", \"descrizione\":\"" + descrizione + "\"}";
	}
	
	
	
}

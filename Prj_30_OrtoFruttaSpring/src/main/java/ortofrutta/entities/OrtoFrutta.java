package ortofrutta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ortaggi")
public class OrtoFrutta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prodotto;
	private String categoria;
	private String stagione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getStagione() {
		return stagione;
	}
	public void setStagione(String stagione) {
		this.stagione = stagione;
	}
	@Override
	public String toString() {
		return "OrtoFrutta [prodotto=" + prodotto + ", categoria=" + categoria + "]";
	}

	
	
	
}

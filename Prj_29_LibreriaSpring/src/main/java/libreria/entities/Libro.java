package libreria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private int pagine;
	private double prezzo;
	private int editore_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getEditore_id() {
		return editore_id;
	}
	public void setEditore_id(int editore_id) {
		this.editore_id = editore_id;
	}
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", pagine=" + pagine + ", prezzo=" + prezzo + ", editore" + "]";
	}

	
	
}

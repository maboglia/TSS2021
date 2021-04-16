package model;
import java.util.ArrayList;

public class Scaffale {

	private String id;
	private ArrayList<Libro> libri;

	public Scaffale(String id) {
		this.libri = new ArrayList<>();
		this.id = id;
	}

	/**
	 * Costruttore dell'oggetto scaffale
	 * @param id - qui inserire l'identificativo
	 * @param libri - qui passare in argomento un AL di libri
	 */
	public Scaffale(String id, ArrayList<Libro> libri) {
		this.id = id;
		this.libri = libri;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
	}

	@Override
	public String toString() {
		return "Scaffale [id=" + id + ", libri=" + libri + "]";
	}
	
	
	
}

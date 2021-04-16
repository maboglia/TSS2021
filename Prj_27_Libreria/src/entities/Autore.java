package entities;

public class Autore {

	private int id;
	private String nome;
	private String cognome;
	
	public Autore() {
	}
	
	/**
	 * Costruttore dell'autore, con argomenti
	 * @param id - inserire id record
	 * @param nome - inserire il nome dell'aurtore
	 * @param cognome - inserire cognome
	 */
	public Autore(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Autore [id=" + id + ", nome=" + nome + "]";
	}

	
	
	
}

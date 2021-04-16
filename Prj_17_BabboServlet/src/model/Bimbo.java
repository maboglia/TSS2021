package model;

public class Bimbo {

	private String nome;
	private String cognome;
	private int anno;
	
	public Bimbo(String nome, String cognome, int anno) {
		this.nome = nome;
		this.cognome = cognome;
		this.anno = anno;
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
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	
	
}

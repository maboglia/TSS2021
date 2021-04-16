package model;

public class Bevanda {


	//proprietà
	private String nome;
	private double prezzo;
	private final String TEMP = "40°";
	
	public Bevanda(String nome) {
		this.nome = nome;
		this.prezzo = 0.30;
	}
	
	public Bevanda(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "" + nome + " - € " + prezzo + " " + TEMP;
	}
	
	
}

package model;

public class Bevanda {


	//proprietà
	protected String nome;
	protected double prezzo;
	protected String TEMP = "40°";
	int acqua;
	
	
	public Bevanda(String nome) {
		this.nome = nome;
		this.prezzo = 0.30;
		System.out.println("Fai cadere il bicchiere");
		System.out.println("Se l'utente vuole lo zucchero, metti la q desiderata");
		System.out.println("fai cadere la palettina, se vuole lo zucchero");		
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

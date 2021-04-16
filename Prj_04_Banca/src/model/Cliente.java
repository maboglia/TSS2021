package model;

public class Cliente {

	private String nome, cognome;

	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "" + nome + ", " + cognome + " - ";
	}
		
}

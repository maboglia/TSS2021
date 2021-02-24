package model;

public class Studente {

	//stato interno
	public String nome;
	public String cognome;
	public int eta;
	public int matricola;

	//costruttore dell'oggetto studente
	
	public Studente(String n, String c, int e) {
		nome = n;
		cognome = c;
		eta = 2020 - e;
		
	}
	
	//metodi dell'oggetto studente
	
	public String scheda() {
		return nome + " " + cognome + " " + eta;
	}
	
}

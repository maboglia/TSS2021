package model;

public class Studente implements Comparable<Studente> {

	//variabile di proprietà della classe: static
	private static int contatore = 1;
	
	//stato interno
	private String nome;
	private String cognome;
	private int eta;
	private int matricola;

	//costruttore dell'oggetto studente
	
	public Studente(String n, String c, int e) {
		nome = n;
		cognome = c;
		eta = 2020 - e;
		this.setMatricola();
		
	}

	//getters accessori, setters mutatori
	
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola() {
		this.matricola = Studente.contatore++;
	}

	@Override
	public String toString() {
		return matricola + ") " + nome + ", " + cognome + ", " + eta + ""
				+ "";
	}

	@Override
	public int compareTo(Studente altroStudente) {
		
		return  this.cognome.compareTo(altroStudente.cognome);
	}
	
	
}

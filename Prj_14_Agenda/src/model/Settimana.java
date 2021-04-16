package model;

public class Settimana {

	private String nome;
	private Giornata[] giornate;

	public Settimana(String nome) {
		this.nome = nome;
		this.giornate = new Giornata[] {
				new Giornata("Lunedì", "01.01"),
				new Giornata("Martedì", "01.02"),
				new Giornata("Mercoledì", "01.03"),
				new Giornata("Giovedì", "01.04"),
				new Giornata("Venerdì", "01.05"),
				new Giornata("Sabato", "01.06"),
				new Giornata("Domenica", "01.07"),
		};
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Giornata[] getGiornate() {
		return giornate;
	}

	public void setGiornate(Giornata[] giornate) {
		this.giornate = giornate;
	}
	
	
	
	
}

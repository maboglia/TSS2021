package model;

public class Giornata {

	private String nome;
	private String data;
	private Impegno[] impegni;

	public Giornata(String nome, String data) {
		this.impegni = new Impegno[10];
		for (int i = 0; i < impegni.length; i++) {
			impegni[i]  = new Impegno(""+(i+8), "#");
		}
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Impegno[] getImpegni() {
		return impegni;
	}

	public void setImpegni(Impegno[] impegni) {
		this.impegni = impegni;
	}
	
	
}

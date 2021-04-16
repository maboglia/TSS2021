package model;

public abstract class Forma implements Comparable<Forma>{

	String nome;
	double superficie;
	
	public Forma(String nome) {
		this.nome = nome;
	}

	public abstract double calcolaSuperficie();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Stanza " + nome + ", " + calcolaSuperficie() + "mq ";
	}
	
	@Override
	public int compareTo(Forma o) {
		// TODO Auto-generated method stub
		if (this.calcolaSuperficie() - o.calcolaSuperficie() > 0)
			return 1;
		else if (this.calcolaSuperficie() - o.calcolaSuperficie() < 0)
			return -1;
		
		return 0;
	}
	
	
}

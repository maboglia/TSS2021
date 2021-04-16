package model;

/**
 * Definisce un generico animale
 * @author mauro
 *
 */
public abstract  class Animale implements Comparable<Animale> {

	protected String razza;
	protected String nome;
	protected Taglia taglia;
	private static int counter = 0;
	private int nmat;
	
	public void setTaglia(Taglia taglia) {
		this.taglia = taglia;
	}
	
	public int getNmat() {
		return nmat;
	}
	
	public Animale() {
		//System.out.println("animale costruito");
		this.nome = "no-name";
		this.nmat = ++counter;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String faiVerso();



	@Override
	public String toString() {
		return "Animale [razza=" + razza + ", nome=" + nome + ", taglia=" + taglia + ", nmat=" + nmat + ", faiVerso()="
				+ faiVerso() + "]";
	}

	@Override
	public int compareTo(Animale altro) {
		// TODO Auto-generated method stub
		return this.taglia.compareTo(altro.taglia);
	}
	
}

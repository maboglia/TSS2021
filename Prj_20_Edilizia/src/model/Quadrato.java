package model;

public class Quadrato extends Rettangolo {

	private double lato;
	
	public Quadrato(String nome, double lato) {
		super(nome, lato, lato);
		this.lato = lato;
	}

	@Override
	public double calcolaSuperficie() {
		return Math.pow(this.lato, 2);
	}
	
}

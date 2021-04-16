package model;

public class Triangolo extends Forma {//is a

	private double base, altezza;
	
	public Triangolo(String nome, double base, double altezza) {
		super(nome);
		this.base = base;
		this.altezza = altezza;		
	}

	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		return this.base * this.altezza / 2;
	}

	
}

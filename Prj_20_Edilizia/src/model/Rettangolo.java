package model;

public class Rettangolo extends Forma{

	private double latoLungo, latoCorto;
	
	public Rettangolo(String nome, double latoLungo, double latoCorto) {
		super(nome);
		this.latoLungo = latoLungo;
		this.latoCorto = latoCorto;
	}


	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		return this.latoCorto * this.latoLungo;
	}

}

package model;

public class Leone extends Felino implements Pericoloso {

	public Leone() {
		//System.out.println("leone costruito");
		this.razza = "leone";
	}

	@Override
	public void prevenzione() {
		System.out.println("Premunirsi di stivali veloci, di ferro..");
		
	}

	@Override
	public
	String faiVerso() {
		// TODO Auto-generated method stub
		return "roar";
	}
	
}

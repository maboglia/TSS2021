package model;

public class Gatto extends Felino {

	public Gatto() {
		//System.out.println("gatto costruito");
		this.razza = "gatto";
	}

	public void diventaPericoloso(Pericoloso p) {
		System.out.println("adesso sono diventato pericoloso!");
	}
	
	
	@Override
	public
	String faiVerso() {
		// TODO Auto-generated method stub
		return "miao";
	}

	
	
}

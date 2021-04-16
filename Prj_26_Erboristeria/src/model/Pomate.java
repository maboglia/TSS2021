package model;

public class Pomate extends Prodotto implements Refrigerabile {

	@Override
	public void refrigera() {
		System.out.println("Le metto in cella frigo nel reparto non alimentari");
		
	}

}

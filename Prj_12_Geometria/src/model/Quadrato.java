package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento l) {
		super(l,l);
		this.lato=l;
	}

	@Override
	public double perimetro() {
		System.out.println("Uso la formula del quadrato");
		return this.lato.lunghezza()*4;
	}

	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return this.lato.lunghezza() * this.lato.lunghezza();
	}
	
}

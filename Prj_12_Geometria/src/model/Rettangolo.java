package model;

public class Rettangolo {

	private Segmento base, altezza;
	
	public Rettangolo(Segmento b, Segmento h) {
		this.base = b;
		this.altezza = h;
	}
	
	public double perimetro() {
		System.out.println("Uso la formula del rettangolo");		
		return 2 * (this.base.lunghezza() + this.altezza.lunghezza());
	}
	
	public double superficie() {
		return this.base.lunghezza() * this.altezza.lunghezza();
	}
	
}

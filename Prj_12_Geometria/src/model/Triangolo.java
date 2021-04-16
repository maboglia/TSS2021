package model;

public class Triangolo {

	private Segmento ab, ac, cb;
	private Punto a, b, c;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.cb = new Segmento(c, b);
	}
	
	public double perimetro() {
		return this.ab.lunghezza() + this.ac.lunghezza()+this.cb.lunghezza();
	}
	
	public double superficieErone() {
		double sp = this.perimetro()/2;
		double s = 0;
		
		s = Math.sqrt(sp * ( sp - this.ab.lunghezza() ) * ( sp - this.ac.lunghezza() )
				* ( sp - this.cb.lunghezza() ) ); 
		return s;
		
	}
	
	
}

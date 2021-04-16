package model;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double lunghezza() {
		double d = 0;
		
		double q1 = Math.pow((a.getX() - b.getX()), 2);
		double q2 = Math.pow((a.getY() - b.getY()), 2);
		
		d = Math.sqrt( q1   +   q2 );
		
		return d;
	}
	
	@Override
	public String toString() {
		return a + ", " + b;
	}
	
	
}

package model;

public class Punto {

	private int x, y;
	
	//overload 
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	//overload 
	public Punto(int x) {
		this.x = x;
		this.y = 0;
	}

	//overload 
	public Punto(int y, boolean t) {
		if (t == true)
			this.x = 1;
		else
			this.x = 0;
		this.y = y;
	}	
	
	//overload 
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}

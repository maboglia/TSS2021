package enumerazioni;

public enum Taglia {
	S(40, 46), M(44, 50), L(48, 54), XL(52, 60);
	
	private int tg;
	private int tg_usa;

	private Taglia(int tg, int tg_usa) {
		this.tg = tg;
		this.tg_usa = tg_usa;
	}
	
	public String tag() {
		return this + "\nEU: " + this.tg + "\nUSA: " + this.tg_usa; 
	}
	
}

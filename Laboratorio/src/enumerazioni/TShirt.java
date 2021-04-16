package enumerazioni;

public class TShirt {

	Colore colore;
	Taglia taglia;
	
	public TShirt(Colore colore, Taglia taglia) {
		this.colore = colore;
		this.taglia = taglia;
	}

	@Override
	public String toString() {
		return "TShirt [colore=" + colore + ", taglia=" + taglia.tag() + "]";
	}
	
	
	
}

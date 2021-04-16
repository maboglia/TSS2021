package enumerazioni;

public class ProvaTShirt {

	public static void main(String[] args) {
		TShirt t1 = new TShirt(Colore.BLU, Taglia.M);
		TShirt t2 = new TShirt(Colore.ROSSO, Taglia.L);
		
		System.out.println(t1.colore.esad);
		System.out.println(t2);

	}

}

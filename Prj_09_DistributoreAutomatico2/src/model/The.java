package model;

public class The extends Bevanda {

	
	public The(double prezzo) {
		super("The");
		this.prezzo = prezzo;
		this.acqua = 160;
		this.TEMP = "30°";
		System.out.println("Aggiungi la q di polvere di the");
		System.out.println("Aggiungi l'acqua calda");
		System.out.println("versa il the nel bicchiere");
		System.out.println("bevanda pronta");
		System.out.println("emetti un segnale sonoro: beeeeep");
		System.out.println("scrivi sul display bevanda pronta");
	}


	@Override
	public String toString() {
		return "[nome=" + nome + ", prezzo=" + prezzo + ", TEMP=" + TEMP + ", acqua=" + acqua + "]";
	}
	
	
	
	
}

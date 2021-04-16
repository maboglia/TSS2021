package model;

public class Caffe extends Bevanda{

	
	public Caffe(double prezzo) {
		super("Caffé");
		this.prezzo = prezzo;
		this.acqua = 80;
		System.out.println("Macina la q di caffé desiderata per il tipo di caffè");
		System.out.println("Aggiungi l'acqua calda");
		System.out.println("versa il caffé nel bicchiere");
		System.out.println("bevanda pronta");
		System.out.println("emetti un segnale sonoro: beeeeep");
		System.out.println("scrivi sul display bevanda pronta");
	}


	@Override
	public String toString() {
		return "[nome=" + this.nome + ", prezzo=" + prezzo + ", TEMP=" + TEMP + ", acqua=" + acqua + "]";
	}
	
	
	
	
}

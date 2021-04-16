package model;

public class Nota {

	//proprietà, attributi, fields
	public String testo;
	public boolean completa;
	
	
	//costruttore dell'oggetto nota, prende in argomento un testo da inserire nella nota e 
	//di default assegna il valore false alla proprietà della nota
	public Nota(String testo) {
		//System.out.println("Creazione nota con testo " + testo);
		this.testo = testo;
		this.completa = false;
	}
		
	//il metodo setCompleta serve per dichiarare completata la nota, prende in argomento un valore 
	//boolean e lo assegna come valore della proprietà "completa"
	public void setCompleta(boolean b) {
		this.completa = b;
	}

	@Override
	public String toString() {
		
		String done = "[ ] ";
		if (completa) {
			done = "[*] ";
		}
		
		return ""  +  done + testo;
	}
	
}

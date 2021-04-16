package model;

public class Nota {

	//proprietà, attributi, fields
	public String testo;
	public boolean completa;
	public int idNota;
	private static int counter = 0;
	
	//costruttore dell'oggetto nota, prende in argomento un testo da inserire nella nota e 
	//di default assegna il valore false alla proprietà della nota
	public Nota(String testo) {
		//System.out.println("Creazione nota con testo " + testo);
		this.idNota = counter++;
		this.testo = testo;
		this.completa = false;
	}
		
	public boolean isCompleta() {
		return completa;
	}
	
	public int getIdNota() {
		return idNota;
	}
	
	//il metodo setCompleta serve per dichiarare completata la nota, prende in argomento un valore 
	//boolean e lo assegna come valore della proprietà "completa"
	public void setCompleta() {
		this.completa = !this.completa;
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

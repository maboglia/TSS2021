package model;

public class Todo {

	private String descrizione;
	private boolean completato;
	
	public Todo(String descrizione) {
		this.descrizione = descrizione;
		this.completato = false;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isCompletato() {
		return completato;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}
	
	
	
	
}

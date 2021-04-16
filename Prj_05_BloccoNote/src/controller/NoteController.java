package controller;

import model.Nota;

public class NoteController {

	public Nota[] lista;
	private final int DIM = 10;
	
	public NoteController() {
		this.lista = new Nota[DIM];
		//System.out.println("Ho costruito un oggetto di tipo controller delle note: NoteController");
	}
	
	public void aggiungi(String s, int pos) {
		//creo una nuova nota
		Nota n = new Nota(s);
		//inserisco la nota nell'array di note
		lista[pos] = n;
		//System.out.println("Nota creata e aggiunta");
	}
	
	//questo metodo modifica la proprieta completa della nota con posizione passata in argomento
	public void completa(int i) {
		this.lista[i].setCompleta(true); 
	}
	
	public void mostraTutte() {
		System.out.println("----------------------------------");
		System.out.println("-----------BLOCCO NOTE------------");
		System.out.println("----------------------------------");
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] == null ) {
				System.out.println("****");
			} else
				
				System.out.println(lista[i]);
		}
		System.out.println("----------------------------------");
	}
	
	
}

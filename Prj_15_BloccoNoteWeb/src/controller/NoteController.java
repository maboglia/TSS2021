package controller;

import java.util.ArrayList;

import model.Nota;

public class NoteController {

	private ArrayList<Nota> lista;
	
	public NoteController() {
		this.lista = new ArrayList<>();
	}
	
	public void aggiungi(String s) {
		lista.add(new Nota(s));
	}
	
	//questo metodo modifica la proprieta completa della nota con posizione passata in argomento
	public void completa(int i) {
		if (this.getNota(i)!=null)
		this.getNota(i).setCompleta();
		else
			System.out.println("nota non trovata");
	}
	public void delete(int i) {
		if (this.getNota(i)!=null)
		this.lista.remove(this.getNota(i));
		else
			System.out.println("nota non trovata");
	}
	
	public Nota getNota(int id) {
		Nota n=null;
		for (Nota nota : lista) {
			if (nota.idNota == id)
				n = nota;
		}
		return n;
	}
	
	public ArrayList<Nota> getLista() {
		return lista;
	}
	
}

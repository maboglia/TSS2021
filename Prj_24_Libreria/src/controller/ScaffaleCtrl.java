package controller;

import java.util.ArrayList;

import model.Libro;
import model.Scaffale;

public class ScaffaleCtrl {

	private Scaffale scaffale;

	public ScaffaleCtrl(Scaffale scaffale) {
		this.scaffale = scaffale;
	}

	public void addLibro(Libro l) {
		this.scaffale.getLibri().add(l);
	}
	
	public ArrayList<Libro> getAll(){
		return this.scaffale.getLibri();
	}
	
	public Libro findLibro(int id) {
		return this.scaffale.getLibri().get(id);
	}
	
	public Libro findLibro(String titolo) {

		for (Libro l : this.scaffale.getLibri()) {
			if (l.getTitolo().equalsIgnoreCase(titolo))
				return l;
		}
		return null;
	}
	
	public Libro findLibro(Libro l) {
		
		if (this.scaffale.getLibri().contains(l)) {
			
			int i = this.scaffale.getLibri().indexOf(l);
			return this.findLibro(i);
		}
		
		
		return null;
	}
	
	
	
}

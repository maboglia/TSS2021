package controller;

import model.Alimento;
import model.Bevanda;

public class DistributoreCtrl {

	
	
	public Bevanda getBevanda(String nome) {
		
		Bevanda b = new Bevanda(nome);
		System.out.println("bevanda preparata");
		return b;
	}
	
	public Alimento getAlimento(String nome) {
		Alimento a = new Alimento(nome);
		System.out.println("Alimento prelevato");
		return a;
	}
}

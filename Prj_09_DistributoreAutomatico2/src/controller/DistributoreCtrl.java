package controller;

import model.Alimento;
import model.Bevanda;
import model.Caffe;
import model.The;

public class DistributoreCtrl {

	
	
	public Bevanda getBevanda(String nome) {
		
		Bevanda b = new Bevanda(nome);
		System.out.println("bevanda preparata");
		return b;
	}
	
	public Caffe getCaffe() {
		Caffe c = new Caffe(0.3);
		return c;
	}
	
	public The getThe() {
		The t = new The(0.3);
		return t;
	}
	
	public Alimento getAlimento(String nome) {
		Alimento a = new Alimento(nome);
		System.out.println("Alimento prelevato");
		return a;
	}
}

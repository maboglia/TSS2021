package controller;

import java.util.HashSet;
import java.util.Set;

import model.Cliente;
import model.Conto;

public class ContiCtrl {

	private static Set<Conto> conti;

	public ContiCtrl() {
		conti = new HashSet<>();
	}
	
	public void addConto(Cliente c) {
		conti.add(new Conto(c));
	}
	
	public Set<Conto> getConti() {
		return conti;
	}
	
}

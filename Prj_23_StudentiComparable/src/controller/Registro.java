package controller;

import java.util.ArrayList;

import model.Studente;

public class Registro {

	private Studente[] registroA;
	private ArrayList<Studente> registroB;

	public Registro(Studente[] registroA, ArrayList<Studente> registroB) {
		this.registroA = registroA;
		this.registroB = registroB;
	}

	public Studente[] getRegistroA() {
		return registroA;
	}

	public void setRegistroA(Studente[] registroA) {
		this.registroA = registroA;
	}

	public ArrayList<Studente> getRegistroB() {
		return registroB;
	}

	public void setRegistroB(ArrayList<Studente> registroB) {
		this.registroB = registroB;
	}
	
	
	
}

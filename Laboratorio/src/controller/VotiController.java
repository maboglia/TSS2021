package controller;

import java.util.ArrayList;

import model.Voto;

public class VotiController {

	private ArrayList<Voto> voti = new ArrayList<>();
	
	public ArrayList<Voto> getVoti() {
		return voti;
	}
	
	public void addVoto(int v) {
		//conversione automatica -> boxing
		voti.add(new Voto(v));
	}
	
	public void addVoto(String materia, int voto) {
		voti.add(new Voto(materia, voto));
		
	}
	
	public double calcolaMedia() {
		double somma=0;
		//somma dei voti
		for (Voto v : voti) {
			somma += v.getValutazione();
		}
		
		//numero di voti

		//somma/numVoti
		
		return somma / voti.size();
	}
	
	public double calcolaVotoLaurea() {
		double media = this.calcolaMedia();
		return media / 3 * 11;
	}


	


}

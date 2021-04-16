package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animale;

public class AnimaliCtrl {

	private List<Animale> animali;
	
	public AnimaliCtrl() {
		this.animali= new ArrayList<Animale>();
	}
	
	public List<Animale> getAnimali() {
		return animali;
	}
	
	public void addAnimale(Animale a) {
		this.animali.add(a);
	}
	
}

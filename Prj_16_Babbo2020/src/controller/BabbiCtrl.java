package controller;

import java.util.ArrayList;

import model.Babbo;

public class BabbiCtrl {

	ArrayList<Babbo> babbi;

	public BabbiCtrl() {
	
		this.babbi = new ArrayList<>();
	
		this.babbi.add(new Babbo("pisolo"));
		this.babbi.add(new Babbo("eolo"));
		this.babbi.add(new Babbo("romolo"));
		this.babbi.add(new Babbo("remo"));
	
	}
	
	public ArrayList<Babbo> getBabbi() {
		return babbi;
	}
	
	public void addBabbo(String nome) {
		this.babbi.add(new Babbo(nome));
	}
	
	
}

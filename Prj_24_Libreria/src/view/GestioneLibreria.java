package view;

import java.util.ArrayList;
import java.util.Arrays;

import controller.ScaffaleCtrl;
import model.Libro;
import model.Scaffale;

public class GestioneLibreria {

	public static void main(String[] args) {
		
		Libro[] libri = {
		new Libro("HUGO", "L'UOMO CHE RIDE", 0),
		new Libro("IBSEN HENRIK", "SPETTRI UN NEMICO DEL POPOLO L'ANITRA SELVATICA ROSMER.", 0),
		new Libro("MAUPASSANT GUI DE", "UNA VITA", 0),
		new Libro("STENDHAL", "DELL'AMORE", 0),
		new Libro("STEVENSON ROBERT LOUIS", "IL RAGAZZO RAPITO", 0),
		new Libro("DA PONTE LORENZO", "MEMORIE LIBRETTI MOZARTIANI", 0),
		new Libro("LACLOS", "LE RELAZIONI PERICOLOSE", 0),
		new Libro("SVETONIO TRANQUILLO", "VITA DEI CESARI", 0),
		new Libro("PROCOPIO DI CESAREA", "CARTE SEGRETE", 0),
		new Libro("DOSTOEVKIJ FEDOR", "IL GIOCATORE", 0),
		new Libro("ALFIERI VITTORIO", "VITA", 0),
		new Libro("MUSIL ROBERT", "IL GIOVANE TORLESS", 0),
		new Libro("STENDHAL", "ARMANCE", 0),
		new Libro("MAUPASSANT", "FORTE COME LA MORTE", 0),
		new Libro("DIDEROT DENIS", "LA MONACA", 0),
		};

		Scaffale s1 = new Scaffale("S1");
		Scaffale s2 = new Scaffale("S2", new ArrayList<>(Arrays.asList(libri)));
		
		ScaffaleCtrl ctrl1 = new ScaffaleCtrl(s1);
		ctrl1.addLibro(libri[0]);
		
		ScaffaleCtrl ctrl2 = new ScaffaleCtrl(s2);
		ctrl2.addLibro(libri[0]);
		
		System.out.println("scaffale 1");
		for (Libro l : ctrl1.getAll()) {
			System.out.println(l);
		}

		System.out.println("scaffale 2");
		for (Libro l : ctrl2.getAll()) {
			System.out.println(l);
		}

		System.out.println(ctrl2.findLibro(6));
		
		System.out.println(ctrl2.findLibro("IL RAGAZZO RAPITO"));
		System.out.println(ctrl2.findLibro("guerra e pace"));
		
		System.out.println(ctrl2.findLibro(libri[8]));
		
		
	}

}

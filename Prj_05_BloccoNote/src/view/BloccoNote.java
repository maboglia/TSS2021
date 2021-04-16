package view;

import java.util.Scanner;

import controller.NoteController;

public class BloccoNote {

	//stato interno
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		NoteController bloccoBlu = new NoteController();
		
		BloccoNote.menu();
				
		String nota = aggiungiNota();
		int pos = posizione();
		
		bloccoBlu.aggiungi(nota, pos);
		bloccoBlu.aggiungi(aggiungiNota(), posizione());
		bloccoBlu.aggiungi(aggiungiNota(), posizione());
		bloccoBlu.aggiungi(aggiungiNota(), posizione());
		bloccoBlu.aggiungi(aggiungiNota(), posizione());
		
		bloccoBlu.mostraTutte();
		sc.close();
	}
	
	private static void menu() {
		System.out.println("Blocco Note");
		System.out.println("1) per inserire una nuova nota");
		System.out.println("2) per completare una nota");
		System.out.println("3) mostra elenco completo");
		System.out.println("0) per uscire");
	}
	
	private static String aggiungiNota() {
		
		String s = sc.nextLine();
		return s;
	}
	
	private static int posizione() {
		int i = sc.nextInt();
		return i;
	}

}

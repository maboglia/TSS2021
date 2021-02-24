package view;

import java.util.Scanner;

import controller.Registro;
import model.Studente;

public class GestioneAula {

	public static void main(String[] args) {
		
		Registro aula1f = new Registro();
		Registro aula1d = new Registro();
		//riempio di studenti il registro di aula1f
		aula1f.inizializza();
		faiAppello(aula1f);
		//calcolaMedia(aula1f);
		System.out.println("finito...");
		
	}


	private static void calcolaMedia(Registro aula1f) {
		int somma=0;
		for (int i = 0; i < aula1f.studenti.length; i++) {
			System.out.println(aula1f.studenti[i].eta);
			somma += aula1f.studenti[i].eta;
		}
		System.out.println("L'età media dell'aula è: " + (somma/aula1f.studenti.length));
	}

	
	
	
	
	private static void faiAppello(Registro aula1f) {
		int presenti = 0;

		
		Scanner sc = new Scanner(System.in);
		
		//scorri il registro (array di studente)
		for (int i = 0; i < aula1f.studenti.length; i++) {
			
			System.out.println( "E' presente lo studente " + aula1f.studenti[i].scheda() +"?" );
			String s = sc.nextLine();
			if (s.startsWith("s")) {
				presenti++;
			}
		}
		
		System.out.println("sono presenti " + presenti + " studenti.");
	}

}

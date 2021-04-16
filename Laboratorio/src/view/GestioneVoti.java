package view;

import java.util.Scanner;

import controller.VotiController;
import model.Voto;

public class GestioneVoti {
	public static void main(String[] args) {
		VotiController vc = new VotiController();
		String richiesta = null;
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		while(continua) {

			menu();
			
			richiesta = sc.nextLine();
			
			if (richiesta.equals("a")) {
				assegnaVoto(vc);
				
			}
			
			if (richiesta.equals("b")) {
				//stampo il report
				report(vc);
				
			}
			
			
			if (richiesta.equals("q")) {
				continua = false;
				System.out.println("arrivederci!");
			}
		}
		
		
		
	}

	private static void assegnaVoto(VotiController vc) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci materia");
		String materia = sc.nextLine();
		
		System.out.println("Inserisci voto");
		int voto = sc.nextInt();
		
		if (materia != null) {
			vc.addVoto(materia, voto);
		} else {
			vc.addVoto(voto);
		}
	}

	private static void menu() {
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Benvenuto in Gestione Voti");
		System.out.println("a) per inserire voti");
		System.out.println("b) per mostrare elenco e media");
		System.out.println("q) per uscire");
		System.out.println("-------------------------------------");
		System.out.println();
	}

	private static void report(VotiController vc) {
		for (Voto v : vc.getVoti()) {
			System.out.println(v);
		}
		
		System.out.println("la media è " + vc.calcolaMedia());
		System.out.println("Il voto di laurea è: " + vc.calcolaVotoLaurea());
	}
	
	
	
}

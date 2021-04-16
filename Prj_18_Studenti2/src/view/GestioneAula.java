package view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import controller.Registro;
import model.Studente;

public class GestioneAula {

	private static ArrayList<Studente> presenti = new ArrayList<>();
	private static ArrayList<Studente> assenti = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Registro aula1f = new Registro();
		//riempio di studenti il registro di aula1f
		aula1f.inizializza();
		//faiAppello(aula1f);
		
////		aula1f.getStudenti();
//		for (Studente s : aula1f.getStudenti()) {
//			System.out.println(s);
//		}
//		
		faiAppello(aula1f);
		
		try {
			FileWriter fw = new FileWriter("documenti/appello.txt");
			PrintWriter pw = new PrintWriter(fw);
			LocalDate ld = LocalDate.now();
			pw.println(ld.toString());
			
			System.out.println("PRESENTI " + presenti.size());
			pw.println("PRESENTI " + presenti.size());
			
		for (Studente s : presenti) {
			System.out.println(s);
			pw.println(s);
		}
		
		System.out.println("ASSENTI " + assenti.size());
		pw.println("ASSENTI " + assenti.size());
		for (Studente s : assenti) {
			System.out.println(s);
			pw.println(s);
		}
		
		pw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		
		
		
		
		
		
		//calcolaMedia(aula1f);
		
		
	}


	private static void calcolaMedia(Registro aula1f) {
		int somma=0;
	}

	
	
	
	
	private static void faiAppello(Registro aula1f) {
		Scanner sc = new Scanner(System.in);
		for (Studente s : aula1f.getStudenti()) {
			System.out.println("E' presente lo studente");
			System.out.println(s);
			if (sc.nextLine().equals("s"))
				presenti.add(s);
			else
				assenti.add(s);
		}
	}

}

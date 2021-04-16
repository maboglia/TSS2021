package controller;

import model.Dado;

public class GiocoController {
	public  void gioco1() {
		final int LIMITE = 100000;
		int successi = 0;
		
		Dado d1 = new Dado((byte) 6);
		Dado d2 = new Dado((byte) 6);
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < LIMITE; i++) {
		
			byte res1 = d1.lancia();
			byte res2 = d2.lancia();
			
//			System.out.print("Dado 1: " + res1);
//			System.out.println(" Dado 2: " + res2);
			if (res1+res2 == 7) {
				//System.out.println("VITTORIA");			
				successi++;
			}
		}//fine ciclo
		long stop = System.currentTimeMillis();
		System.out.println("Percentuale successi "+ ((double)successi/LIMITE) * 100 + "%");
		System.out.println("Tempo di elaborazione " + (stop-start));
	}
	public  void gioco2() {
		final int LIMITE = 100000;
		int successi = 0;
		
		Dado d1 = new Dado((byte) 6);
		Dado d2 = new Dado((byte) 6);
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < LIMITE; i++) {
			
			byte res1 = d1.lancia();
			byte res2 = d2.lancia();
			
//			System.out.print("Dado 1: " + res1);
//			System.out.println(" Dado 2: " + res2);
			if (res1 == res2) {
				//System.out.println("VITTORIA");			
				successi++;
			}
		}//fine ciclo
		long stop = System.currentTimeMillis();
		System.out.println("Percentuale successi "+ ((double)successi/LIMITE) * 100 + "%");
		System.out.println("Tempo di elaborazione " + (stop-start));
	}
}

package it.bogliaccino.calcolatrice;

import java.util.Scanner;

public class MathHelper {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static double calcola(int inp1, int inp2, String operatore) {
		double risultato = 0;
		switch (operatore) {
		case "+":
			risultato = inp1 + inp2;
			break;
		case "-":
			risultato = inp1 - inp2;
			break;
		case "*":
			risultato = inp1 * inp2;
			break;
		case "/":
			risultato = (double) inp1 / inp2;
			break;

		default:
			System.out.println(Etichette.MSG_FAIL + operatore);
			break;
		}
		return risultato;
	}

	public static int trasformaIntero(String input1) {
		
		int i = 0;
		
		try {
		i = Integer.parseInt(input1);
		} catch (NumberFormatException e) {
			System.err.println(Etichette.MSG_INPUT);
		}
		
		return i;
	}

	public static String getInput(String messaggio) {
		
		System.out.println(messaggio);
		String s = sc.nextLine();
		
		return s;
	}
	
	public static void chiudiScaner() {
		sc.close();
	}
	
}

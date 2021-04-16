package logica;

import java.util.Scanner;

public class Anagramma {

	int counter = 0;
	
	public static void main(String[] args) {
		Anagramma an = new Anagramma();
		an.chiedi();
	}

	private void chiedi() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci una parola di 4 lettere");
		String parola = sc.next();
		
		System.out.println("gli anagrammi della tua parola sono: ");
		anagramma("", parola);//"", "ciao"
		System.out.println("numero di anagrammi: " + counter);
		
	}
	//                               "" ,         "ciao"
	private void anagramma(String string, String parola) {
		
		if(parola.length()<=1) {
			counter++;
			System.out.println(string+parola);
		} else {
			for (int i = 0; i < parola.length(); i++) {
				String a = parola.substring(i, i+1);
				String b = parola.substring(0, i);
				String c = parola.substring(i+1);
				
				//ricorsione
				anagramma(string + a, b +c);
				
			}
		}
		
		
	}

	
	
	
}

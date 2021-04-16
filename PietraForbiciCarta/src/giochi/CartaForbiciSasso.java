package giochi;

import java.util.Scanner;

public class CartaForbiciSasso {

	static int vittorieU = 0;
	static int vittorieP = 0;
	static int pareggi = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		char utente;
		char pc;
		
		
		String msg;
		
		for (int i = 0; i < 5; i++) {
		//1 chiedere all'utente p,f,c
		utente = sceltaUtente(); 
		
		//2 far scegliere un casuale tra pfc alla macchina
		pc = sceltaPC();
		
		//3 valutare se sono uguali: messaggio = "pareggio"
		if (utente == pc) {
			msg = "pareggio";
			pareggi++;
		} else {
			//4 altrimenti valutare chi ha vinto:

			msg = valutaGioco(utente, pc);
			
			//4a u == p -> se pc == f -> messaggio = pc perde altrimenti vince
			//4b u == c -> se pc == p -> messaggio = pc perde altrimenti vince
			//4c u == f -> se pc == c -> messaggio = pc perde altrimenti vince
		}
			
		
		//5 stampa messaggio
		System.out.println(msg);
		}//chiudo ciclo
		
		System.out.println("Pareggi " + pareggi);
		System.out.println("Vittorie utente " + vittorieU);
		System.out.println("Vittorie PC " + vittorieP);
		
		//6 saluta ed esce, oppure rigioca se in un loop
		System.out.println("Grazie per aver giocato!");
		input.close();
	}

	private static String valutaGioco(char utente, char pc) {
		String s = null;
		
		if (utente == 'p') {
			if(pc == 'f') {
				s = "Vince utente";
				vittorieU++;
			} else {
				s = "Vince PC";
				vittorieP++;
			}
		} else if  (utente == 'f') {
			if(pc == 'c') {
				s = "Vince utente";
				vittorieU++;
			} else {
				s = "Vince PC";
				vittorieP++;
			}			
		} else {
			if(pc == 'p') {
				s = "Vince utente";
				vittorieU++;
			} else {
				s = "Vince PC";
				vittorieP++;
			}				
		}
		
		return s;
	}

	private static char sceltaPC() {
		char c = 0;
		double d = Math.random();
		if (d < 0.33) {
			c = 'p';
		} else if ( d < 0.66 ) {
			c = 'f';			
		} else {
			c = 'c';			
		}		
		return c;
	}

	//metodo ausiliario per chiedere la scelta all'utente
	private static char sceltaUtente() {
		
		System.out.println("Scegli tra pietra, forbici, carta");
		System.out.println("p: pietra");
		System.out.println("f: forbici");
		System.out.println("c: carta");
		String s = input.nextLine();
		char c = s.charAt(0);
		//input.close();
		return c;
	}
	
}

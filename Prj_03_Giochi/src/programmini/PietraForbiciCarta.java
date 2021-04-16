package programmini;

import java.util.Scanner;

public class PietraForbiciCarta {

	String[] mosse = {"pietra", "forbici", "carta"};
	
	Scanner sc = new Scanner(System.in);
	
	final String MSG = "Fai la mossa giusta!";
	final String VPC = "Vince computer";
	final String VUM = "Vince giocatore umano";
	final String VPA = "Pareggio";
	
	int sceltaUmano=0, sceltaPC=0, vittorieU, vittorieP, pareggi, partite;
	
	public void scegli() {
		System.out.println(MSG);
		for (int i = 0; i < mosse.length; i++) {
			System.out.println("Scegli " + i + " per " + mosse[i]);
		}
		
		sceltaUmano = sc.nextInt();
		
	}
	
	public void sceltaCasuale() {
		sceltaPC = (int) (Math.random() * mosse.length);
	}
	
	public void valutazione() {
		
		partite++;
		System.out.println("Umano ha scelto " + mosse[sceltaUmano]);		
		System.out.println("PC ha scelto " + mosse[sceltaPC]);		
		
		if (sceltaUmano == sceltaPC) {
			pareggi++;
			System.out.println(VPA);
		}
		else {

			switch (sceltaUmano) {
			case 0:
				if (sceltaPC == 1) {
					vittorieU++;
				} else {
					vittorieP++;					
				}
				break;
			case 1:
				if (sceltaPC == 2) {
					vittorieU++;
				} else {
					vittorieP++;					
				}
				break;
			case 2:
				if (sceltaPC == 0) {
					vittorieU++;
				} else {
					vittorieP++;				
				}
				break;

			default:
				System.out.println("Errore di sistema...");
				break;
			}
		}
	}
	
	public void mostraPunteggi() {
		System.out.println("Partite giocate " + partite);
		System.out.println("Pareggi " + pareggi);
		System.out.println("Vittorie umano " + vittorieU);
		System.out.println("Vittorie pc " + vittorieP);
	}
	
	public void gioca() {
		//PietraForbiciCarta pfc = new PietraForbiciCarta();
		boolean gioca = true;
		
		while(gioca) {
			scegli();
			sceltaCasuale();
			valutazione();
			if (vittorieU ==3 || vittorieP ==3)
				gioca = false;
		}
		
		
		mostraPunteggi();
	}
	
}

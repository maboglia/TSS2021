package view;

import java.util.Scanner;

import controller.DistributoreCtrl;
import controller.Messaggi;
import model.Alimento;
import model.Bevanda;
import model.Caffe;
import model.Ginseng;
import model.The;

public class Distributore {
	
	static DistributoreCtrl controllerBevande = new DistributoreCtrl();
	static DistributoreCtrl controllerAlimenti = new DistributoreCtrl();
	
	public static void main(String[] args) {
		
		Bevanda b = new Bevanda("caffè");
		Caffe c = new Caffe(0.3);
		c.setNome("caffé lavazza oro");
		The t = new The(0.3);
		Ginseng g = new Ginseng("Per Matteo");
		g.setNome("Matteo non lo vuole più");
		System.out.println("-------------------");
		System.out.println(b);
		System.out.println("-------------------");
		System.out.println(c);
		System.out.println("-------------------");
		System.out.println(t);
		System.out.println("-------------------");		
		System.out.println(g);
		System.out.println("-------------------");		
		
		System.out.println(Messaggi.NOME);
		
		System.out.println(Messaggi.SCEGLI);
		
		
		String nomeBevanda = scegliBevanda(); 
		
		System.out.println("Hai scelto " + nomeBevanda);
		
		double prezzo = 0.30;
		
		boolean pagato = faiPagare(prezzo);
		
		if (pagato) {
		
		System.out.println(Messaggi.PREPARAZIONE);
		boolean pronta = preparazione(nomeBevanda);
		
		if (pronta) {
			System.out.println("E' pronta");
			System.out.println("beeeep");
		}
		
		} else {
			
		}
		
		
	}

	private static boolean faiPagare(double prezzo) {
		
		boolean tuttoOk = false;
		double monete = 0.0;

		System.out.println(prezzo);
		System.out.println(Messaggi.INSERISCI);

		Scanner sc = new Scanner(System.in);
		monete = sc.nextDouble();
		
		if (monete == prezzo) {
			tuttoOk = true;
		} else if (monete < prezzo) {
			System.out.println("Denaro insufficiente");
		} else {
			System.out.println("resto = " + (monete - prezzo));
			tuttoOk = true;
		}
		sc.close();
		return tuttoOk;
	}

	private static boolean preparazione(String nomeBevanda) {
		boolean preparazione = false;
		switch (nomeBevanda) {
		case "caffe":
			Caffe pronta = controllerBevande.getCaffe();
			System.out.println("La bevanda " + pronta);
			preparazione = true;
			break;
		case "the":
			The t = controllerBevande.getThe();
			System.out.println("La bevanda " + t);
			preparazione = true;
			break;
		default:
			System.out.println("Bevanda non disponibile");
			break;
		}
		return preparazione;
	}

	private static String scegliBevanda() {
		Scanner sc = new Scanner(System.in);
		String scelta = sc.nextLine();

		return scelta;
	}

}

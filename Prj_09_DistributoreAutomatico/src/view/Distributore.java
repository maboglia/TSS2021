package view;

import controller.DistributoreCtrl;
import model.Alimento;
import model.Bevanda;

public class Distributore {

	//static: appartiene alla classe Distributore e NON agli oggetti di tipo distributore
	static final String NOME = "Distributore automatico";
	
	static final String SCEGLI = "Scegli alimento o bevanda";
	
	static final String INSERISCI = "Inserisci importo";
	
	static final String PREPARAZIONE = "Bevanda in preparazione";
	
	static DistributoreCtrl controllerBevande = new DistributoreCtrl();
	static DistributoreCtrl controllerAlimenti = new DistributoreCtrl();
	
	public static void main(String[] args) {
		
		System.out.println(Distributore.NOME);
		
		System.out.println(Distributore.SCEGLI);
		
		String nomeBevanda = "Caffé"; 
		
		System.out.println(nomeBevanda);
		
		double prezzo = 0.30;
		
		System.out.println(prezzo);
		
		System.out.println(INSERISCI);

		double monete = 0.30;
		
		//calcolo resto
		//calcolo del denaro mancante
		
		if (prezzo == monete) {
			System.out.println(PREPARAZIONE);
			Bevanda pronta = controllerBevande.getBevanda(nomeBevanda);
			System.out.println("La bevanda " + pronta);
			System.out.println("E' pronta");
			System.out.println("beeeep");
		}
		
		Alimento a = controllerAlimenti.getAlimento("Panino");
		System.out.println(a);
	}

}

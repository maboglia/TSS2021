package view;

import model.Cliente;
import model.Conto;

public class GestioneBanca {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pippo", "De pippis");
		Cliente c2 = new Cliente("Tex", "Willer");
		
		Cliente[] titolari = {c1, c2};
		Cliente[] titolari2 = {c2};
		
		Conto conto1 = new Conto(titolari);
		Conto conto2 = new Conto(titolari2);
		
		System.out.println(conto1);
		System.out.println(conto2);
		
		conto1.versamento(100);
		System.out.println(conto1);
		conto1.prelievo(200);
		System.out.println(conto1);
				

	}

}

package it.bogliaccino.calcolatrice;

public class Calcolatrice {
	
	public static void main(String[] args) {
		
		String input1 = MathHelper.getInput(Etichette.OPE1);
		String input2 = MathHelper.getInput(Etichette.OPE2);
		String operatore = MathHelper.getInput(Etichette.OPERATORE);
		//MathHelper.chiudiScanner();
		
		
		int inp1 = MathHelper.trasformaIntero(input1);
		int inp2 = MathHelper.trasformaIntero(input2);
		double risultato = MathHelper.calcola(inp1, inp2, operatore);
		
		System.out.println(input1 + " - " + inp1);
		System.out.println(input2 + " - " + inp2);
		System.out.println(operatore);
		System.out.printf(Etichette.display +"%5.2f", risultato);
	}

}

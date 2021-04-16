package controller;

import model.Giornata;
import model.Impegno;
import model.Settimana;

public class AgendaSettimanale {

	private Settimana settimana;

	public AgendaSettimanale(Settimana settimana) {
		this.settimana = settimana;
	}

	
	
	public Settimana getSettimana() {
		return settimana;
	}



	public Giornata getGiornata(int i) {
		if (i >= 0 && i<7)
			return this.settimana.getGiornate()[i];
		else
			return null;
	}
	
	public Impegno getImpegno(Giornata g, int i) {
		return g.getImpegni()[i];
	}
	
	public static void main(String[] args) {
		Settimana test = new Settimana("prova test");
		AgendaSettimanale as1 = new AgendaSettimanale(test);
		Giornata mar = as1.getGiornata(1);
		mar.getImpegni()[0].setImpegno("Esame Java");
		for (Giornata g : as1.settimana.getGiornate()) {
			System.out.println( g.getNome() +  as1.getImpegno(g, 0));
			
		}
		
	}
	
}

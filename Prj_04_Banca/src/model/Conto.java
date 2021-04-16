package model;

public class Conto {

	public int numeroConto;
	private double saldo;
	private static int contatore = 0;
	public Cliente[] titolare;
	
	public Conto(Cliente[] titolare) {
	
		this.numeroConto = ++contatore;
		this.titolare = titolare;
		this.saldo = 0.0;
		System.out.println("Nuovo conto numero "+this.numeroConto+" creato con successo!");
		
	}

	public void versamento(double ammontare) {
		this.saldo += ammontare;
	}
	
	public void prelievo(double ammontare) {
		if (this.saldo >= ammontare)
		this.saldo -= ammontare;
		else 
			System.out.println("Non puoi prelevare " + ammontare + " disponibilità: " +this.saldo);
		
	}
	
	
	@Override
	public String toString() {
		
		String titolari = "";
		for (int i = 0; i < titolare.length; i++) {
			titolari += titolare[i];
			titolari += ", ";
		}
		
		return this.numeroConto+") "+ titolari + " saldo: "+this.saldo ;
	}
	
}

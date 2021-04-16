package model;

public class Conto {

	private static int contatore = 1;
	
	private Cliente titolare;
	private int numero;
	
	public Conto(Cliente c) {
		this.titolare = c;
		this.numero = Conto.contatore++;
	}

	public Cliente getTitolare() {
		return titolare;
	}

	public void setTitolare(Cliente titolare) {
		this.titolare = titolare;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Conto [titolare=" + titolare + ", numero=" + numero + "]";
	}

	
	
}

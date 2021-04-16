package model;

public class Provincia implements Comparable<Provincia>{

	private String regione,comune;
	private int maschi,femmine,totale;

	public Provincia(String regione, String comune, int maschi, int femmine, int totale) {
		this.regione = regione;
		this.comune = comune;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}
	
	public Provincia () {}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getMaschi() {
		return maschi;
	}

	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}

	public int getFemmine() {
		return femmine;
	}

	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

	@Override
	public String toString() {
		return "Provincia [regione=" + regione + ", comune=" + comune + ", maschi=" + maschi + ", femmine=" + femmine
				+ ", totale=" + totale + "]";
	}

	@Override
	public int compareTo(Provincia arg0) {
		// TODO Auto-generated method stub
		return this.regione.compareTo(arg0.regione);
	}
	
	
	
	
}

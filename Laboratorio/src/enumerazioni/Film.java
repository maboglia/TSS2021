package enumerazioni;

public class Film {

	String titolo;
	Genere genere;
	
	public Film(String titolo, Genere genere) {
		this.titolo = titolo;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", genere=" + genere + "]";
	}
	
	
	
}

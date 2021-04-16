package model;

public class Voto {

	private String materia;
	private int valutazione;
	
	public Voto(String materia, int valutazione) {
		setMateria(materia);
		setValutazione(valutazione);
	}

	public Voto(int valutazione) {
		setMateria("Test laboratorio");
		setValutazione(valutazione);
	}
	
	public int getValutazione() {
		return valutazione;
	}
	private void setValutazione(int valutazione) {

		if (valutazione >= 0 && valutazione <= 30)
		this.valutazione = valutazione;
	}
	public String getMateria() {
		return materia;
	}
	private void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Voto [materia=" + materia + ", valutazione=" + valutazione + "]";
	}
	
	
	
	
}

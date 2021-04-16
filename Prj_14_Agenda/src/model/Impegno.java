package model;

public class Impegno {

	private String ora;
	private String impegno;

	public Impegno(String ora, String impegno) {
		this.ora = ora;
		this.impegno = impegno;
	}

	public String getOra() {
		return ora;
	}

	public void setOra(String ora) {
		this.ora = ora;
	}

	public String getImpegno() {
		return impegno;
	}

	public void setImpegno(String impegno) {
		this.impegno = impegno;
	}

	@Override
	public String toString() {
		return "[ora=" + ora + ", impegno=" + impegno + "]";
	}
	
	
	
	
	
}

package model;

public class SpezieOfficinali extends Spezie implements Refrigerabile{

	@Override
	public void refrigera() {
		System.out.println(Refrigerabile.ETICHETTA);
		System.out.println("le metto in una busta sigillatta in frigorifero alimentare");
		
	}

}

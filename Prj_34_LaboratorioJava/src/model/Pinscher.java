package model;

public class Pinscher extends Cane implements Pericoloso {

	@Override
	public void prevenzione() {
		System.out.println("non guardarlo mai negli occhi!!!!!!!");
		this.razza = "pinscher";
	}

}

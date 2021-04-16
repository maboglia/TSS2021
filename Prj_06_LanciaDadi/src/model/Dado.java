package model;

import java.util.Random;

public class Dado {

	byte facce;
	Random random;

	public Dado(byte facce) {
		this.facce = facce;
		this.random = new Random();
	}
	
	public byte lancia() {
		return  (byte) (this.random.nextInt(this.facce) + 1);
	}
	
	
	
}

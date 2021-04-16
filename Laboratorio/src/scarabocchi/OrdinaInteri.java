package scarabocchi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import model.Voto;

public class OrdinaInteri {

	public static void main(String[] args) {

		int[] voti = {30,26,28,24,22};
		
		Arrays.sort(voti);
	
		for (int i : voti) {
			System.out.println(i);
		}
		
		ArrayList<Integer> voti2 = new ArrayList<>();
		voti2.add(30);
		voti2.add(26);
		voti2.add(28);
		voti2.add(24);
		voti2.add(22);

		Collections.sort(voti2);
		
		for (Integer integer : voti2) {
			System.out.println(integer);
		}
	
		
		ArrayList<Voto> voti3 = new ArrayList<Voto>();
		voti3.add(new Voto(30));
		voti3.add(new Voto(26));
		voti3.add(new Voto(28));
		voti3.add(new Voto(24));
		voti3.add(new Voto(22));		
	
		//Collections.sort(voti3);
		
		for (Voto voto : voti3) {
			System.out.println(voto);
		}
	}

}

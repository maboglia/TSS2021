package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile02 {

	public static void main(String[] args) {

		int somma = 0;
		int counter = 0;
		double media = 0;
		
		File f = new File("documenti/voti.txt");
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				counter++;
				somma += sc.nextInt();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		media = (double) somma / counter;
		System.out.println("La media dei voti è: " + media);
		
		
	}

}

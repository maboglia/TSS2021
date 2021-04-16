package eccezioni;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFile01 {

	
	public static void main(String[] args) {
		
		
		File f = new File("documenti/voti.txt");
		FileReader fr  = null;
		
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			
			System.out.println(s);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
}

package eccezioni;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import database.DB;
import model.Studente;

public class ScriviFile01 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("documenti/studenti.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			DB db = new DB();
			for (Studente s : db.getStudentiAL()) {
				System.out.println(s);
				pw.println(s);
			}
			pw.close();
			System.out.println("finito");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

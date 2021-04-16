package controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Provincia;

public class ProvinciaCtrl {

	public void copiaFile() {
		 try (
				 FileReader fr = new FileReader("documenti/popolazione_italiana_regione.csv");
				 FileWriter fw = new FileWriter("documenti/pop_ita.txt");
				 )  {
			 
			 int c = 0;
			 while (  (c = fr.read() ) != -1   ) {
				 System.out.println(c +": "+ ( (char) c));
				 fw.write(c);
			 }
		
		 } catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
	
	public List<Provincia> leggiConScanner() {
		List<Provincia> lp = new ArrayList<>();
		try (Scanner sc = new Scanner(new File("documenti/pop_ita.txt"))) {
			
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				String[] split = s.split(",");
				lp.add(new Provincia(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4])));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return lp;
		
	}
	
	public void copiaFileBinario() {
		try(
				FileInputStream fis = new FileInputStream("documenti/img.png");
				FileOutputStream fos = new FileOutputStream("documenti/img2.png");
				){
			
			int c = 0;
			while (  (c= fis.read()) != -1      ) {
				fos.write(c);
			}
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void nuovoCopiaFile() {
		
		Path sorgente = Paths.get("documenti", "pop_ita.txt");
		Path destinazione = Paths.get("documenti", "pop_ita2.txt");

		try {
			Files.copy(sorgente, destinazione);
			System.out.println("finito");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void leggiURL() {
		
		final String SITO_WEB = "https://www.thymeleaf.org/";
		
		InputStream is = null;
		BufferedInputStream bis = null;
		
		try {
			
			URL url = new URL(SITO_WEB);
			is = url.openStream();
			bis = new BufferedInputStream(is);
			int c = 0;
			while ( (c=  bis.read()) != -1  ) {
				System.out.print((char) c);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
}

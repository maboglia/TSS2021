package controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ParoleCtrl {

	private List<String> parole;
	
	public ParoleCtrl() {
		try {
			
			this.parole = Files
						.lines(Paths.get("docs/parole.txt"))
						.collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> getParole() {
		return parole;
	}
	
	
}

package model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.Studente;

public class StudenteTest {

	@Test
	public void testOggetto() {
		Studente s = new Studente("mauro", "bogliaccino");
		assertTrue(s==null);
	}
	@Test
	public void testNome() {
		Studente s = new Studente("mauro", "bogliaccino");
		assertTrue(s.getNome().startsWith("m"));
	}
		
	
}

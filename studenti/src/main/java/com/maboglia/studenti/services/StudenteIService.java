package com.maboglia.studenti.services;

import java.util.List;

import com.maboglia.studenti.entities.Studente;

public interface StudenteIService {

	List<Studente> getStudenti();
	Studente getOne(int id);
	
	
}

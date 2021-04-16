package com.maboglia.studenti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.studenti.entities.Studente;
import com.maboglia.studenti.repos.StudentiRepo;

@Service
public class StudenteService implements StudenteIService {

	@Autowired
	private StudentiRepo db;
	
	@Override
	public List<Studente> getStudenti() {
		return db.findAll();
	}

	@Override
	public Studente getOne(int id) {
		return db.getOne(id);
	}

}

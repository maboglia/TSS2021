package com.maboglia.studenti.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.studenti.entities.Studente;

public interface StudentiRepo extends JpaRepository<Studente, Integer> {

}

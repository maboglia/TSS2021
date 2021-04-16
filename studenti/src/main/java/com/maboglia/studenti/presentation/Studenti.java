package com.maboglia.studenti.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maboglia.studenti.services.StudenteService;

@Controller
public class Studenti {

	@Autowired
	private StudenteService servizio;
	
	@RequestMapping("/test")
	public String trovaTutti() {
		System.out.println("test");
		return "test";
	}	
	@RequestMapping("/tost")
	public String trovaTutte() {
		System.out.println("tost");
		return "tost";
	}
	
}

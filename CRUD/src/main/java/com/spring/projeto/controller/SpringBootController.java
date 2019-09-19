package com.spring.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	private List<String> alunos;
	
	public SpringBootController() {
		alunos = new ArrayList<>();
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<String> get() {
		return alunos;
	}
	
	@RequestMapping(value = "/teste/load", method = RequestMethod.GET)
	public void loadList(){
		alunos.add("Jose");
		alunos.add("Maria");
		alunos.add("Alyson");
		
	}
	
	
	@RequestMapping(value = "/teste/post", method = RequestMethod.POST)
	public void postAluno(String aluno){
		alunos.add(aluno);
	}

}

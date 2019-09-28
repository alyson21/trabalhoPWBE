package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Atleta;
import com.cotemig.SpringBDController.repository.AtletaRepository;

@Service
public class AtletaServiceImpl implements AtletaService {
	
	@Autowired
	AtletaRepository AtletaRepository; 

	@Override
	public Optional<Atleta> getAtletaById(Integer id) {
		return AtletaRepository.findById(id);
	}

	@Override
	public List<Atleta> getAllAtletas() {
		return AtletaRepository.findAll();
	}

	@Override
	public void deleteAllAtletas() {
		AtletaRepository.deleteAll();
	}

	@Override
	public void deleteAtletaById(Integer id) {
		AtletaRepository.deleteById(id);
	}

	@Override
	public void updateAtletaById(Integer id, Atleta atleta) {
		
		Optional<Atleta> getAtleta = getAtletaById(id);
		getAtleta.get().setNome(atleta.getNome());
		getAtleta.get().setModalidade(atleta.getModalidade());
		getAtleta.get().setPosicao(atleta.getPosicao());
		getAtleta.get().setIdade(atleta.getIdade());
		getAtleta.get().setTime(atleta.getTime());
		
		
		AtletaRepository.save(atleta);
	}
	
	@Override
	public void updateAtleta(Atleta atleta) {
		AtletaRepository.save(atleta);
	}

	@Override
	public void insertAtleta(Atleta atleta) {
		AtletaRepository.save(atleta);
	}
}
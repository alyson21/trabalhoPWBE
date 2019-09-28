package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Atleta;

public interface AtletaService {
	Optional<Atleta> getAtletaById(Integer id);
	List<Atleta> getAllAtletas();
	void deleteAllAtletas();
	void deleteAtletaById(Integer id);
	void updateAtletaById(Integer id, Atleta atleta);
	void updateAtleta(Atleta atleta);
	void insertAtleta(Atleta atleta);
}

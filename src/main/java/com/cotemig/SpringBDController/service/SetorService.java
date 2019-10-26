package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Setor;



public interface SetorService {
	
	Optional<Setor> getById(Integer id);
	List<Setor> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Setor perfil);
	void update(Setor setor);
	void insert(Setor setor);

}

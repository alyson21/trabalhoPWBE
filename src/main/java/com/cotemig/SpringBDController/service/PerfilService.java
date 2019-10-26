package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Perfil;

public interface PerfilService {
	
	Optional<Perfil> getById(Integer id);
	List<Perfil> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Perfil perfil);
	void update(Perfil perfil);
	void insert(Perfil perfil);

}

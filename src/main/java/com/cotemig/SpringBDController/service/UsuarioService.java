package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Usuario;

public interface UsuarioService {
	
	Optional<Usuario> getById(Integer id);
	List<Usuario> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Usuario usuario);
	void update(Usuario usuario);
	void insert(Usuario usuario);

}

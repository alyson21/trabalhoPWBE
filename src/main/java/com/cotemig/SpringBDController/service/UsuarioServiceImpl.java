package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Usuario;
import com.cotemig.SpringBDController.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository UsuarioRepository; 

	@Override
	public Optional<Usuario> getById(Integer id) {
		return UsuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> getAll() {
		return UsuarioRepository.findAll();
	}

	@Override
	public void deleteAll() {
		UsuarioRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		UsuarioRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, Usuario usuario) {
		
		Optional<Usuario> getUsuario = getById(id);
		getUsuario.get().setNome(usuario.getNome());
		getUsuario.get().setSenha(usuario.getSenha());
		UsuarioRepository.save(usuario);
	}
	@Override
	public void update(Usuario usuario) {
		UsuarioRepository.save(usuario);
	}

	@Override
	public void insert(Usuario usuario) {
		UsuarioRepository.save(usuario);
	}
}
package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Perfil;
import com.cotemig.SpringBDController.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService {
	
	@Autowired
	PerfilRepository PerfilRepository; 

	@Override
	public Optional<Perfil> getById(Integer id) {
		return PerfilRepository.findById(id);
	}

	@Override
	public List<Perfil> getAll() {
		return PerfilRepository.findAll();
	}

	@Override
	public void deleteAll() {
		PerfilRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		PerfilRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, Perfil perfil) {
		
		Optional<Perfil> getPerfil = getById(id);
		getPerfil.get().setDescricao(perfil.getDescricao());
		PerfilRepository.save(perfil);
	}
	@Override
	public void update(Perfil perfil) {
		PerfilRepository.save(perfil);
	}

	@Override
	public void insert(Perfil perfil) {
		PerfilRepository.save(perfil);
	}
}
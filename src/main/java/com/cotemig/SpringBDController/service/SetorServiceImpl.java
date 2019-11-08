package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Setor;
import com.cotemig.SpringBDController.repository.SetorRepository;

@Service
public class SetorServiceImpl implements SetorService {
	
	@Autowired
	SetorRepository SetorRepository; 

	@Override
	public Optional<Setor> getById(Integer id) {
		return SetorRepository.findById(id);
	}

	@Override
	public List<Setor> getAll() {
		return SetorRepository.findAll();
	}

	@Override
	public void deleteAll() {
		SetorRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		SetorRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, Setor setor) {
		
		Optional<Setor> getSetor = getById(id);
		getSetor.get().setNome(setor.getNome());
		SetorRepository.save(setor);
	}
	@Override
	public void update(Setor setor) {
		SetorRepository.save(setor);
	}

	@Override
	public void insert(Setor setor) {
		SetorRepository.save(setor);
	}
}
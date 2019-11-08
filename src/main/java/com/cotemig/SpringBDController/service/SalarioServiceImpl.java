package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Salario;
import com.cotemig.SpringBDController.repository.SalarioRepository;

@Service
public class SalarioServiceImpl implements SalarioService {
	
	@Autowired
	SalarioRepository SalarioRepository; 

	@Override
	public Optional<Salario> getById(Integer id) {
		return SalarioRepository.findById(id);
	}

	@Override
	public List<Salario> getAll() {
		return SalarioRepository.findAll();
	}

	@Override
	public void deleteAll() {
		SalarioRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		SalarioRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, Salario salario) {
		
		Optional<Salario> getSalario = getById(id);
		getSalario.get().setValor(salario.getValor());
		SalarioRepository.save(salario);
	}
	@Override
	public void update(Salario salario) {
		SalarioRepository.save(salario);
	}

	@Override
	public void insert(Salario salario) {
		SalarioRepository.save(salario);
	}
}
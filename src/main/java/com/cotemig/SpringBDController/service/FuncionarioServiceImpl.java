package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Funcionario;
import com.cotemig.SpringBDController.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	FuncionarioRepository FuncionarioRepository; 

	@Override
	public Optional<Funcionario> getById(Integer id) {
		return FuncionarioRepository.findById(id);
	}

	@Override
	public List<Funcionario> getAll() {
		return FuncionarioRepository.findAll();
	}

	@Override
	public void deleteAll() {
		FuncionarioRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		FuncionarioRepository.deleteById(id);
	}

	@Override
	public void updateById(Integer id, Funcionario funcionario) {
		
		Optional<Funcionario> getFuncionario = getById(id);
		getFuncionario.get().setNome(funcionario.getNome());
		getFuncionario.get().setIdSalario(funcionario.getIdSalario());
		
		FuncionarioRepository.save(funcionario);
	}
	
	@Override
	public void update(Funcionario funcionario) {
		FuncionarioRepository.save(funcionario);
	}

	@Override
	public void insert(Funcionario funcionario) {
		FuncionarioRepository.save(funcionario);
	}
}
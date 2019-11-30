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
	FuncionarioRepository funcionarioRepository; 

	@Override
	public Optional<Funcionario> getById(Integer id) {
		return funcionarioRepository.findById(id);
	}

	@Override
	public List<Funcionario> getAll() {
		return funcionarioRepository.findAll();
	}

	@Override
	public void deleteAll() {
		funcionarioRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		funcionarioRepository.deleteById(id);
	}

	@Override
	public void updateById(Integer id, Funcionario funcionario) {
		
		Optional<Funcionario> getFuncionario = getById(id);
		getFuncionario.get().setNome(funcionario.getNome());
		getFuncionario.get().setSalario(funcionario.getSalario());
		
		funcionarioRepository.save(funcionario);
	}
	
	@Override
	public void update(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	@Override
	public void insert(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
}
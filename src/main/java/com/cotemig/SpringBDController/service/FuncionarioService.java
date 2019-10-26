package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Funcionario;

public interface FuncionarioService {
	
	Optional<Funcionario> getById(Integer id);
	List<Funcionario> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Funcionario funcionario);
	void update(Funcionario funcionario);
	void insert(Funcionario funcionario);

}

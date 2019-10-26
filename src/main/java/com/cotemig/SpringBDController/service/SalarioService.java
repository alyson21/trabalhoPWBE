package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Salario;

public interface SalarioService {
	
	Optional<Salario> getById(Integer id);
	List<Salario> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Salario salario);
	void update(Salario salario);
	void insert(Salario salario);

}

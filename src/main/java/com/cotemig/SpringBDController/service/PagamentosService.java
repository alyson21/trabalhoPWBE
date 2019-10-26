package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Pagamentos;

public interface PagamentosService {
	
	Optional<Pagamentos> getById(Integer id);
	List<Pagamentos> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Pagamentos pagamentos);
	void update(Pagamentos pagamentos);
	void insert(Pagamentos pagamentos);

}

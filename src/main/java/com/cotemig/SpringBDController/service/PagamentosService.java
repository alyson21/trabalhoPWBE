package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Pagamento;

public interface PagamentosService {
	
	Optional<Pagamento> getById(Integer id);
	List<Pagamento> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Pagamento pagamentos);
	void update(Pagamento pagamentos);
	void insert(Pagamento pagamentos);

}

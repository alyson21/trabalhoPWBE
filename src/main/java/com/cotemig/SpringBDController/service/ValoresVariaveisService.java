package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Pagamento;
import com.cotemig.SpringBDController.model.ValoresVariaveis;

public interface ValoresVariaveisService {

	Optional<ValoresVariaveis> getById(Integer id);
	List<ValoresVariaveis> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, ValoresVariaveis valoresVariaveis);
	void update(ValoresVariaveis valoresVariaveis);
	void insert(ValoresVariaveis valoresVariaveis);
	List<Pagamento> findPagamentoByCompetencia(Integer competencia);
	Pagamento findPagamentoByCompetenciaID(Integer competencia, Integer funcionario);
	

}

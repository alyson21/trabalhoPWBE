package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Pagamento;
import com.cotemig.SpringBDController.repository.PagamentosRepository;

@Service
public class PagamentosServiceImpl implements PagamentosService {
	
	@Autowired
	PagamentosRepository PagamentosRepository; 

	@Override
	public Optional<Pagamento> getById(Integer id) {
		return PagamentosRepository.findById(id);
	}

	@Override
	public List<Pagamento> getAll() {
		return PagamentosRepository.findAll();
	}

	@Override
	public void deleteAll() {
		PagamentosRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		PagamentosRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, Pagamento pagamentos) {
		
		Optional<Pagamento> getPagamentos = getById(id);
		getPagamentos.get().setTotal(pagamentos.getTotal());
		PagamentosRepository.save(pagamentos);
	}
	@Override
	public void update(Pagamento pagamentos) {
		PagamentosRepository.save(pagamentos);
	}

	@Override
	public void insert(Pagamento pagamentos) {
		PagamentosRepository.save(pagamentos);
	}
}
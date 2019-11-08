package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.ValoresVariaveis;
import com.cotemig.SpringBDController.repository.ValoresVariaveisRepository;

@Service
public class ValoresVariaveisServiceImpl implements ValoresVariaveisService {
	
	@Autowired
	ValoresVariaveisRepository ValoresVariaveisRepository; 

	@Override
	public Optional<ValoresVariaveis> getById(Integer id) {
		return ValoresVariaveisRepository.findById(id);
	}

	@Override
	public List<ValoresVariaveis> getAll() {
		return ValoresVariaveisRepository.findAll();
	}

	@Override
	public void deleteAll() {
		ValoresVariaveisRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		ValoresVariaveisRepository.deleteById(id);
	}
	@Override
	public void updateById(Integer id, ValoresVariaveis valoresVariaveis) {
		
		Optional<ValoresVariaveis> getValoresVariaveis = getById(id);
		getValoresVariaveis.get().setValor(valoresVariaveis.getValor());
		ValoresVariaveisRepository.save(valoresVariaveis);
	} 
	@Override
	public void update(ValoresVariaveis valoresVariaveis) {
		ValoresVariaveisRepository.save(valoresVariaveis);
	}

	@Override
	public void insert(ValoresVariaveis valoresVariaveis) {
		ValoresVariaveisRepository.save(valoresVariaveis);
	}
}
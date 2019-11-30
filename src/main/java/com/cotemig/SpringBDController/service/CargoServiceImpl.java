package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Cargo;
import com.cotemig.SpringBDController.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	CargoRepository CargoRepository; 

	@Override
	public Optional<Cargo> getById(Integer id) {
		return CargoRepository.findById(id);
	}

	@Override
	public List<Cargo> getAll() {
		return CargoRepository.findAll();
	}

	@Override
	public void deleteAll() {
		CargoRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		CargoRepository.deleteById(id);
	}

	@Override
	public void updateById(Integer id, Cargo cargo) {
		
		Optional<Cargo> getCargo = getById(id);
		getCargo.get().setNome(cargo.getNome());
		getCargo.get().setSalario(cargo.getSalario());
		CargoRepository.save(cargo);
	}
	
	@Override
	public void update(Cargo cargo) {
		CargoRepository.save(cargo);
	}

	@Override
	public void insert(Cargo cargo) {
		CargoRepository.save(cargo);
	}
}
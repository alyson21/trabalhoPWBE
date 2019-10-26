package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Cargo;

public interface CargoService {
	
	Optional<Cargo> getById(Integer id);
	List<Cargo> getAll();
	void deleteAll();
	void deleteById(Integer id);
	void updateById(Integer id, Cargo cargo);
	void update(Cargo cargo);
	void insert(Cargo cargo);

}

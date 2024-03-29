package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Cargo;

@Repository("cargoRepository")
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
	
}

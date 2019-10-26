package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Salario;
import com.cotemig.SpringBDController.model.Time;

@Repository("salarioRepository")
public interface SalarioRepository extends JpaRepository<Salario, Integer> {
	
}

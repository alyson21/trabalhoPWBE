package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.ValoresVariaveis;

@Repository("valoresVariaveisRepository")
public interface ValoresVariaveisRepository extends JpaRepository<ValoresVariaveis, Integer> {
	
}

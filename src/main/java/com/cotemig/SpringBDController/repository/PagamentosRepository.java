package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Pagamento;


@Repository("pagamentosRepository")
public interface PagamentosRepository extends JpaRepository<Pagamento, Integer> {
	
}

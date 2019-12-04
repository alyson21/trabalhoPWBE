package com.cotemig.SpringBDController.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Pagamento;
import com.cotemig.SpringBDController.model.ValoresVariaveis;

@Repository("valoresVariaveisRepository")
public interface ValoresVariaveisRepository extends JpaRepository<ValoresVariaveis, Integer> {
	@Query("SELECT p FROM Pagamento p WHERE competencia = :competencia")
	public List<Pagamento>findPagamentoByCompetencia(@Param("competencia") Integer competencia);
	
	@Query("SELECT p FROM Pagamento p WHERE competencia = :competencia and pagamento_funcionario_id = :idFuncionario")
	public Pagamento findPagamentoByCompetenciaId(@Param("competencia") Integer competencia, @Param("idFuncionario") Integer idFuncionario);
}

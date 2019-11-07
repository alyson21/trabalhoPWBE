package com.cotemig.SpringBDController.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamentos {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer competencia;
	private Integer idFuncionario;
	private Integer idValorVariavel;
	private Integer idSalario;
	private Double  total;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public Integer getIdValorVariavel() {
		return idValorVariavel;
	}
	public void setIdValorVariavel(Integer idValorVariavel) {
		this.idValorVariavel = idValorVariavel;
	}
	public Integer getIdSalario() {
		return idSalario;
	}
	public void setIdSalario(Integer idSalario) {
		this.idSalario = idSalario;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

}

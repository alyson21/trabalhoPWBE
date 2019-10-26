package com.cotemig.SpringBDController.model;

public class Pagamentos {
	
	private Integer id;
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

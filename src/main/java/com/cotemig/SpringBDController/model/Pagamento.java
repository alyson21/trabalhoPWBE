package com.cotemig.SpringBDController.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pagamento {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer competencia;
	@ManyToOne
	@JoinColumn(name = "pagamento_funcionario_id")
	private Funcionario funcionario;
	@OneToMany
	@JoinColumn(name = "pagamento_valores_id")
	private List<ValoresVariaveis> valoresVariaveis;
	@ManyToOne
	@JoinColumn(name = "pagamento_salario_id")
	private Salario salario;
	private Double total;
	
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
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	public List<ValoresVariaveis> getValoresVariaveis() {
		return valoresVariaveis;
	}
	public void setValoresVariaveis(List<ValoresVariaveis> valoresVariaveis) {
		this.valoresVariaveis = valoresVariaveis;
	}
	
}

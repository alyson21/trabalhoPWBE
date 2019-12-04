package com.cotemig.SpringBDController.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Funcionario {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private char sexo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	private String cpf;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataAdmissao;
	@ManyToOne
	@JoinColumn(name = "id_salario")
	private Salario salario;
	@ManyToOne
	@JoinColumn(name = "id_setor")
	private Setor setor;
	@OneToMany
	@JoinColumn(name = "funcionario_id")
	private List<Pagamento> pagamento;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public List<Pagamento> getPagamento() {
		return pagamento;
	}
	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
}

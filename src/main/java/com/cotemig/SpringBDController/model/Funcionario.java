package com.cotemig.SpringBDController.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Integer idSalario;
	private Integer idSetor;
	
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
	public Integer getIdSalario() {
		return idSalario;
	}
	public void setIdSalario(Integer idSalario) {
		this.idSalario = idSalario;
	}
	public Integer getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
	}

}

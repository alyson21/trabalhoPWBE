package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Funcionario;
import com.cotemig.SpringBDController.model.Pagamentos;
import com.cotemig.SpringBDController.model.Salario;
import com.cotemig.SpringBDController.model.Time;
import com.cotemig.SpringBDController.model.Usuario;

@Repository("usuarioRepository")
public interface PagamentosRepository extends JpaRepository<Usuario, Integer> {
	
}

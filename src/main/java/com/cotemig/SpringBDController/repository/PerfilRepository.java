package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cotemig.SpringBDController.model.Perfil;

@Repository("perfilRepository")
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
	
}

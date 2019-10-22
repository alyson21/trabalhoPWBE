package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Time;

@Repository("timeRepository")
public interface TimeRepository extends JpaRepository<Time, Integer> {
	
}

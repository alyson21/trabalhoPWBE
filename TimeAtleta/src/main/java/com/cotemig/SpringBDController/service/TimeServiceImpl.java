package com.cotemig.SpringBDController.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Time;
import com.cotemig.SpringBDController.repository.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService {
	
	@Autowired
	TimeRepository TimeRepository; 

	@Override
	public Optional<Time> getTimeById(Integer id) {
		return TimeRepository.findById(id);
	}

	@Override
	public List<Time> getAllTimes() {
		return TimeRepository.findAll();
	}

	@Override
	public void deleteAllTimes() {
		TimeRepository.deleteAll();
	}

	@Override
	public void deleteTimeById(Integer id) {
		TimeRepository.deleteById(id);
	}

	@Override
	public void updateTimeById(Integer id, Time time) {
		
		Optional<Time> getTime = getTimeById(id);
		getTime.get().setNome(time.getNome());;
		
		TimeRepository.save(time);
	}
	
	@Override
	public void updateTime(Time time) {
		TimeRepository.save(time);
	}

	@Override
	public void insertTime(Time time) {
		TimeRepository.save(time);
	}
}
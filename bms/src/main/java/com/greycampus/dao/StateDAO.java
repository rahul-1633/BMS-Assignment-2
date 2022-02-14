package com.greycampus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greycampus.entity.StateEntity;
import com.greycampus.intfc.StateRepo;

@Repository
public class StateDAO {

	@Autowired
	private StateRepo stateRepo;

	@Transactional
	public List<StateEntity> findByCountry(int id) {
		return stateRepo.findByCountry(id);
	}
	
}

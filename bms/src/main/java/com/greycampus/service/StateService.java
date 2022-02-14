package com.greycampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greycampus.dao.StateDAO;
import com.greycampus.entity.StateEntity;

@Service
public class StateService {
	
	@Autowired
	private StateDAO stateDAO;

	public List<StateEntity> findByCountry(int id) {
		return stateDAO.findByCountry(id);
	}
	
}

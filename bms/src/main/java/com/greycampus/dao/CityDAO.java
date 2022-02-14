package com.greycampus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greycampus.entity.CityEntity;
import com.greycampus.intfc.CityRepo;

@Repository
public class CityDAO {

	@Autowired
	private CityRepo cityRepo;

	@Transactional
	public List<CityEntity> findByState(int id) {
		return cityRepo.findByState(id);
	}
	
}

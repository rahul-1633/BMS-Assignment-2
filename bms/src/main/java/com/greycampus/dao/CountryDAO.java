package com.greycampus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greycampus.entity.Country;
import com.greycampus.intfc.CountryRepo;

@Repository
public class CountryDAO {
	
	@Autowired
	private CountryRepo countryRepo;

	@Transactional
	public Iterable<Country> findAll() {
		return countryRepo.findAll();
	}

	@Transactional
	public Country find(int id) {
		return countryRepo.findById(id).get();
	}

}

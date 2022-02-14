package com.greycampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greycampus.dao.CountryDAO;
import com.greycampus.entity.Country;

@Service
public class CountryService {

	@Autowired
	private CountryDAO countryDAO;

	public Iterable<Country> findAll() {
		return countryDAO.findAll();
	}

	public Country find(int id) {
		return countryDAO.find(id);
	}
}

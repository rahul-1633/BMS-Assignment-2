package com.greycampus.intfc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.Country;

@Repository("countryRepository")
public interface CountryRepo extends CrudRepository<Country, Integer> {

}

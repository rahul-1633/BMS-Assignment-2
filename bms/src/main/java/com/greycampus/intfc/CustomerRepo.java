package com.greycampus.intfc;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}

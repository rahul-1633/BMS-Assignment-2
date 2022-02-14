package com.greycampus.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greycampus.entity.Customer;
import com.greycampus.intfc.CustomerRepo;

@Repository
public class CustomerDAO {

	Calendar calendar = Calendar.getInstance();
	Date currentDate = new Date(calendar.getTime().getTime());

	@Autowired
	private CustomerRepo customerRepo;

	@Transactional
	public void save(Customer customer) {
		customerRepo.save(customer);
	}

	public void update(Customer customer, Integer phone) {
		Customer customerUpdate = customerRepo.findById(phone).get();
		customerUpdate.setPhone(customer.getPhone());
		customerUpdate.setHouse(customer.getHouse());
		customerUpdate.setStreet(customer.getStreet());
		customer.setCity(customer.getCity());
		customerUpdate.setPincode(customer.getPincode());
		customerUpdate.setState(customer.getState());
		customerUpdate.setCountry(customer.getCountry());
		customerUpdate.setUpdated_by(customer.getUpdated_by());
		customerUpdate.setUpdated_on(currentDate);
		customerRepo.save(customerUpdate);
	}

	@Transactional
	public List<Customer> find(Customer customer) {
		Customer customerFind = customerRepo.findById(customer.getPhone()).get();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerFind);
		return customerList;
	}

	@Transactional
	public void delete(Integer phone) {
		customerRepo.deleteById(phone);
	}

}

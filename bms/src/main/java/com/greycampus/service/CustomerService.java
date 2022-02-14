package com.greycampus.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greycampus.dao.CustomerDAO;
import com.greycampus.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	public CustomerDAO customerDAO;
	
	Calendar calendar = Calendar.getInstance();
    Date currentDate = new Date(calendar.getTime().getTime());
	
    public void save(Customer customer) {
		customer.setCreated_on(currentDate);
		customerDAO.save(customer);
	}
    
    public void update(Customer customer, Integer phone) {
    	customerDAO.update(customer, phone);
    }
    
    public List<Customer> find(Customer customer) {
    	List<Customer> list = customerDAO.find(customer);
		return list;
	}
    
    public void delete(Integer phone) {
    	customerDAO.delete(phone);
    }
     
}

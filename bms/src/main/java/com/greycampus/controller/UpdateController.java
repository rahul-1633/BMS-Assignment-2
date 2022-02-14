package com.greycampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.Customer;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/update")
public class UpdateController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String updateCustomer() {
		System.out.println("Data is updated");
		return "updateCustomerForm.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String updateCustomerFOrm(Customer customer, Integer phone) {
		customerService.update(customer, phone);
		return "updateCustomer.jsp";
	}

}
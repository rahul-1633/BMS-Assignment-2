package com.greycampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/delete")
public class DeleteController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String deleteCustomer() {
		return "deleteCustomerForm.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String deleteCustomerForm(Integer phone) {
		customerService.delete(phone);
		return "deleteCustomer.jsp";
	}

}
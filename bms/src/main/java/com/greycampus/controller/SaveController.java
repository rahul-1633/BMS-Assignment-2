package com.greycampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.greycampus.entity.Customer;
import com.greycampus.service.CityService;
import com.greycampus.service.CountryService;
import com.greycampus.service.CustomerService;
import com.greycampus.service.StateService;

@Controller
@RequestMapping(path = "/save")
public class SaveController {

	@Autowired
	public CustomerService customerService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@Autowired
	private CityService cityService;

	@RequestMapping(method = RequestMethod.GET)
	public String saveCustomer() {
		System.out.println("User Inserted");
		return "saveCustomerForm.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveCustomerForm(@Validated Customer customer, Errors errors) {
		if (errors.hasErrors()) {
			return "customerinsertForm.jsp";
		} else {
			customerService.save(customer);
			return "saveCustomer.jsp";
		}
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String index(ModelMap modelMap) {
//		modelMap.put("countries", countryService.findAll());
//		return "saveCustomerForm.jsp";
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "loadStatesByCountry/{id}", method = RequestMethod.GET)
//	public String loadStatesByCountry(@PathVariable("id") int id) {
//		Gson gson = new Gson();
//		return gson.toJson(stateService.findByCountry(id));
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "loadCitiesByState/{id}", method = RequestMethod.GET)
//	public String loadCitiesByState(@PathVariable("id") int id) {
//		Gson gson = new Gson();
//		return gson.toJson(cityService.findByState(id));
//	}

}

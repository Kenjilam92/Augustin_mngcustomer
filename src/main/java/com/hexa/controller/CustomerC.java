package com.hexa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hexa.model.customer;
import com.hexa.services.CustomerS;

@Controller
public class CustomerC {
	
	@Autowired private CustomerS service;
	@GetMapping("/customers")
	public String showCustomerList(Model model) {
		List<customer> lstcstmrs= service.ListAllCustomer();
		model.addAttribute("lstcstmrs",lstcstmrs);
		return "customers";
	}
	
	

}

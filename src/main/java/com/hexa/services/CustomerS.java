package com.hexa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.model.customer;
import com.hexa.repositories.CustomerR;

@Service
public class CustomerS {
	
	@Autowired private CustomerR repo;
	public List<customer> ListAllCustomer(){
		return (List<customer>) repo.findAll();
	}
	

}

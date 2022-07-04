package com.hexa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.hexa.model.customer;
import com.hexa.model.dependent;
//import com.hexa.repositories.CustomerR;
import com.hexa.repositories.DependentR;

@Service
public class DependentS {
	
	@Autowired private DependentR repo;
	
	public List<dependent> ListAllDependent(){
		return repo.findAll();
	}

}

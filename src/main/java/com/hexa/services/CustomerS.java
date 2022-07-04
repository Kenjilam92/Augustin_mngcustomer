package com.hexa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.model.customer;
import com.hexa.repositories.CustomerR;

@Service
public class CustomerS {
	
	@Autowired private CustomerR repo;
	
	public List<customer> ListAllCustomer(){
		return repo.findAll();
	}
	
	public void SaveCustomer(customer cstmr) {
		repo.save(cstmr);
	}
	
	public customer getCustomer(Integer customerId) throws CustomerNotFoundExecption{
		Optional<customer> result= repo.findById(customerId);
		if(result.isPresent()) {
			return result.get();
		}
		throw new CustomerNotFoundExecption("No customer with ID "+customerId+"was found");

	}
	
	public void deleteCustomer(Integer customerId) throws CustomerNotFoundExecption{
//		Integer ncstmrs =repo.countById(customerId);
//		if (ncstmrs == null || ncstmrs == 0) {
//			throw new CustomerNotFoundExecption("No customer with ID "+customerId+" was found");
//		}
//		repo.deleteById(customerId);
		Optional<customer> result= repo.findById(customerId);
		if(result.isEmpty()) {
			throw new CustomerNotFoundExecption("No customer with ID "+customerId+"was found");
		}
		repo.deleteById(customerId);
	}

}

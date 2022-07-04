package com.hexa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.hexa.model.customer;

public interface CustomerR extends JpaRepository<customer, Integer>{//CrudRepository<customer, Integer>{
	//public Integer countById(Integer customerId);

}

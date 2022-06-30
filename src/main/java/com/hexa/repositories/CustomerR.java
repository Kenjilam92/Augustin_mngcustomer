package com.hexa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hexa.model.customer;

public interface CustomerR extends CrudRepository<customer, Integer>{

}

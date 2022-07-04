package com.hexa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.hexa.model.dependent;

public interface DependentR extends JpaRepository<dependent, Integer>{

}

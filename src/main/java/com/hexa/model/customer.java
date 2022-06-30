package com.hexa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class customer {
	
	   // Define fields to use in the table
		@Id //primary key for id
		@GeneratedValue //auto generate the value for id
		private int customerId; //Id to identify the customer
		
		private String firstName; //customer first name
		private String middleName;//customer middle name
		private String lastName;//customer last name
		private String email;//customer email address
		private String phoneNumber;//customer phone number
		private Date   enrolldate;// date when the customer was enrolled in the system
		private String address;//customer physical address
		private String cityAddress;//city of physical address
		private String zipcodeAddress;//Zip-code of address
		private String stateAddress;//State; department; province
		
		@OneToMany( mappedBy = "customers")
		private List<dependent> dependents;

}

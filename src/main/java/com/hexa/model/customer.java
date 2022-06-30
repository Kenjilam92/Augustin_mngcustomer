package com.hexa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class customer {
	
	   // Define fields to use in the table
		@Id //primary key for id
		@GeneratedValue(strategy=GenerationType.IDENTITY) //auto generate the value for id
		private Integer customerId; //Id to identify the customer
		@Column(nullable = false, length =45)
		private String firstName; //customer first name
		@Column
		private String middleName;//customer middle name
		@Column
		private String lastName;//customer last name
		@Column(nullable=false, unique=true)
		private String email;//customer email address
		@Column
		private String phoneNumber;//customer phone number
		@Column
		private Date   enrolldate;// date when the customer was enrolled in the system
		@Column
		private String address;//customer physical address
		@Column
		private String cityAddress;//city of physical address
		@Column
		private String zipcodeAddress;//Zip-code of address
		@Column
		private String stateAddress;//State; department; province
		
		@Column
		@OneToMany( mappedBy = "customers")
		private List<dependent> dependents;

		/**
		 * 
		 */
		public customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param customerId
		 * @param firstName
		 * @param middleName
		 * @param lastName
		 * @param email
		 * @param phoneNumber
		 * @param enrolldate
		 * @param address
		 * @param cityAddress
		 * @param zipcodeAddress
		 * @param stateAddress
		 * @param dependents
		 */
		public customer(Integer customerId, String firstName, String middleName, String lastName, String email,
				String phoneNumber, Date enrolldate, String address, String cityAddress, String zipcodeAddress,
				String stateAddress, List<dependent> dependents) {
			this.customerId = customerId;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.enrolldate = enrolldate;
			this.address = address;
			this.cityAddress = cityAddress;
			this.zipcodeAddress = zipcodeAddress;
			this.stateAddress = stateAddress;
			this.dependents = dependents;
		}

		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Date getEnrolldate() {
			return enrolldate;
		}

		public void setEnrolldate(Date enrolldate) {
			this.enrolldate = enrolldate;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCityAddress() {
			return cityAddress;
		}

		public void setCityAddress(String cityAddress) {
			this.cityAddress = cityAddress;
		}

		public String getZipcodeAddress() {
			return zipcodeAddress;
		}

		public void setZipcodeAddress(String zipcodeAddress) {
			this.zipcodeAddress = zipcodeAddress;
		}

		public String getStateAddress() {
			return stateAddress;
		}

		public void setStateAddress(String stateAddress) {
			this.stateAddress = stateAddress;
		}

		public List<dependent> getDependents() {
			return dependents;
		}

		public void setDependents(List<dependent> dependents) {
			this.dependents = dependents;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((cityAddress == null) ? 0 : cityAddress.hashCode());
			result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
			result = prime * result + ((dependents == null) ? 0 : dependents.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((enrolldate == null) ? 0 : enrolldate.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
			result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
			result = prime * result + ((stateAddress == null) ? 0 : stateAddress.hashCode());
			result = prime * result + ((zipcodeAddress == null) ? 0 : zipcodeAddress.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			customer other = (customer) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (cityAddress == null) {
				if (other.cityAddress != null)
					return false;
			} else if (!cityAddress.equals(other.cityAddress))
				return false;
			if (customerId == null) {
				if (other.customerId != null)
					return false;
			} else if (!customerId.equals(other.customerId))
				return false;
			if (dependents == null) {
				if (other.dependents != null)
					return false;
			} else if (!dependents.equals(other.dependents))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (enrolldate == null) {
				if (other.enrolldate != null)
					return false;
			} else if (!enrolldate.equals(other.enrolldate))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (middleName == null) {
				if (other.middleName != null)
					return false;
			} else if (!middleName.equals(other.middleName))
				return false;
			if (phoneNumber == null) {
				if (other.phoneNumber != null)
					return false;
			} else if (!phoneNumber.equals(other.phoneNumber))
				return false;
			if (stateAddress == null) {
				if (other.stateAddress != null)
					return false;
			} else if (!stateAddress.equals(other.stateAddress))
				return false;
			if (zipcodeAddress == null) {
				if (other.zipcodeAddress != null)
					return false;
			} else if (!zipcodeAddress.equals(other.zipcodeAddress))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "customer [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", enrolldate="
					+ enrolldate + ", address=" + address + ", cityAddress=" + cityAddress + ", zipcodeAddress="
					+ zipcodeAddress + ", stateAddress=" + stateAddress + ", dependents=" + dependents + "]";
		}
		
		

}

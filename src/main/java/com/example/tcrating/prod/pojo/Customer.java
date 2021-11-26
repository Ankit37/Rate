package com.example.tcrating.prod.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(name = "CustomerId", unique = true)
	private int customerId;
	
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Adress") 
	private String adress;
	
	@Column(name="Gender")
	private char gender;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Customer_Type")
	private String customerType;
	
	@Column(name="CustomerSubtype")
	private String customerSubtype;
	
	
	public Customer() {}
	
	
	public Customer(String firstName, String lastName, String adress, char gender, int age, String customerType,
			String customerSubtype) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.gender = gender;
		this.age = age;
		this.customerType = customerType;
		this.customerSubtype = customerSubtype;
	}



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerSubtype() {
		return customerSubtype;
	}
	public void setCustomerSubtype(String customerSubtype) {
		this.customerSubtype = customerSubtype;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", adress=" + adress + ", gender=" + gender + ", age=" + age + ", customerType="
				+ customerType + ", customerSubtype=" + customerSubtype + "]";
	}
	
	
	
	
	
}

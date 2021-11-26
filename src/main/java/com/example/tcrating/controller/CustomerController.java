package com.example.tcrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tcrating.Service.Agd1_Service;
import com.example.tcrating.Service.CustomerService;
import com.example.tcrating.prod.pojo.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	
	@Autowired
	private Agd1_Service agdService;

	@PostMapping("/customer")
	@Transactional
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		customerService.customerAdd(customer);
		agdService.populatingToAgdResources(customer.getCustomerId());
		
		//Will return the data of customer in JSON format
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);

	}

}

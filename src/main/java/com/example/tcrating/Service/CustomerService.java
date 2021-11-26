package com.example.tcrating.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tcrating.Repository.CustomerRepo;
import com.example.tcrating.prod.pojo.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Transactional
	public void customerAdd(Customer customer)
	{
		customerRepo.save(customer);
	}
	
}

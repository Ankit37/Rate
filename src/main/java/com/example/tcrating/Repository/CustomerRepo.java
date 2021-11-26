package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tcrating.prod.pojo.Customer;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Long>{

	@Query(value = "select customerId from  Customer c where  c.customerId=?1")
	public int findByCustomerId(int customerId);
	
	@Query(value = "select firstName from  Customer c where  c.customerId=?1")
	public String findByFirstName(int customerId);
	
	@Query(value = "select customerSubtype from  Customer c where  c.customerId=?1")
	public String findBySubtype(int customerId);;

	
	@Query(value = "select customerType from  Customer c where  c.customerId=?1")
	public String findBytype(int customerId);;
}

package com.example.tcrating.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.tcrating.Repository.Agd1ResourcesRepo;
import com.example.tcrating.exception.CustomerIdNotValidException;
import com.example.tcrating.prod.pojo.AGD1_Resources;

@Service
public class Agd1_Service {

	@Autowired
	private Agd1ResourcesRepo agd1Repo;

	public AGD1_Resources agd1Resources;

	public void populatingToAgdResources(Integer customerId) {
		System.out.println("customer id recevied to service class" + customerId);

		if (String.valueOf(customerId).length() < 8 || String.valueOf(customerId).length()>8) {
			throw new CustomerIdNotValidException("Id is not valid. Must be between of 8 number");
		}

		AGD1_Resources agd1Resources = new AGD1_Resources((7011 + customerId), 1, java.time.LocalDate.now(), null,
				customerId, (customerId + 100), 'A', 2, "PRE");

		agd1Repo.save(agd1Resources);

	}

}

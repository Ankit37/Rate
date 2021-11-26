package com.example.tcrating.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tcrating.Repository.RestDataRepo;
import com.example.tcrating.prod.pojo.RestDataConsumer;

@Service
public class RestDataService {

	@Autowired
	public RestDataRepo restDataRepo;

	@Autowired
	public RatedEventTableDataPopulate ratedEventTableDataPopulate;

	@Autowired
	private PopulatingInRatedEventMain populatingInRatedEventMain;
	
	@Transactional
	public void addNumber(RestDataConsumer data) {

		ratedEventTableDataPopulate.dataPopulate(data);
		populatingInRatedEventMain.PopulatingInRatedEventMethod(data);
		System.out.println("Return back to rest data service class");
		  restDataRepo.save(data);
		}

}

package com.example.tcrating.Service;

import java.util.Optional;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.tcrating.Repository.Ape1RatedEventRepo;
import com.example.tcrating.Repository.Pc9NumberAnalysisRepo;
import com.example.tcrating.Repository.SpecialNumberRepo;
import com.example.tcrating.exception.DataNotFoundException;
import com.example.tcrating.pojo.PC9_number_analysis;
import com.example.tcrating.prod.pojo.RestDataConsumer;

@Service
//@Scope("prototype")
public class RatedEventTableDataPopulate {

	@Autowired
	private SpecialNumberRepo specialNumberRepo;

	@Autowired
	private Pc9NumberAnalysisRepo pc9NumberAnalysisRepo;

	@Autowired
	private Ape1RatedEventRepo ape1RatedEventRepo;

	@Autowired
	private PopulatingInRatedEventMain populatingInRatedEventMain;

	public long numberAnalysisCheck(RestDataConsumer data) {

		
		Long number = data.getDialedDigits();

		for (int i = 0; i <= number.SIZE; i++) {
			if (pc9NumberAnalysisRepo.findByPrefix(number) == number ) {
				return number;
			} 
			else {
				number = number / 10;
			}
		}
		return 0;
	}

	public void dataPopulate(RestDataConsumer data) {

		try {
			if (data.getDialedDigits() == specialNumberRepo.findBySpecialNumber(data.getDialedDigits())) {
				System.out.println("Number is special Number");
			}
		} catch (Exception e) {
			{
				System.out.println("Going to number analysis method");
				numberAnalysisCheck(data);

			}
		}

	}

	// We need to fetch all the details from the DB and charge according to that
	// only.
	
	@Scope("prototype")
	public void PopulatingInRatedEvent(RestDataConsumer data) {
		populatingInRatedEventMain.PopulatingInRatedEventMethod(data);
	}

}

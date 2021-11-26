package com.example.tcrating.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tcrating.Repository.Agd1ResourcesRepo;
import com.example.tcrating.Repository.Ape1RatedEventRepo;
import com.example.tcrating.Repository.Ape1SubscriberOfferRepo;
import com.example.tcrating.Repository.BillingOfferRepo;
import com.example.tcrating.Repository.ChargeCodeRepo;
import com.example.tcrating.Repository.CustomerRepo;
import com.example.tcrating.Repository.Pc9NumberAnalysisRepo;
import com.example.tcrating.Repository.SpecialNumberRepo;
import com.example.tcrating.exception.CustomerIdNotValidException;
import com.example.tcrating.pojo.BillingOffer;
import com.example.tcrating.pojo.PC9_number_analysis;
import com.example.tcrating.prod.pojo.APE1SubscriberOffer;
import com.example.tcrating.prod.pojo.APE1_Rated_event;
import com.example.tcrating.prod.pojo.RestDataConsumer;

@Service

public class PopulatingInRatedEventMain {

	@Autowired
	private Ape1RatedEventRepo ape1RatedEventRepo;

	@Autowired
	private RatedEventTableDataPopulate ratedEventTableDataPopulate;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private Agd1ResourcesRepo agd1ResourcesRepo;

	@Autowired
	private Ape1SubscriberOfferRepo ape1SubscriberOfferRepo;

	@Autowired
	private Pc9NumberAnalysisRepo pc9NumberAnalysisRepo;

	@Autowired
	private SpecialNumberRepo specialNumberRepo;

	@Autowired
	private BillingOfferRepo billingOfferRepo;

	@Autowired
	private ChargeCodeRepo chargeCodeRepo;

	///private APE1_Rated_event ape1RatedEvent = new APE1_Rated_event();

	@Transactional
	public void PopulatingInRatedEventMethod(RestDataConsumer data)
	
	
	{
		 APE1_Rated_event ape1RatedEvent = new APE1_Rated_event();
		System.out.println("In Rated event table");
		System.out.println(data.getCustomerId());
		System.out.println(customerRepo.findByCustomerId(data.getCustomerId()));

		if (data.getCustomerId() == customerRepo.findByCustomerId(data.getCustomerId())
				&& data.getSourceNumber() == agd1ResourcesRepo.findByResourceValue(data.getCustomerId())) {

			ape1RatedEvent.setL3_dialed_digits(data.getDialedDigits());
			ape1RatedEvent.setSourceNumber(data.getSourceNumber());
			ape1RatedEvent.setCustomerId(Integer.toString(data.getCustomerId()));
			ape1RatedEvent.setCustomerName(customerRepo.findByFirstName(data.getCustomerId()));
			ape1RatedEvent.setCustomerType(customerRepo.findBytype(data.getCustomerId()));
			ape1RatedEvent.setCustomerSubtype(customerRepo.findBySubtype(data.getCustomerId()));

			ape1RatedEvent.setBillCycle(agd1ResourcesRepo.findByBillCycle(data.getCustomerId()));
			ape1RatedEvent.setResourceValue(agd1ResourcesRepo.findByResourceValue(data.getCustomerId()));
			ape1RatedEvent.setSubscriberId(agd1ResourcesRepo.findBySubscriber(data.getCustomerId()));

			ape1RatedEvent.setDuration(data.getDuration());

			try {
				if (data.getDialedDigits() == specialNumberRepo.findBySpecialNumber(data.getDialedDigits())) {
					ape1RatedEvent.setCountryCode("IND"); 
					ape1RatedEvent.setPrefix((long) specialNumberRepo.findBySpecialNumber(data.getDialedDigits()));

					ape1RatedEvent.setChargeCode(specialNumberRepo.findByChargeCode(data.getDialedDigits()));

					ape1RatedEvent.setRate((data.getDuration() / 60) * 2);
					ape1RatedEvent.setDescription("Special Number ");
					ape1RatedEvent.setVoiceType(specialNumberRepo.findByServiceType(data.getDialedDigits()));
					ape1RatedEvent.setCallDirection(specialNumberRepo.findByCallDirection(data.getDialedDigits()));

				}
			} catch (Exception e)

			{
				ape1RatedEvent.setCountryCode("IND"); // (pc9NumberAnalysisRepo.findByCountryCode(data.getDialedDigits()));

				long dialedDigits = ratedEventTableDataPopulate.numberAnalysisCheck(data);

				ape1RatedEvent.setPrefix(pc9NumberAnalysisRepo.findByPrefix(dialedDigits));
				ape1RatedEvent.setChargeCode(pc9NumberAnalysisRepo.findByChargeCode(dialedDigits));
				ape1RatedEvent
						.setRate((data.getDuration() / 60) * (chargeCodeRepo.findRate(ape1RatedEvent.getChargeCode())));
				ape1RatedEvent.setDescription(chargeCodeRepo.findDescription(ape1RatedEvent.getChargeCode()));
			}

			ape1RatedEvent.setOfferName(ape1SubscriberOfferRepo.findByofferName(ape1RatedEvent.getSubscriberId()));

			List name = billingOfferRepo.findChargeCode(ape1RatedEvent.getOfferName());

			for (int i = 0; i <= ape1SubscriberOfferRepo.findSize(ape1RatedEvent.getSubscriberId()); i++) {
				if (name.contains(ape1RatedEvent.getChargeCode())) {
					ape1RatedEvent
							.setOfferName(ape1SubscriberOfferRepo.findByofferName(ape1RatedEvent.getSubscriberId()));

				} else {
					System.out.println("Found in market level offer");
					ape1RatedEvent.setOfferName(billingOfferRepo.findMarketLevelOffer(ape1RatedEvent.getChargeCode()));
					System.out.println(ape1RatedEvent.getChargeCode());
				}

			}

			ape1RatedEvent.setSoc(billingOfferRepo.findBysoc(ape1RatedEvent.getOfferName()));

			ape1RatedEventRepo.save(ape1RatedEvent);
			System.out.println("Data Saved successfully");

		} else {
			throw new CustomerIdNotValidException("Customer Id or Source Number is  not Valid in customer table");
		}

	}

}

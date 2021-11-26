package com.example.tcrating.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tcrating.Repository.Ape1SubscriberOfferRepo;
import com.example.tcrating.Repository.BillingOfferRepo;
import com.example.tcrating.exception.OfferNotFoundException;
import com.example.tcrating.prod.pojo.APE1SubscriberOffer;

@Service
public class Ape1SubscriberOfferService {

	@Autowired
	private Ape1SubscriberOfferRepo ape1SubscriberOfferRepo;

	@Autowired
	private BillingOfferRepo billingOfferRepo;

	@Transactional
	public void addSubscriberOffer(APE1SubscriberOffer subscriberOffer) {

		String OfferName = subscriberOffer.getOfferName();

		if (!subscriberOffer.getOfferName().trim()
				.equalsIgnoreCase(billingOfferRepo.findByOfferName(OfferName).trim())) {
			throw new OfferNotFoundException("Offer not present in Database");
		}

		ape1SubscriberOfferRepo.save(subscriberOffer);
	}

}

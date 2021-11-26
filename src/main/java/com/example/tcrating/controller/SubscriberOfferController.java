package com.example.tcrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tcrating.Service.Ape1SubscriberOfferService;
import com.example.tcrating.prod.pojo.APE1SubscriberOffer;

@RestController
public class SubscriberOfferController {
	
	@Autowired
	private Ape1SubscriberOfferService subscriberOfferService;

	@PostMapping("/customer/offer")
	public ResponseEntity<APE1SubscriberOffer> addSubscriberOffer1(@RequestBody APE1SubscriberOffer subscriberOffer)
	{
		System.out.println(subscriberOffer+"Fetched");
		subscriberOfferService.addSubscriberOffer(subscriberOffer);
		
		return new ResponseEntity<APE1SubscriberOffer>(HttpStatus.OK);
	}
}

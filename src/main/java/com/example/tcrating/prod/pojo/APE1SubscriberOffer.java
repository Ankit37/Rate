package com.example.tcrating.prod.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.Query;

@Entity(name = "APE1_Subscriber_offer")
public class APE1SubscriberOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private long subscriberId;
	
	@Column(name="offer_name")
	private String offerName;
	private LocalDate effectiveDate;
	private LocalDate expirationDate;
	
	public long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public APE1SubscriberOffer(Long id, int subscriberId, String offerName, LocalDate effectiveDate,
			LocalDate expirationDate) {
		super();
		this.id = id;
		this.subscriberId = subscriberId;
		this.offerName = offerName;
		this.effectiveDate = effectiveDate;
		this.expirationDate = expirationDate;
	}
	
	public APE1SubscriberOffer() {}
		
}

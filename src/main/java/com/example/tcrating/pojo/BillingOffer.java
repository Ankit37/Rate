package com.example.tcrating.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Only creating getter as we are inserting manually in this table.
 * This is reference table which we used to add offer on customer profile.
 */

@Entity(name = "Billing_Offer")
public class BillingOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	

	@Column(name = "offer_name")
	private String offerName;
	private String soc;
	private Date effectiveDate;
	private Date expirationDate;
	private String chargeCode;
	
	public String getOfferName() {
		return offerName;
	}
	public String getSoc() {
		return soc;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	

	
	
}

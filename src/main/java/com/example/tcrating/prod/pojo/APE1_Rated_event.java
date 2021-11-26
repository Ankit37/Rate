package com.example.tcrating.prod.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class APE1_Rated_event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String customerName;
	private String customerId;
	private String customerType;
	private String customerSubtype;
	private long resourceValue;
	private long subscriberId;
	private int billCycle;
	private String offerName;
	private String soc;
	private String chargeCode;
	private double rate;
	private String description;
	private int callDirection;
	private Long prefix;
	private String countryCode;
	private char voiceType;
	private long l3_dialed_digits;
	private long sourceNumber;
	private int duration;
	
	
	
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public APE1_Rated_event() {}
	
	public APE1_Rated_event(String customerName, String customerId, String customerType, String customerSubtype,
			long resourceValue, long subscriberId, int billCycle, String offerName, String soc, String chargeCode,
			int rate, String description, int callDirection, Long prefix, String countryCode, char voiceType,
			long l3_dialed_digits, long sourceNumber) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerType = customerType;
		this.customerSubtype = customerSubtype;
		this.resourceValue = resourceValue;
		this.subscriberId = subscriberId;
		this.billCycle = billCycle;
		this.offerName = offerName;
		this.soc = soc;
		this.chargeCode = chargeCode;
		this.rate = rate;
		this.description = description;
		this.callDirection = callDirection;
		this.prefix = prefix;
		this.countryCode = countryCode;
		this.voiceType = voiceType;
		this.l3_dialed_digits = l3_dialed_digits;
		this.sourceNumber = sourceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerSubtype() {
		return customerSubtype;
	}
	public void setCustomerSubtype(String customerSubtype) {
		this.customerSubtype = customerSubtype;
	}
	public long getResourceValue() {
		return resourceValue;
	}
	public void setResourceValue(long resourceValue) {
		this.resourceValue = resourceValue;
	}
	public long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public int getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(int billCycle) {
		this.billCycle = billCycle;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCallDirection() {
		return callDirection;
	}
	public void setCallDirection(int callDirection) {
		this.callDirection = callDirection;
	}
	public Long getPrefix() {
		return prefix;
	}
	public void setPrefix(Long prefix) {
		this.prefix = prefix;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public char getVoiceType() {
		return voiceType;
	}
	public void setVoiceType(char voiceType) {
		this.voiceType = voiceType;
	}
	public long getL3_dialed_digits() {
		return l3_dialed_digits;
	}
	public void setL3_dialed_digits(long l3_dialed_digits) {
		this.l3_dialed_digits = l3_dialed_digits;
	}
	public long getSourceNumber() {
		return sourceNumber;
	}
	public void setSourceNumber(long sourceNumber) {
		this.sourceNumber = sourceNumber;
	}
	
	
	
	
	
}

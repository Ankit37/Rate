package com.example.tcrating.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Special_Number")
public class SpecialNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	
	private long specialNumber;
	private char ServiceType;
	private short CallDirection;
	private Date effectiveDate;
	private Date expirationDate;
	private String chargeCode;
	
	public long getSpecialNumber() {
		return specialNumber;
	}
	public char getServiceType() {
		return ServiceType;
	}
	public short getCallDirection() {
		return CallDirection;
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

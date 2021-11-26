package com.example.tcrating.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PC9_Number_Analysis")
public class PC9_number_analysis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	private long prefix;
	private Date effectiveDate;
	private String Service_type;
	private short CallDirection;
	
	
	private  char Drop_Indicator;
	private String CountryCode;
	private String Description;
	private Date expirationDate;
	private String chargeCode;
	
	
	public short getCallDirection() {
		return CallDirection;
	}
	
	public String getService_type() {
		return Service_type;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public long getPrefix() {
		return prefix;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public char getDrop_Indicator() {
		return Drop_Indicator;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public String getDescription() {
		return Description;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	
	
	
}

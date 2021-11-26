package com.example.tcrating.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Charge_Code")
public class ChargeCode {
	
	/*Not making setter as we are direct inserting into table and wont allow third party to update the database.
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long charge_code_seq;
	private String chargeCode;
	private float rate;
	private String description;
	private String line_Of_Business;
	
	public long getCharge_code_seq() {
		return charge_code_seq;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public float getRate() {
		return rate;
	}
	public String getDescription() {
		return description;
	}
	public String getLine_Of_Business() {
		return line_Of_Business;
	}
	
	
	
	
	

}

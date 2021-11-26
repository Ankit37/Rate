package com.example.tcrating.prod.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

@Entity(name = "RestDataConsumer")
public class RestDataConsumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Source_Number")

	private int sourceNumber;
	
	@Column(name="Customer_Id")
	private int customerId;

	@Column(name = "L3_Dialed_Digits")
	private long dialedDigits;

	private int duration;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getSourceNumber() {
		return sourceNumber;
	}

	public void setSourceNumber(int sourceNumber) {
		this.sourceNumber = sourceNumber;
	}

	public long getDialedDigits() {
		return dialedDigits;
	}

	public void setDialedDigits(long dialedDigits) {
		this.dialedDigits = dialedDigits;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	
}

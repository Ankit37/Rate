package com.example.tcrating.prod.pojo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "AGD1_Resources")
public class AGD1_Resources {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	

	private long resource_Value;
	private  int resource_type;
	private LocalDate effective_date;
	private LocalDate expiration_date;
	private int customerId;
	private int subscriberId;
	private  char subStatus;
	private int billCycle;
	private String paymentCategory;
	
	public long getResource_Value() {
		return resource_Value;
	}
	public void setResource_Value(long resource_Value) {
		this.resource_Value = resource_Value;
	}
	public int getResource_type() {
		return resource_type;
	}
	public void setResource_type(int resource_type) {
		this.resource_type = resource_type;
	}
	public LocalDate getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(LocalDate effective_date) {
		this.effective_date = effective_date;
	}
	public LocalDate getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(LocalDate expiration_date) {
		this.expiration_date = expiration_date;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public char getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(char subStatus) {
		this.subStatus = subStatus;
	}
	public int getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(int billCycle) {
		this.billCycle = billCycle;
	}
	public String getPaymentCategory() {
		return paymentCategory;
	}
	public void setPaymentCategory(String paymentCategory) {
		this.paymentCategory = paymentCategory;
	}
	public AGD1_Resources(long resource_Value, int resource_type, LocalDate effective_date, LocalDate expiration_date,
			int customerId, int subscriberId, char subStatus, int billCycle, String paymentCategory) {
		super();
		this.resource_Value = resource_Value;
		this.resource_type = resource_type;
		this.effective_date = effective_date;
		this.expiration_date = expiration_date;
		this.customerId = customerId;
		this.subscriberId = subscriberId;
		this.subStatus = subStatus;
		this.billCycle = billCycle;
		this.paymentCategory = paymentCategory;
	}
	

	public AGD1_Resources()
	{}
	
}

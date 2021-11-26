package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.tcrating.pojo.ChargeCode;

public interface ChargeCodeRepo  extends JpaRepository<ChargeCode, Long>{
	
	@Query("select rate from Charge_Code a where a.chargeCode = ?1 ")
	public double findRate(String chargeCode);

	@Query("select description from Charge_Code a where a.chargeCode = ?1 ")
	public String findDescription(String chargeCode);

	
}

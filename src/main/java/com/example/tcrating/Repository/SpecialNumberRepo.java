package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tcrating.pojo.SpecialNumber;

@Repository
public interface SpecialNumberRepo extends JpaRepository<SpecialNumber, Long>  {

	
	@Query("select specialNumber from Special_Number a where a.specialNumber =?1")
	public  long  findBySpecialNumber(long number);
	
	@Query("select chargeCode  from Special_Number a where a.specialNumber = ?1")
	public String findByChargeCode(long number);
	
	@Query("select ServiceType  from Special_Number a where a.specialNumber = ?1")
	public char findByServiceType(long number);

	@Query("select CallDirection  from Special_Number a where a.specialNumber = ?1")
	public int  findByCallDirection(long number);
	
	
}

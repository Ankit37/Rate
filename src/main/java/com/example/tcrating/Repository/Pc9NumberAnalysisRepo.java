package com.example.tcrating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.example.tcrating.pojo.PC9_number_analysis;

@Repository
public interface Pc9NumberAnalysisRepo  extends JpaRepository<PC9_number_analysis, Long>{

	@Nullable
	@Query("select distinct prefix from PC9_Number_Analysis a where a.prefix = ?1")
	public Long findByPrefix(long number);
	
	
	@Nullable
	@Query("select CountryCode  from PC9_Number_Analysis a where a.prefix = ?1")
	public String findByCountryCode(long number);
	
	@Query("select chargeCode  from PC9_Number_Analysis a where a.prefix = ?1")
	public String findByChargeCode(long number);
	
	


}

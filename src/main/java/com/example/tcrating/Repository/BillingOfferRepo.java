package com.example.tcrating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tcrating.pojo.BillingOffer;

@Repository
public interface BillingOfferRepo extends JpaRepository<BillingOffer, Long> {
	
	@Query("select distinct offerName from Billing_Offer a where a.offerName =?1")
	public String findByOfferName(String OfferName);
	

	@Query("select distinct soc from Billing_Offer a where a.offerName =?1")
	public String findBysoc(String OfferName);

	
	@Query("select chargeCode  from Billing_Offer a where a.offerName =?1")
	public List<String> findChargeCode(String OfferName);
	
	@Query("select offerName  from Billing_Offer a where a.chargeCode =?1")
	public String findMarketLevelOffer(String chargeCode);

	
}

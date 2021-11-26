package com.example.tcrating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.tcrating.prod.pojo.APE1SubscriberOffer;

@Repository
public interface Ape1SubscriberOfferRepo  extends JpaRepository<APE1SubscriberOffer, Long> {

	@Query("select distinct offerName from APE1_Subscriber_offer a where a.subscriberId=?1")
	public String findByofferName(long subscriberId);

	@Query("select offerName from APE1_Subscriber_offer b where b.subscriberId=?1 and expirationDate is null")
	public List<APE1SubscriberOffer> findByActiveofferName(long subscriberId);

	@Query("select count(*) from APE1_Subscriber_offer b where b.subscriberId=?1 and expirationDate is null")
	public int findSize(long subscriberId);
	


}

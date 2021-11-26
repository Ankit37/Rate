package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tcrating.prod.pojo.AGD1_Resources;

@Repository
public interface Agd1ResourcesRepo extends JpaRepository<AGD1_Resources, Long> {

	@Query(value = "select billCycle from  AGD1_Resources c where  c.customerId=?1")
	public int findByBillCycle(int customerId);

	@Query(value = "select resource_Value from  AGD1_Resources c where  c.customerId=?1")
	public int findByResourceValue(int customerId);
	
	@Query(value = "select subscriberId from  AGD1_Resources c where  c.customerId=?1")
	public int findBySubscriber(int customerId);
}

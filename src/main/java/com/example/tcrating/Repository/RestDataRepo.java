package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tcrating.prod.pojo.RestDataConsumer;

@Repository
public interface RestDataRepo extends JpaRepository<RestDataConsumer, Integer> {

	
}

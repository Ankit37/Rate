package com.example.tcrating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tcrating.prod.pojo.APE1_Rated_event;

@Repository
public interface Ape1RatedEventRepo  extends JpaRepository<APE1_Rated_event, Long>{

}

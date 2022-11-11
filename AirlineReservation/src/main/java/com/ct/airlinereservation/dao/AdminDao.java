package com.ct.airlinereservation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ct.airlinereservation.entity.Admin;
import com.ct.airlinereservation.entity.Flight;

public interface AdminDao extends JpaRepository<Flight,Integer>  {
	
@Query("select a from Admin a where a.email=?1 and a.password=?2")
Admin findByCredits(String email, String password);

}

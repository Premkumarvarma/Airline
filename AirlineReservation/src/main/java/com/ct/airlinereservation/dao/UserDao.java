package com.ct.airlinereservation.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ct.airlinereservation.entity.Flight;
import com.ct.airlinereservation.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
	// @Query("select u from User u where u.email=?1 and u.password=?2")
	List<User> findByEmailAndPassword(String email, String password);

	// @Query("select u from User u where u.phoneNumber=?1")
	List<User> findByPhoneNumber(long phoneNumber);

	@Modifying
	@Query("Update User u set u.password=?2 where u.email=?1  ")
	void updatePassword(String email, String password);

	@Query("select f from Flight f where f.from=?1 and f.to=?2 and f.dateOfDep=?3 and f.dateOfRet=?4 and f.noOfPass>=?5")
	List<Flight> findByFlightss(String from, String to, Date dateOfDep, Date dateOfRet, int noOfPass);

	@Query("select f from Flight f where f.from=?1 and f.to=?2 and f.dateOfDep=?3 and f.noOfPass>=?4")
	List<Flight> findByFlightss(String from, String to, Date dateOfDep, int noOfPass);

}

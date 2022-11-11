package com.ct.airlinereservation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.airlinereservation.dao.AdminDao;
import com.ct.airlinereservation.entity.Admin;
import com.ct.airlinereservation.entity.Flight;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao dao;

	@Override
	public Admin adminLogin(String email, String password) {

		return dao.findByCredits(email, password);

	}

	@Override
	public Flight addFlight(Flight flight) {
		return dao.save(flight);
	}

	@Override
	public String deleteFlightById(int id) {
		dao.deleteById(id);
		return "Flight Deleted";
	}

	@Override
	public List<Flight> viewAllFlights() {
		return dao.findAll();
	}

}

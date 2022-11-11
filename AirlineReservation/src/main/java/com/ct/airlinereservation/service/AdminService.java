package com.ct.airlinereservation.service;

import java.util.List;

import com.ct.airlinereservation.entity.Admin;
import com.ct.airlinereservation.entity.Flight;

public interface AdminService {
	public Admin adminLogin(String email, String password);

	public Flight addFlight(Flight flight);

	public String deleteFlightById(int id);

	public List<Flight> viewAllFlights();
}

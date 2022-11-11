package com.ct.airlinereservation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.airlinereservation.entity.Admin;
import com.ct.airlinereservation.entity.Flight;
import com.ct.airlinereservation.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;

	@GetMapping("/adminlogin/{email}/{password}")
	public Admin adminLogin(@PathVariable String email, @PathVariable String password) {
		return service.adminLogin(email, password);
	}

	@PostMapping("/addflight")
	public Flight addFlight( @RequestBody Flight flight) {
		return service.addFlight(flight);
	}

	@DeleteMapping("/deleteflight/{id}")
	public String deleteFlightById(@PathVariable int id) {
		return service.deleteFlightById(id);
	}

	@GetMapping("/allflights")
	public List<Flight> viewAllFlights() {
		return service.viewAllFlights();
	}

}

package com.ct.airlinereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ct.airlinereservation.entity.Flight;
import com.ct.airlinereservation.entity.User;
import com.ct.airlinereservation.service.UserService;

@RestController
@RequestMapping("/airline")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/registration")
	public User Registration(@RequestBody User user) {
		return service.Registration(user);
	}

	@GetMapping("/login/{email}/{password}")
	public List<User> login(@PathVariable String email, @PathVariable String password) {
		return service.login(email, password);
	}

	@PutMapping("/forgetPassword/{email}")
	public List<User> forgetPassword(@PathVariable String email, @RequestParam("password") String password) {
		return service.forgetPassword(email, password);
	}

	@GetMapping("/login/{phoneNumber}")
	public List<User> findByPhoneNumber(@PathVariable long phoneNumber) {
		return service.profile(phoneNumber);
	}

	@GetMapping("/searchflight")
	public List<Flight> searchFlight(@RequestBody Flight flight) {
		return service.searchFlight(flight);
	}

}

package com.ct.airlinereservation.service;

import java.util.List;

import com.ct.airlinereservation.entity.Flight;
import com.ct.airlinereservation.entity.User;

public interface UserService {

	public User Registration(User user);

	public List<User> login(String email, String password);

	public List<User> profile(long phoneNumber);

	public List<User> forgetPassword(String email, String password);

	 List<Flight> searchFlight(Flight flight);
}

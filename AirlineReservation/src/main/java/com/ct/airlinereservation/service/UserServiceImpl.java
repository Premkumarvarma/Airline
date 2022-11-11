package com.ct.airlinereservation.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.airlinereservation.dao.UserDao;
import com.ct.airlinereservation.entity.Flight;
import com.ct.airlinereservation.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	@Override
	public User Registration(User user) {
		return dao.save(user);
		// return "Registration Successfully";
	}

	@Override
	public List<User> login(String email, String password) {
		return dao.findByEmailAndPassword(email, password);
	}

	@Override
	public List<Flight> searchFlight(Flight flight) {
		List<Flight> allFlights = new ArrayList<Flight>();
		if(flight.getType().equals("oneway")) {
			 allFlights= dao.findByFlightss(flight.getFrom(),flight.getTo(),flight.getDateOfDep(),flight.getNoOfPass());
		}
		else if(flight.getType().equals("roundtrip")) {
			allFlights=dao.findByFlightss(flight.getFrom(),flight.getTo(),flight.getDateOfDep(),flight.getDateOfRet(),flight.getNoOfPass());
	}
		return allFlights;
	}

	@Override
	public List<User> profile(long phoneNumber) {
		return dao.findByPhoneNumber(phoneNumber);

	}

	@Override
	public List<User> forgetPassword(String email, String password) {

		dao.updatePassword(email, password);
		return dao.findByEmailAndPassword(email, password);
	}

}

package com.ct.airlinereservation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Flight {
	@Id
	private int id;
	//@NotNull
	//@Pattern(regexp = "[oneway|roundtrip]", message = "Invalid Type")
	private String type;
	private String from;
	private String to;
	private Date dateOfDep;
	private Date dateOfRet;
	private int noOfPass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDateOfDep() {
		return dateOfDep;
	}

	public void setDateOfDep(Date dateOfDep) {
		this.dateOfDep = dateOfDep;
	}

	public Date getDateOfRet() {
		return dateOfRet;
	}

	public void setDateOfRet(Date dateOfRet) {
		this.dateOfRet = dateOfRet;
	}

	public int getNoOfPass() {
		return noOfPass;
	}

	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String type, String from, String to, Date dateOfDep, Date dateOfRet, int noOfPass) {
		super();
		this.id = id;
		this.type = type;
		this.from = from;
		this.to = to;
		this.dateOfDep = dateOfDep;
		this.dateOfRet = dateOfRet;
		this.noOfPass = noOfPass;
	}

	public Flight(String type, String from, String to, Date dateOfDep, Date dateOfRet, int noOfPass) {
		super();
		this.type = type;
		this.from = from;
		this.to = to;
		this.dateOfDep = dateOfDep;
		this.dateOfRet = dateOfRet;
		this.noOfPass = noOfPass;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", type=" + type + ", from=" + from + ", to=" + to + ", dateOfDep=" + dateOfDep
				+ ", dateOfRet=" + dateOfRet + ", noOfPass=" + noOfPass + "]";
	}

}

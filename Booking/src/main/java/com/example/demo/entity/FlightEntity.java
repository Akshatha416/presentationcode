package com.example.demo.entity;

import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

//import org.springframework.format.annotation.DateTimeFormat;

public class FlightEntity {

	

	private Long id;
	
	
	private String origin;
	
	
	private String destination;
	
	private Date dateOfFlight;	
	
	
	private int noOfSeats;
	
	
	private int price;
	
	
	private String timeOfFlight;
	
	
	private String remarks;
	
	//@ManyToOne
	//@JoinColumn
	private AirLineEntity airline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfFlight() {
		return dateOfFlight;
	}

	public void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTimeOfFlight() {
		return timeOfFlight;
	}

	public void setTimeOfFlight(String timeOfFlight) {
		this.timeOfFlight = timeOfFlight;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public AirLineEntity getAirline() {
		return airline;
	}

	public void setAirline(AirLineEntity airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "FightEntity [id=" + id + ", origin=" + origin + ", destination=" + destination + ", dateOfFlight="
				+ dateOfFlight + ", noOfSeats=" + noOfSeats + ", price=" + price + ", timeOfFlight=" + timeOfFlight
				+ ", remarks=" + remarks + ", airline=" + airline + "]";
	}	
	
}

package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class FlightEntity {
	
	
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column(name="origin")
		private String origin;
		
		@Column(name="destination")
		private String destination;
		
		@Column	
		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern="dd-MM-yyyy")
		private Date dateOfFlight;	
		
		@Column
		private int noOfSeats;
		
		@Column
		private int price;
		
		@Column	
		private String timeOfFlight;
		
		@Column
		private String remarks;
		
		@ManyToOne
		@JoinColumn
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



package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingEntity {
	private String name;
	private Long flightid;
	private String mail;
	private String username;
	private String origin;
	private String destination;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Id
	private String  pnr;
	private Integer seatno;
	private String gender;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getFlightid() {
		return flightid;
	}
	public void setFlightid(Long flightid) {
		this.flightid = flightid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Integer getSeatno() {
		return seatno;
	}
	public void setSeatno(Integer seatno) {
		this.seatno = seatno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	@Override
//	public String toString() {
//		return "BookingEntity [name=" + name + ", flightid=" + flightid + ", mail=" + mail + ", pnr=" + pnr
//				+ ", seatno=" + seatno + ", gender=" + gender + "]";
//	}
	@Override
	public String toString() {
		return "BookingEntity [name=" + name + ", flightid=" + flightid + ", mail=" + mail + ", username=" + username
				+ ", pnr=" + pnr + ", seatno=" + seatno + ", gender=" + gender + ", origin=" + origin + ", destination="
				+ destination + "]";
	}

}

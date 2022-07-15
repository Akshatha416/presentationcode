package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.BookingEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.exception.TicketNotFoundException;
import com.example.demo.repository.BookingRepository;
@Service
public class BookingService {

	//@Autowired
	//private FlightRepo frepo;
	@Autowired
	private BookingRepository repo;
	

	public BookingEntity bookTicket(BookingEntity booking,Long id) {
		System.out.println("************");
		HttpHeaders headers=new HttpHeaders();
		HttpEntity<String> entity= new HttpEntity<String>(headers);
		RestTemplate restTemplate =new RestTemplate();
		//get flight by its ID
		FlightEntity flight =  restTemplate.exchange("http://localhost:8087/api/v1.0/flightById?id="+id,HttpMethod.GET,entity,FlightEntity.class).getBody();
//		private String name;
//	private Long flightid;
//		private String mail;
//		@Id
//		private String  pnr;
//	private Integer seatno;
//		private String gender;
		//http  use resttemplate
//		Optional<FlightEntity> findById = repo.findById(id);
		if(flight==null) {
			return null;
		}else {
			int min=100;
			int max=1000;
			String pnr_no="PNR";
			int b = (int)(Math.random()*(max-min+1)+min);  
			pnr_no=pnr_no+b;
			booking.setPnr(pnr_no);
			booking.setFlightid(flight.getId());
			booking.setName(flight.getAirline()!=null? flight.getAirline().getName():null);
			repo.save(booking);
			return booking;
		}
	}

	public List<BookingEntity> getAllBooks(){
		return repo.findAll();
	}

	public BookingEntity getBookingDetailsByPnr(String pnr) throws TicketNotFoundException {
		Optional<BookingEntity> optional = repo.findByPnr(pnr);
		if(optional.isEmpty()) {
			throw new TicketNotFoundException("ticket with id: "+pnr+" not available in database");
			//return pnr+"value is in valid";
		} else {
			return optional.get();
		}
	}
	public BookingEntity getTicketDetailsByMail(String mail) throws TicketNotFoundException {
		Optional<BookingEntity> optional = repo.findByMail(mail);
		if(optional.isEmpty()) {
			throw new TicketNotFoundException("ticket with mail: "+mail+" not available in database");
		} else {
			System.out.println(optional);
			return optional.get();
		}	

	}
	public String cancelTicket(String pnr) {
		System.out.println("************");
		Optional<BookingEntity> findById = repo.findByPnr(pnr);
		if(findById.isEmpty()) {
			return "invalid";
		}else {
			System.out.println("DDDDDDDDDD");
			repo.deleteByPnr(pnr);

			return "succesfully deleted----";
		}
	}


}

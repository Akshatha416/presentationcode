package com.example.demo.controller;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookingEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.exception.TicketNotFoundException;
import com.example.demo.service.BookingService;

@Transactional
@RestController
@RequestMapping("/api/v1.0/flight")
@CrossOrigin
//@RequestMapping("/booking")
public class BookingController {
	

	
		@Autowired
		private BookingService service;

			@PostMapping("/booking/{flightid}")
			public BookingEntity ticketResponse(@RequestBody BookingEntity t,@PathVariable Long flightid) {
				System.out.println("abcdefghtijkllkjksdflkjsdlfkj");
				System.out.println(t);
				return service.bookTicket(t, flightid);
			}
			@GetMapping("/fecthAllbookingDetails")
			public List<BookingEntity> getALL(){
				return service.getAllBooks();
			}
			@GetMapping("/ticket/{pnr}")
			public BookingEntity fecthPnr(@PathVariable String pnr) throws TicketNotFoundException {
				return service.getBookingDetailsByPnr(pnr);
			}
			@GetMapping("/booking/history/{mail}")
			public BookingEntity fecthMail(@PathVariable String mail) throws TicketNotFoundException {
				return service.getTicketDetailsByMail(mail);
			}
			
			@DeleteMapping("/booking/cancel/{pnr}")
			public String deletePnr(@PathVariable String pnr) throws TicketNotFoundException {
				return service.cancelTicket(pnr);
			}
			
			//@GetMapping("/getflights")
			//public String getBookDetails(@RequestParam Integer id) 
			//{
				//HttpHeaders headers=new HttpHeaders();
				//HttpEntity<String> entity= new HttpEntity<String>(headers);
				//RestTemplate restTemplate =new RestTemplate();
				//String entity2 =  restTemplate.exchange("http://localhost:8081/getBookById?id="+id,HttpMethod.GET,entity,String.class).getBody();
				//return  entity2;
				
			}
			
			

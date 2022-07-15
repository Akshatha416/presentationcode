package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AirLineEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.exception.TicketNotFoundException;
import com.example.demo.Services.AirlineService;
import com.example.demo.Services.FlightService;

@RestController
//@CrossOrigin(origins = {"http://hoppscotch.io/", "http://locahost:4200/"})
@CrossOrigin
//@RequestMapping("/flights")
public class FlightController {
	
	
		@Autowired
		private AirlineService service;
		@Autowired
		private FlightService flightService;
		
		
		@PostMapping(path="/api/v1.0/flight/airline/register")
		public ResponseEntity<String> registerAirline(@RequestBody AirLineEntity airline) {
			return new ResponseEntity<String>(service.registerAirline(airline),HttpStatus.OK);		
		}
		@GetMapping(path="/api/v1.0/flight/airline/all")
		public List<AirLineEntity> airlinesAll() {
			
		    return service.findAll();
		}
		//@GetMapping(path="/api/v1.0/flight/all")
		@GetMapping("/flight/all")
		public List<FlightEntity> flightsAll() {
			
		    return flightService.findAllFlights();
		}
		
		@GetMapping(path="/api/v1.0/flightById")
		public FlightEntity getflightById(@RequestParam Long id) {
			
		    return flightService.findFlightById(id).orElse(null);
		}
		
		@PostMapping(path="/api/v1.0/flight/airline/inventory/add")
		public ResponseEntity<String> saveFlightDetail(@RequestBody FlightEntity flight) {
			return new ResponseEntity<String>(flightService.save(flight),HttpStatus.OK);
			}
			@GetMapping(path="/flight-search")
		public List<FlightEntity> flights(@RequestParam("origin") String origin, @RequestParam("destination") String destination) throws TicketNotFoundException {
			System.out.println("Parameters are there...");
			
		
			return flightService.findAllByOriginAndDestinationn(origin, destination);
			//return service.findAllByOriginDestinationAndDateOfFlight(origin, destination, dof);
		}
			
		@DeleteMapping(path="/delete-flightById")	
		public void deleteflightById(@RequestParam Long id) {
			flightService.deleteflightById(id);
		}
			
		@DeleteMapping(path="/delete-AirlineById")	
		public void deleteAirlineById(@RequestParam Long id) {
			service.deleteAirlineById(id);
		}
			
			
			
			
	}






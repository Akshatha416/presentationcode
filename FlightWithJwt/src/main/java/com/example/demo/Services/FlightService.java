package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FlightEntity;
import com.example.demo.exception.TicketNotFoundException;
import com.example.demo.repository.FlightRepository;

@Service
public class FlightService {

	
		@Autowired
		private FlightRepository repo;
		
		public String save(FlightEntity f){
			repo.save(f);
			return "succesfully  registered";
		}
		public List<FlightEntity> findAllFlights(){
			return repo.findAll();
		}
		
		public Optional<FlightEntity> findFlightById(Long id){
			return repo.findById(id);
		}

		public List<FlightEntity> findAllByOrigin(String origin) throws TicketNotFoundException {
			List<FlightEntity> optional = repo.findByOrigin(origin);
			return optional;
			}
			
		public List<FlightEntity> findAllByDestinationn(String destination) throws TicketNotFoundException {
			List<FlightEntity> optional = repo.findAllByDestination(destination);
			return optional;
			}
		public List<FlightEntity> findAllByOriginAndDestinationn(String origin,String destination) throws TicketNotFoundException {
			List<FlightEntity> optional = repo.findAllByOriginAndDestination(origin,destination);
			return optional;
			}

		public void deleteflightById(Long id) {
			
			repo.deleteById(id);
			
		}
		
	}


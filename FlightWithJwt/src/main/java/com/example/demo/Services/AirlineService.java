package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AirLineEntity;
import com.example.demo.repository.AirLineRepository;




@Service

public class AirlineService {
	
		@Autowired
		private AirLineRepository repo;
		public String registerAirline(AirLineEntity airline) {
			repo.save(airline);
			return "Registered Successfully.";
			
		}
		public List<AirLineEntity> findAll(){
			return repo.findAll();
			}

		public void deleteAirlineById(Long id) {
			
			repo.deleteById(id);
			
		}
		
	}
	



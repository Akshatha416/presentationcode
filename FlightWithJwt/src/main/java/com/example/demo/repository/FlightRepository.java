package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity, Long> {
	
	List<FlightEntity> findByOrigin(String origin);

	List<FlightEntity> findAllByDestination(String destination);

	List<FlightEntity> findAllByOriginAndDestination(String origin, String destination);


}

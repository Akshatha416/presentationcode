package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AirLineEntity;

public interface AirLineRepository extends JpaRepository<AirLineEntity, Long> {

}

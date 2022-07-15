package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookingEntity;

public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {

	Optional<BookingEntity> findByMail(String mail);

	Optional<BookingEntity> findByPnr(String pnr);

	void deleteByPnr(String pnr);

}

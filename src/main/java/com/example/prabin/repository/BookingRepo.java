package com.example.prabin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prabin.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long>{

	List<Booking> findByUserId(long userId);
	List<Booking> findByShowId(long showId);
}

package com.example.prabin.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.prabin.entity.BookingStatus;

import lombok.Data;

@Data
public class BookingDTO {

	private Integer numberOfSeats;
	private LocalDateTime bookingTime;
	private Double price;
	private BookingStatus bookingStatus;
	
	private List<String> seatNumbers;
	
	private Long userId;
	private Long showId;

}

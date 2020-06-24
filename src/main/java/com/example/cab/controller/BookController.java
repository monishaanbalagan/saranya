package com.example.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.dto.BookRequestDto;
import com.example.cab.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@PostMapping("/cab/booking")
	public String placeOrder(@RequestBody BookRequestDto bookRequestDto)
	{
		bookService.placeBooking(bookRequestDto);
		return "Booking got successfull";
	}

}

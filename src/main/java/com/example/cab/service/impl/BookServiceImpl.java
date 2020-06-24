package com.example.cab.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.Dao.BookDao;
import com.example.cab.Dao.RouteDao;
import com.example.cab.dto.BookRequestDto;
import com.example.cab.model.Book;
import com.example.cab.service.BookService;

@Service
public class BookServiceImpl  implements BookService{
	@Autowired
  BookDao bookDao;
	@Autowired
	RouteDao routeDao;
  
	@Override
	public void placeBooking(BookRequestDto bookRequestDto) {
		Book book = new Book();
		BeanUtils.copyProperties(bookRequestDto,book);
		book.setBookingDateTime(LocalDateTime.now());
		book.setUserId(bookRequestDto.getUserId());
		book.setRouteId(bookRequestDto.getRouteId());
		book.setCabId(bookRequestDto.getCabId());
		book.setPrice(routeDao.findPriceByRouteId(bookRequestDto.getRouteId()).getPrice());
		bookDao.save(book);
		}
		
	}



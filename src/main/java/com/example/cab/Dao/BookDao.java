package com.example.cab.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.cab.model.Book;

public interface BookDao extends CrudRepository<Book,Integer> {


}

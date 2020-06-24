package com.example.cab.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.cab.model.User;

public interface UserDao extends CrudRepository<User ,Integer>{
	public User findByUserNameAndPassword(String userName,String password );
}


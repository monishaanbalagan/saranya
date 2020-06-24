package com.example.cab.service;

import com.example.cab.dto.UserRequestDto;

public interface UserService {
	void saveUserDetails(UserRequestDto userRequestDto);
	boolean authenticate(String userName, String password);



}

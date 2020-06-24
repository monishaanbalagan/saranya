package com.example.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.dto.Credentials;
import com.example.cab.dto.UserRequestDto;
import com.example.cab.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping(value="/users")
	public String register(@RequestBody UserRequestDto userRequestDto) {
	userService.saveUserDetails(userRequestDto)	;
	return "success";
	}
	@PostMapping(value="/users/login")
	   public String login(@RequestBody Credentials credentials) {
			boolean isExists=userService.authenticate(credentials.getUserName(),credentials.getPassword());
			if(isExists) {
				return "success";
				}
			else {
			return "failtologin";
			}

}
}


package com.example.cab.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.Dao.UserDao;
import com.example.cab.dto.UserRequestDto;
import com.example.cab.model.User;
import com.example.cab.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public void saveUserDetails(UserRequestDto userRequestDto) {
		User user = new User();
		BeanUtils.copyProperties(userRequestDto,user);
		userDao.save(user);
		}

	@Override
	public boolean authenticate(String userName, String password) {
		
		User user=userDao.findByUserNameAndPassword(userName, password);
		if(user!=null) 
			return true;
		return false;
	}

}

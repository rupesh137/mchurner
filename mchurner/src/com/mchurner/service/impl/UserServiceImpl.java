package com.mchurner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mchurner.dao.UserDao;
import com.mchurner.model.Login;
import com.mchurner.model.User;
import com.mchurner.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}
	@Override
	public void updateUserDetails(User user) {
		userDao.updateUserDetails(user);
		
	}

}

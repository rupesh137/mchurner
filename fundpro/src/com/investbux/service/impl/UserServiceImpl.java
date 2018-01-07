package com.investbux.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.investbux.dao.UserDao;
import com.investbux.model.Login;
import com.investbux.model.User;
import com.investbux.service.UserService;

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

package com.fundpro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fundpro.dao.UserDao;
import com.fundpro.model.Login;
import com.fundpro.model.User;
import com.fundpro.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}

package com.mchurner.dao;

import com.mchurner.model.Login;
import com.mchurner.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
	void updateUserDetails(User user);
}
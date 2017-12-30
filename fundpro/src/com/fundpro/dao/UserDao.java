package com.fundpro.dao;

import com.fundpro.model.Login;
import com.fundpro.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
	void updateUserDetails(User user);
}
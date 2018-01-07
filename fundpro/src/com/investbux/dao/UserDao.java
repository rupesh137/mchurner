package com.investbux.dao;

import com.investbux.model.Login;
import com.investbux.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
	void updateUserDetails(User user);
}
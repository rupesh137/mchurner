package com.fundpro.service;

import com.fundpro.model.Login;
import com.fundpro.model.User;

public interface UserService {
	User validateUser(Login login );
	void updateUserDetails(User user);
}

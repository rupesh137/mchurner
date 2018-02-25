package com.mchurner.service;

import com.mchurner.model.Login;
import com.mchurner.model.User;

public interface UserService {
	User validateUser(Login login );
	void updateUserDetails(User user);
}

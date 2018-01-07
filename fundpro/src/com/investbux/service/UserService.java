package com.investbux.service;

import com.investbux.model.Login;
import com.investbux.model.User;

public interface UserService {
	User validateUser(Login login );
	void updateUserDetails(User user);
}

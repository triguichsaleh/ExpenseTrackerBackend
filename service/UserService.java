package com.web.expensetrackerapi.service;

import com.web.expensetrackerapi.entity.User;
import com.web.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}

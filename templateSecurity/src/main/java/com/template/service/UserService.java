package com.template.service;

import com.template.beans.User;

public interface UserService {

	public User findByEmail(String email);
	
}

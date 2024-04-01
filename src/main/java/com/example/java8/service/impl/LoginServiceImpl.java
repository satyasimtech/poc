package com.example.java8.service.impl;

import com.example.java8.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(String user_password) {
		String[] loginDetails=user_password.split(":");
		if (loginDetails[0].equals("satya") && loginDetails[1].equals("satya123")) {
			return true;
		}
		return false;
	}

}

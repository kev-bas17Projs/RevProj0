package com.revature.services;

import com.revature.exceptions.InvalidCredentialsException;
import com.revature.exceptions.UserDoesNotExistException;
import com.revature.exceptions.UserNameAlreadyExistsException;
import com.revature.logging.*;

import java.util.ArrayList;
import com.revature.models.User;
import com.revature.dao.UserDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class UserServices {

	private UserDao uDao;

	public UserServices(UserDao u) {
		this.uDao = u;
	}

	public User signUp(String Fname, String Lname, String username, String password)
			throws UserNameAlreadyExistsException {
		User u = new User(Fname, Lname, username, password);

		try {
			uDao.createUser(u);
			Logging.logger.info("New user has registered.");
		} catch (SQLException e) {
			Logging.logger.warn("Username already exists.");
			throw new UserNameAlreadyExistsException();
		}

		return u;
	}
	
	public User signIn(String username, String password) throws UserDoesNotExistException, InvalidCredentialsException {
		User u = uDao.getUserByUsername(username);
		
		if(u.getUserName().equals(0)) {
			Logging.logger.warn("User tried logging in that does not exist.");
			throw new UserDoesNotExistException();
		}
		else if(!u.getPassword().equals(password)) {
			Logging.logger.warn("User tried to login with invalid credentials.");
			throw new InvalidCredentialsException();
		} else {
			Logging.logger.info("User was logged in.");
			return u;
		}
	}

}

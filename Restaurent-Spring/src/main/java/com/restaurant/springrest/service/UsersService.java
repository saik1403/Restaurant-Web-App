package com.restaurant.springrest.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurant.springrest.dao.UserDAO;
import com.restaurant.springrest.entity.Users;
import com.restaurant.springrest.rest.AdminController;
@Service
public class UsersService {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private UserDAO userDAO;
	
	public List<Users> findAll(){
		return userDAO.findAll();
	}

	public Optional<Users> Login(Users users) {
		//System.out.println(users);
//		System.out.println(users.getUserId());
//		System.out.println(users.getUserName());
//		System.out.println(users.getUserPassword());
		logger.info("user login service invoked");
		Optional<Users> checkingusers=userDAO.findById(users.getUserId());
		if(checkingusers.isEmpty()) {
			//checkingusers.getUserId();
			return Optional.empty();
		}
		else {
			//String body ="<HTML><body> <h1>LOGIN SUCCSESSFULL </h1><a href=\"http://localhost:8080/users\">Link clik to go</a></body></HTML>";
			LoginSession.setusersession(users);
			String body ="Succesfull Login Click This Link for Menu  --->  "+"http://localhost:8080/menu"
					+ "\n Goto This link for loging out of window ----->  http://localhost:8080/users/logout ";
			return checkingusers;
		}
	}
	public void register(Users users) {
		logger.info("user register service invoked");
		userDAO.save(users);
	}
	public void update(Users users) {
		logger.info("user update service invoked");
		userDAO.save(users);
	}

	public void deleteById(int userId) {
		logger.info("user delete service invoked");
		userDAO.deleteById(userId);
	}

	public Optional<Users> findById(int userId) {
		logger.info("user finding service invoked");
		return userDAO.findById(userId);
	}

	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
}

package com.restaurant.springrest.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.restaurant.springrest.entity.Users;
import com.restaurant.springrest.service.LoginSession;
import com.restaurant.springrest.service.UsersService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class UsersRestController {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private UsersService usersservice;
	
	@GetMapping("/users")
	public String PrintOptions(){
		logger.info("Printoptions for users method invoked");
		return "Optiosn for user \n"
				+ "For Login for login post the details of user   ---->    http://localhost:8080/users/login  \n"
				+ "For Register post the body of details ---->    http://localhost:8080/users/register";
	}
	@PostMapping("/users/login")
	public Optional<Users> Login(@RequestBody Users users) {
		logger.info("user login for users method invoked");
		LoginSession.setusersession(users);
		return usersservice.Login(users);
	}
	@PostMapping("/users/register")
	public String addUser(@RequestBody Users users) {
		logger.info("user Registration for users method invoked");
		usersservice.register(users);
		return "User Registerd Successfully \n"
				+ "For Login for login post the details of user   ---->    http://localhost:8080/users/login  \\n";
	}
	@GetMapping("/users/logout")
	public String logout(){	
		logger.info("logout for users method invoked");
		LoginSession.removeusersession();
		return "Successfully logged out ";
	}
	
}

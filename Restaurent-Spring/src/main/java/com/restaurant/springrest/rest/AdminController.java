package com.restaurant.springrest.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.springrest.entity.Admins;
import com.restaurant.springrest.entity.Users;
import com.restaurant.springrest.service.AdminService;
import com.restaurant.springrest.service.UsersService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class AdminController {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private AdminService adminservice;
	@Autowired
	private UsersService usersservice;
	@PostMapping("/admin/login")
	public String getUser(@RequestBody Admins admin) {
		//usersservice.Login(users);
		logger.info("Admin login method  invoked");
		return adminservice.Login(admin);
		
	}
	@GetMapping("/admin/logout")
	public String adminlogout() {
		logger.info("Admin logout method invoked");
		return adminservice.Logout();
		
	}
	@GetMapping("/admins")
	public List<Admins> getAdmins(){
		return adminservice.getAdmins();
	}
	// this is for admin to update the user
		@GetMapping("/admin/getusers")
		public List<Users> getUsers(){
			return usersservice.getUsers();
		}
		@PostMapping("/admin/userupdate")
		public String updateUserByAdmin(@RequestBody Users users) {
			logger.info("update user details by admin method invoked");
			usersservice.update(users);
			return "User Updated Successfully \n"
					+ "For Login for login post the details of user   ---->    http://localhost:8080/users/login  \\n";
		}
		//this is for admin  to add user
		@PostMapping("/admin/adduser")
		public String addUserByAdmin(@RequestBody Users users) {
			logger.info("user registration for users by admin method invoked");
			usersservice.register(users);
			return "User Registerd Successfully \n"
					+ "For Login for login post the details of user   ---->    http://localhost:8080/users/login  \\n";
		}
		//this is for admin to delete user
		@DeleteMapping("/admin/deleteuser/{userId}")
		public Optional<Users> deleteUserByAdmin(@PathVariable int userId) {
			logger.info("delete for users by admin method invoked");
			Optional<Users> tempuser = usersservice.findById(userId);
			if(tempuser == null) {
				throw new RuntimeException("The Employee can not found");
			}
			usersservice.deleteById(userId);
			return tempuser;
		}
}

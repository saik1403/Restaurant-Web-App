package com.restaurant.springrest.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.springrest.dao.AdminDAO;
import com.restaurant.springrest.entity.Admins;
import com.restaurant.springrest.rest.AdminController;

@Service
public class AdminService {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private AdminDAO adminDAO;
	public String Login(Admins admin) {
		logger.info("admin login service invoked");
		Optional<Admins> checkingadmin=adminDAO.findById(admin.getAdminid());
		if(checkingadmin.isEmpty()) {
			return "Login Unsuccesful give correct credentials";
		}
		else {
		return "Login sucessfull \n"
				+ "CLick this link for todays Bills ----->    http://localhost:8080/admin/todaybills  \n"
				+ "Click this link for this month Bills and Orders  ---->  http://localhost:8080/admin/thismonthbills \n"
				+ "Click this link for make user registration   ---->   http://localhost:8080/admin/adduser"
				+ "Click this link to delete User    ---->       http://localhost:8080/admin/userupdate"
				+ "Click this llink to update User----->      http://localhost:8080/admin/deleteuser/{userid}";
		
		}
	}
	
	public String Logout() {
		logger.info("admin logout service invoked");
		String msg="Admin Logout Successful";
		return msg;
	}

	public List<Admins> getAdmins() {
		// TODO Auto-generated method stub
		return adminDAO.findAll();
	}

}

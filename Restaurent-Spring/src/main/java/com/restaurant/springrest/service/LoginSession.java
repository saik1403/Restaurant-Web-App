package com.restaurant.springrest.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.springrest.entity.Users;
import com.restaurant.springrest.rest.AdminController;
@Service
public class LoginSession {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	static List<Users> usersStatus=new ArrayList<>();
	public static void setusersession(Users user) {
		System.out.println(user+"setusersession");
		usersStatus.add(user);
	}
	public static Users getusersession() {
		
		return usersStatus.get(0);
	}
	public static void removeusersession() {
		usersStatus.clear();
	}
	public static boolean isempty() {
		return usersStatus.isEmpty();
	}

}

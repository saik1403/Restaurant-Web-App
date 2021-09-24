package com.restaurant.springrest.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurant.springrest.dao.MenuDAO;
import com.restaurant.springrest.entity.Menu;
import com.restaurant.springrest.rest.AdminController;

@Service
public class MenuService {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private MenuDAO menuDAO;
	public List<Menu> printMenu(){
		logger.info("print menu service invoked");
		System.out.print(LoginSession.getusersession());
		return menuDAO.findAll();
	}
	public List<Integer> getprices(){
		logger.info("get prices service invoked");
		return menuDAO.getPrices();
	}
	
}

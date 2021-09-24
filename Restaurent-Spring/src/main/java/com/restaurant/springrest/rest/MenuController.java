package com.restaurant.springrest.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.springrest.entity.Menu;
import com.restaurant.springrest.service.MenuService;
@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RequestMapping("/")
public class MenuController {

	Logger logger = LoggerFactory.getLogger(AdminController.class);
		@Autowired
		private MenuService menuservice;
		
		@GetMapping("/menu")
		public List<Menu> printMenu(){
			logger.info("print menu method invoked");
			return menuservice.printMenu();
		}
		
		

	}

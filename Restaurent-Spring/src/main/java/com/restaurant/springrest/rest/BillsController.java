package com.restaurant.springrest.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.springrest.entity.Bills;
import com.restaurant.springrest.entity.Order;
import com.restaurant.springrest.service.BillsService;
import com.restaurant.springrest.service.LoginSession;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class BillsController {
	Logger logger = LoggerFactory.getLogger(BillsController.class);
	@Autowired
	BillsService billservice;
	@PostMapping("/users/order")
	public String getorder(@RequestBody List<Order> orders) {
		//System.out.println(orders.size());
		logger.info("Get order method invoked");
		int totalbill=billservice.Entry(orders);
		return "Bills enterd Successfully and total bills = "+totalbill+"\n Click this link to get Total Orders --->    http://localhost:8080/user/getbill \n"
				+ "Click this to logout  ----> http://localhost:8080/user/logout";
	}
	@GetMapping("/users/getbill")
	public List<Bills> getbills(){
		String username=LoginSession.getusersession().getUserName();
		//System.out.println(username+"at getbill");
		logger.info("getbills method  invoked");
		return billservice.getBill(username);
	}
	@GetMapping("/admin/todaybills")
	public List<Bills> gettodaysbills(){
		//String username=LoginSession.getusersession().getUserName();
		//System.out.println(username+"at getbill");
		logger.info("GetTodayBills method invoked");
		return billservice.getTodaysBill();
	}
	@GetMapping("/admin/thismonthbills")
	public List<Bills> getThisMonthbills(){
		//String username=LoginSession.getusersession().getUserName();
		//System.out.println(username+"at getbill");
		logger.info("getThisMonthBills method  invoked");
		return billservice.getThisMonthBill();
	}
	
	
}

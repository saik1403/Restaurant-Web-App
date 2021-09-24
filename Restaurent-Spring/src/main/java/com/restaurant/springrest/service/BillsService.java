package com.restaurant.springrest.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.springrest.dao.BillsDAO;
import com.restaurant.springrest.dao.MenuDAO;
import com.restaurant.springrest.entity.Bills;
import com.restaurant.springrest.entity.Order;
import com.restaurant.springrest.rest.AdminController;

@Service
public class BillsService {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	BillsDAO billsDAO;
	@Autowired
	MenuDAO menuDAO;
	public int Entry(List<Order> order) {
		logger.info("Bills entry service invoked");
		List<Integer> prices=menuDAO.getPrices();
		int total=0;
		for (Order i : order) {
			int id=i.getItemid();
			id = id-1;
			int totalprice=i.getQuantity()*prices.get(id);
			total=total+totalprice;
			 billsDAO.billsentry(id,totalprice,LoginSession.getusersession().getUserId(),LoginSession.getusersession().getUserName());
        }
		return total;
 }
	public List<Bills> getBill(String username) {
		logger.info("getbill service invoked");
		// TODO Auto-generated method stub
		System.out.println(username);
		return billsDAO.getBillsByName(username);
	}
	public List<Bills> getTodaysBill() {
		logger.info("get todays bill service invoked");
		return billsDAO.getTodaysBills();
	}
	public List<Bills> getThisMonthBill() {
		// TODO Auto-generated method stub
		logger.info("get this month service invoked");
		return billsDAO.getThisMonthBills();
	}
}

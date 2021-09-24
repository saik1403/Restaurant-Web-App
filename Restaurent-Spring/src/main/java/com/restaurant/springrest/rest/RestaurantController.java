package com.restaurant.springrest.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
//@RequestMapping("/")
public class RestaurantController {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@GetMapping("/restaurant")
	public String SelecctOptions() {
		logger.info("Restaurants method invoked");
		return "Hello Slelect link to login \n"
				+ "for Admin Options  ------>   http://localhost:8080/admin/login \n"
				+ "for User Options ------>    http://localhost:8080/users";
	}

}

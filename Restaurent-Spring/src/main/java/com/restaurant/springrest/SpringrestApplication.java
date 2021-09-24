package com.restaurant.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class SpringrestApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder appliation) {
		return appliation.sources(SpringrestApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}

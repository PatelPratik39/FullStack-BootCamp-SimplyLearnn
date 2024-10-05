package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleControllerThree {
	
	@RequestMapping(value = "/")
	public String greeting() {
		return "Welcome to the Third Microservice";
	}

}

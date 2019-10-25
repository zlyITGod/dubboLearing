package com.gjy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gjy.service.DefaultApiService;

@RestController
public class DemoConsumerController {
	
	@Autowired
	private DefaultApiService defaultService; 
	
	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return defaultService.defaultMethod(name);
	}

}

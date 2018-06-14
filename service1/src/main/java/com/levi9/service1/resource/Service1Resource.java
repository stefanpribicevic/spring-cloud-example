package com.levi9.service1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class Service1Resource {
	
	@GetMapping("/test")
	public String getService1() {	
		return "Service1";
	}
}

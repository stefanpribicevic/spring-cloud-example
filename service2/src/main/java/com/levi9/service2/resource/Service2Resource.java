package com.levi9.service2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Service2Resource {
	
	@GetMapping("/test")
	public String getService() {
		return "Service2";
	}
	
}

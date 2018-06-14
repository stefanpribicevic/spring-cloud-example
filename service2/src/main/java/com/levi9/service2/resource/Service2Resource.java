package com.levi9.service2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class Service2Resource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String getService() {
		ResponseEntity<String> response = restTemplate.exchange("http://service1/service1/test", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        });
		
		return "Service2 " + response.getBody();
	}
	
}

package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controllers {

	@GetMapping("/")
	public String getCustomer()
	{
		return "data is visible";
	}
}

package com.pavan.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelocomeRestController {
	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome to DevOps";
		
	}

}

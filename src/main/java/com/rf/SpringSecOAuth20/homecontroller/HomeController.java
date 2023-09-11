package com.rf.SpringSecOAuth20.homecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	public String home() {
		return "hello home";
	}
	
	@GetMapping("/sec")
	public String sec() {
		return "secured";
	}

}

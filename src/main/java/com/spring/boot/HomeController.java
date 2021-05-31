package com.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "hello Home Page";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "hello about Page";
	}
}

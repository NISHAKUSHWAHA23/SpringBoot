package com.spring.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/index")
	public String openHomePage() {
		return "index";
	}
	

}

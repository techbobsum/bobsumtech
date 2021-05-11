package com.bobsumsol.equitex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriberController {
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@GetMapping("/transaction")
	public String transaction() {
		return "transact";
	}
	
}

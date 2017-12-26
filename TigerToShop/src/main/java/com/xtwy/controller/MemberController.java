package com.xtwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class MemberController {
	@RequestMapping("/memberLogin")
	public String memberLogin() {
		return "memberLogin";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/index")
	public String index() {
		return "person/index";
	}
}

package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

	@RequestMapping(value="/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/admin/home")
	public String adminHome(){
		return "adminHome";
	}
}

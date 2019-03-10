package com.igeekhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.igeekhome.pojo.User;
import com.igeekhome.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService us;
	@GetMapping("/toRegister")
	public String toRegister() {
		return "register";
		
	}

	
	@PostMapping("/register")
	public String register(User user) {
		System.out.println(user);
		boolean b = us.register(user);
		System.out.println(b);
		if(b) {
			return "success";	
		
		}else {
			
		return "fales";
		}
		
		
	
	}
	
	@PostMapping("/login")
	public String toLogin(User user) {
		User u1 = us.login(user.getName(), user.getPwd());
		System.out.println(u1);
		if(u1!=null) {
			
			return "success";
		}else {
		
		return "fales";
		}
	}
	
	@GetMapping("/toLogin")
	public String login(User user) {	
		return "login";
		
	
	}
	
	
}

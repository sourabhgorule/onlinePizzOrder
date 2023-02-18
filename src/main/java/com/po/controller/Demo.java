package com.po.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.model.User;
import com.po.service.UserService;

@Controller
public class Demo {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("hiiiiiiii");
		return "/login";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newLoginPage() {
		System.out.println("hiiiiiiii");
		return "/NewFile";
	}
	
	@RequestMapping(value = "/checkCred", method = RequestMethod.POST)
	public String checkCred(@Valid User user) {
		System.out.println(user.getUsername());
		boolean isUserExist= userService.loginUser(user);
		if(isUserExist) {
			return "/index";
		}
		else {
			return "/login";
		}
	}

	

}

package com.morningstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.morningstar.model.User;
import com.morningstar.service.AdminService;
import com.morningstar.service.RegistrationService;

@Controller
public class AirlineController {

	@Autowired
	private RegistrationService service;
	@Autowired
	private AdminService service1;

	@GetMapping (path="/")
	public String hello() {
		return "index";
	}

	@GetMapping(path = "InputLoginForm.view")
	public String showLoginForm() {
		return "login";
	}

	
	@PostMapping(path="Login.do")
	public String loginService(String emailId, String password) {
		boolean result = service.checkUserInfo(emailId, password);
		if (result)
			return "Message";
		else
			return "error";
	}
	@GetMapping(path="AddUser.view")
	public String showRegisterForm() {
		return "register";
	}
	
	@PostMapping(path="register.do")
	public String registerService(User p) {
		boolean result=service.addUser(p);
		if(result)
		return "Message";
		else
			return "error";
	}
	@GetMapping(path="GetAllUser.view")
	public String ShowAllUsers() {
		return "viewUser";
	}
	
	@GetMapping(path = "viewUser.do")
	public String getAllUsers(Model model) {
		List<User> users= service1.getAllUsers();
		model.addAttribute("usersList", users);//to transfer from controller to jsp
		return "viewUser";
	}
}

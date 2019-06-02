package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.domain.model.UserDTO;
import com.shop.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/list-users")
	public String listAllUsers(ModelMap model) {
		List<UserDTO> allUsers = service.getAllUsers();
		model.put("users", allUsers);
		return "list-users";
	}

}

package com.shop.controller;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.domain.model.ProductDTO;

public class UserController {
	
    @GetMapping("/list-users")
    public String listAllUsers(ModelMap model) {
        String name = getLoggedInUserName(model);
        List<UserDTO> allUsers = service.getAllUsers();
        model.put("users", allUsers);
        return "list-users";
    }
    
    private String getLoggedInUserName(ModelMap model) {
        Object principal = SecurityContextHolder.getContext()
                                                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();

}

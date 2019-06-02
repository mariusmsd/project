package com.shop.service;

import com.shop.domain.model.ProductDTO;
import com.shop.domain.model.UserDTO;
import java.util.List;

public interface UserService {
	
	void viewUsers(UserDTO user);

    List<UserDTO> getAllUsers();

}

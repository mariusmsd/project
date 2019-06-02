package com.shop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.model.UserDTO;
import com.shop.mapper.UserEntityToDTOMapper;
import com.shop.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private UserEntityToDTOMapper userEntityToDTOMapper;

	@Override
	public List<UserDTO> getAllUsers() {
		return repo.findAll().stream().map(userEntityToDTOMapper::convert).collect(Collectors.toList());
	}

	@Override
	public void viewUsers(UserDTO user) {
		// TODO Auto-generated method stub

	}

}

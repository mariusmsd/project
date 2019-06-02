package com.shop.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.shop.domain.User;
import com.shop.domain.model.UserDTO;

@Component
public class UserDTOToEntityMapper implements Converter<UserDTO, User> {

	@Override
	public User convert(UserDTO userDTO) {

		return User.builder()
				.id(userDTO.getId())
				.username(userDTO.getUsername())
				.password(userDTO.getPassword())
				.build();

	}

}

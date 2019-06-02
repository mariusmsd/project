package com.shop.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.shop.domain.User;
import com.shop.domain.model.UserDTO;

@Component
public class UserEntityToDTOMapper implements Converter<User, UserDTO> {
	
	@Override
    public UserDTO convert(User source) {
		
		return UserDTO.builder()
						.id(source.getId())
						.username(source.getUsername())
						.password(source.getPassword())
						.build();
    }

}

package com.petsitty.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.petsitty.springboot.model.User;
import com.petsitty.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

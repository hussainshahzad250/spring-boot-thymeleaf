package com.hussain.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.hussain.model.User;
import com.hussain.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

package com.ltts.shopping.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ltts.shopping.model.User;
import com.ltts.shopping.web.dao.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
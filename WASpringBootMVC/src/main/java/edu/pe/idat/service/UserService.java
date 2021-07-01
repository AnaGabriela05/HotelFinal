package edu.pe.idat.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import proyecto.idat.dto.UserRegistration;
import edu.pe.idat.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistration registration);
}

package fi.haagahelia.springboot.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import fi.haagahelia.springboot.dto.UserRegistrationDto;
import fi.haagahelia.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
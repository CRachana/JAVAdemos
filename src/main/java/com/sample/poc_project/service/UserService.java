package com.sample.poc_project.service;



import java.util.List;

import org.springframework.stereotype.Service;

//import com.sample.poc_project.entity.Admin;
import com.sample.poc_project.entity.User;

@Service
public interface UserService {


	public List<User> findByRole(String role);

	public User findByUsername(String username);
	
	public List<User> findAll();

	public void saveUser(User user);
	
	public User findByConfirmationToken(String confirmationToken);
}


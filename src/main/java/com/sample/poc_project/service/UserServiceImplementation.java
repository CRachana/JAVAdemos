package com.sample.poc_project.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sample.poc_project.entity.User;

import com.sample.poc_project.repository.UserRepository;




@Service
public class UserServiceImplementation implements UserService {

	private UserRepository userRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public UserServiceImplementation( UserRepository obj)
	{
		userRepository=obj;
	}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(User user)
	{
		
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String user) {
		// TODO Auto-generated method stub
		
		return userRepository.findByUsername(user);
		
	}

	@Override
	public List<User> findByRole(String user) {
		
		return userRepository.findByRole(user);
	}

	
	public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}
}

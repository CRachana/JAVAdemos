/*package com.sample.poc_project.service;


import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sample.poc_project.config.MyUserDetails;
//import com.sample.poc_project.entity.Role;
import com.sample.poc_project.entity.User;
import com.sample.poc_project.repository.UserRepository;
 
public class UserDetailsServiceImpl implements UserDetailsService {
	 
    @Autowired
    private UserRepository userRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
         
      //  public User findByNameAndPassword(String name,String password);
        
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new MyUserDetails(user);
    }
 
}*/
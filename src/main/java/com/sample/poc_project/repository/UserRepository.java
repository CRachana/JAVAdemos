package com.sample.poc_project.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.sample.poc_project.entity.User;



@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	
	
	 User findByConfirmationToken(String confirmationToken);
	 
	  List<User> findAll();
	  List<User> findByRole(String role);
	  
	 // User save(User user);
	  
	 // @Query("SELECT u FROM User u WHERE u.username = :username")
	  // public User getUserByUsername(@Param("username") String username);

	  User findByUsername(String username);

	 // User findByNameAndPassword(String username,String password);
	//User findByUsername(String username);
}

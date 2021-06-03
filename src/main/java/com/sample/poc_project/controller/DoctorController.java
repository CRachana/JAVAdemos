package com.sample.poc_project.controller;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sample.poc_project.entity.Appointment;
import com.sample.poc_project.entity.User;
import com.sample.poc_project.service.AppointmentServiceImplementation;
import com.sample.poc_project.service.UserService;
import com.sample.poc_project.service.UserServiceImplementation;




@Controller
@RequestMapping("/doctor")
public class DoctorController {

	private UserService userService;

	private UserServiceImplementation userServiceImplementation;
	
	private AppointmentServiceImplementation appointmentServiceImplementation;

	
	@Autowired
	public DoctorController(UserService userService,UserServiceImplementation obj,
			AppointmentServiceImplementation app) {
		this.userService = userService;
		userServiceImplementation=obj;
		appointmentServiceImplementation=app;
	}
	
	
	@RequestMapping("/index")
	public String index(Model model){

	
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		User user = userServiceImplementation.findByUsername(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         user.setLastseen(log);
		         
		         userServiceImplementation.saveUser(user);
		
		
		         
		List<Appointment> list=appointmentServiceImplementation.findAll();
		
		model.addAttribute("name",user.getFirstName());
		
		model.addAttribute("username",user.getUsername());
		
		
		model.addAttribute("user",user.getFirstName()+" "+user.getLastName());
		
		// add to the spring model
		model.addAttribute("app", list);
		
		return "doctor/index";
	}
	
	
}


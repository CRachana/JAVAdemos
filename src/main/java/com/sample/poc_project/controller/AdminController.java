package com.sample.poc_project.controller;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sample.poc_project.entity.Appointment;
import com.sample.poc_project.entity.User;
import com.sample.poc_project.service.AppointmentServiceImplementation;
import com.sample.poc_project.service.UserService;
import com.sample.poc_project.service.UserServiceImplementation;





@Controller
@RequestMapping("/admin")
public class AdminController {
	

	private UserService userService;

	private UserServiceImplementation userServiceImplementation;
	
	private AppointmentServiceImplementation appointmentServiceImplementation;

	
	@Autowired
	public AdminController(UserService userService,UserServiceImplementation obj,
			AppointmentServiceImplementation app) {
		this.userService = userService;
		userServiceImplementation=obj;
		appointmentServiceImplementation=app;
	}
	
	
	@RequestMapping("/user-details")
	public String index(Model model){
		
		
		List<User> list=userServiceImplementation.findByRole("USER");
		model.addAttribute("user", list);
		
		
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
		
		
		
		return "admin/user";
	}
	
	@RequestMapping("/doctor-details")
	public String doctorDetails(Model model){
		
		
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
		
		
		
		List<User> list=userServiceImplementation.findByRole("DOCTOR");
		
		
		
		// add to the spring model
		model.addAttribute("user", list);
		
		
		return "admin/doctor";
	}
	
	@RequestMapping("/admin-details")
	public String adminDetails(Model model){
		
		
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
		
		
		         
		List<User> list=userServiceImplementation.findByRole("ADMIN");
		
		
		
		// add to the spring model
		model.addAttribute("user", list);
		
		
		return "admin/admin";
	}
	
	
	@GetMapping("/add-doctor")
	public String showFormForAdd(Model theModel) {
		
		
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
		
		User user1 = userServiceImplementation.findByUsername(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         user1.setLastseen(log);
		         
		         userServiceImplementation.saveUser(user1);
		
		
		// create model attribute to bind form data
		User user = new User();
		
		theModel.addAttribute("doctor", user);
		
		return "admin/addDoctor";
	}
	
	
	@PostMapping("/save-doctor")
	public String saveEmployee(@ModelAttribute("doctor") User user) {
		
		// save the employee
	//	admin.setId(0);
		
		user.setRole("DOCTOR");
		
		user.setPassword("default");
		
		user.setEnabled(true);
		
		user.setConfirmationToken("ByAdmin-Panel");
		
		System.out.println(user);
		
		userServiceImplementation.saveUser(user);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/userdetails";
	}
	
	

	@GetMapping("/add-admin")
	public String showForm(Model theModel) {
		
		
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
		
		User user1 = userServiceImplementation.findByUsername(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         user1.setLastseen(log);
		         
		         userServiceImplementation.saveUser(user1);
		
		
		
		// create model attribute to bind form data
		User admin = new User();
		
		theModel.addAttribute("doctor", admin);
		
		return "admin/addAdmin";
	}
	
	
	@PostMapping("/save-admin")
	public String saveEmploye(@ModelAttribute("doctor") User user) {
		
		// save the employee
	//	admin.setId(0);
		
		user.setRole("ADMIN");
		
		user.setPassword("default");
		
		user.setEnabled(true);
		
		user.setConfirmationToken("ByAdmin-Panel");
		
		System.out.println(user);
		
		userServiceImplementation.saveUser(user);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/userdetails";
	}
	
	@GetMapping("/edit-my-profile")
	public String EditForm(Model theModel) {
		
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
		
		// get the employee from the service
		
		User user = userServiceImplementation.findByUsername(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         user.setLastseen(log);
		         
		         userServiceImplementation.saveUser(user);
		
		System.out.println(user);
		
		theModel.addAttribute("profile", user);
		
		return "admin/updateMyProfile";
	}
			
	
	@PostMapping("/update")
	public String update(@ModelAttribute("profile") User user) {
		
		
		System.out.println(user);
		
		userServiceImplementation.saveUser(user);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/user-details";
	}
	
	
	@RequestMapping("/appointments")
	public String appointments(Model model){
		
		
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
		
		
		
		// add to the spring model
		model.addAttribute("app", list);
		
		
		return "admin/appointment";
	}
}


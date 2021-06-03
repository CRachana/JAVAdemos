package com.sample.poc_project.controller;



import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sample.poc_project.entity.User;
import com.sample.poc_project.service.UserService;


@Controller
public class LoginController {

 @Autowired
   UserService userService;
   
	@RequestMapping("/showMyLoginPage")
	public ModelAndView showHome(@RequestParam(value="username") String username,@RequestParam( "password") String password)
  // public String showHome()
	{
		ModelAndView  model= new ModelAndView();
		
		
		model.addObject("username" ,new User());
		//m.setViewName("/admin/user-details");
		
		return  model;
		
	}


		@RequestMapping(value = "/postLoginAction" , method = RequestMethod.GET)
	public String processLoginAction(Authentication authentication, HttpSession httpSession) {

		User loggedInUser = null;
		if(authentication != null){

			loggedInUser = getUserService().findByUsername(authentication.getName());
			if(loggedInUser != null) {

				System.out.println("logged in user : "+authentication.getName());
				httpSession.setAttribute("loggedInUser", loggedInUser);
			}

			boolean isAdmin = false;
			boolean isDoctor = false;
			boolean isUser = false;
			
			Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
			for (GrantedAuthority grantedAuthority : authorities) {
				if (grantedAuthority.getAuthority().equals("ADMIN"))
				{
					isAdmin = true;
					break;
				} else if (grantedAuthority.getAuthority().equals("USER"))
				{
					isUser = true;
					break;
				} else if(grantedAuthority.getAuthority().equals("DOCTOR"))
				{
					isDoctor = true;
					break;
				} 
			}

			if (isAdmin) {

				return "redirect:/admin/user-details";
			} else if (isUser) {

				return "redirect:/user/index";
			} else if(isDoctor){

				return "redirect:/doctor/index";
			} else {

				throw new IllegalStateException();
			}

		}else {

			System.out.println("Authentication failed.");
			return "redirect:/login";
		}
	}


		private UserService getUserService() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*
	@RequestMapping("/showMyLoginPage")
	public String showHome(Model model ,String username, String password)
	
	{
		
		return "login" ;
	}
	
}
	
	
/*	
@RequestMapping(value = "/showMyLoginPage", method = RequestMethod.GET) 
public String showHome(Model model) { 
    model.addAttribute("login", new Login()); 
    return "login"; 
}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@RequestMapping("/authenticateTheUser")
	public String shwHome()
	{
		
		return "user/success";
	}*/





package com.sample.poc_project.config;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
 
 
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
 
        Set<String> role = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
       System.out.println("User role :: "+role);
        if (role.contains("ADMIN")) {
            httpServletResponse.sendRedirect("/admin/user-details");
        } 
        if (role.contains("DOCTOR")) {
            httpServletResponse.sendRedirect("/doctor/index");
        } 
        if (role.contains("USER")) {
            httpServletResponse.sendRedirect("/user/index");
        } 
       
        
    }
}

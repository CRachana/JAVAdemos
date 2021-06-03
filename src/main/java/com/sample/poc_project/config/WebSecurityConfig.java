package com.sample.poc_project.config;

import org.springframework.context.annotation.*;
import org.springframework.security.authentication.dao.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import com.sample.poc_project.service.UserDetailsServiceImpl;






//import org.springframework.security.core.userdetails.UserDetails;



//import com.sample.poc_project.service.UserDetailsServiceImpl;

//import com.sample.poc_project.service.UserDetailsServiceImpl;
 
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
   // @Bean
    //public UserDetailsService userDetailsService() {
      //  return new UserDetailsServiceImpl();
    //}
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasAnyAuthority("ADMIN")
            .antMatchers("/user/**").hasAnyAuthority("USER")
            .antMatchers("/doctor/**").hasAnyAuthority("DOCTOR")
            .antMatchers("/register").permitAll()
    		.antMatchers("/confirm").permitAll()
    		.antMatchers("/login/**").permitAll()
    		.antMatchers("/css/**").permitAll()
    		.antMatchers("/js/**").permitAll()
    		.antMatchers("/static/**").permitAll()
    		.antMatchers("/vendor/**").permitAll()
    		.antMatchers("/resources/**").permitAll()
            .antMatchers("/edit/**").hasAnyAuthority("ADMIN")
            .antMatchers("/delete/**").hasAuthority("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .loginPage("/showMyLoginPage")
            .and()
            .logout().permitAll()
            .and()
            .exceptionHandling().accessDeniedPage("/403");
       
        
        
    }
}
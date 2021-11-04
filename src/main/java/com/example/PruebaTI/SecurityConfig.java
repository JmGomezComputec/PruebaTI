package com.example.PruebaTI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.example.PruebaTI.service.UserService;


//Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
public class SecurityConfig {	
/*	@Autowired
	public UserService userDetailsService;
	
	@Autowired
	public BCryptPasswordEncoder bcrytp;
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
	 auth.userDetailsService(userDetailsService).passwordEncoder(bcrytp);	
	}
		
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http
		.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
	}
	*/
}

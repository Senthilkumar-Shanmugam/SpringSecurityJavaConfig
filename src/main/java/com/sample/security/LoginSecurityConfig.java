package com.sample.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity // enables security 
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter{

	//used to store and manage credentials,define roles
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authMgr) throws Exception{
		authMgr.inMemoryAuthentication().withUser("test")
		.password("test").authorities("ROLE_USER");
	}
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/homePage")
		.access("hasRole('ROLE_USER')")// only the user role can access home page
		.and()
		.formLogin().
		loginPage("/loginPage")
		.defaultSuccessUrl("/homePage")
		.failureUrl("/loginPage?error")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout().logoutSuccessUrl("/loginPage?logout");
	}
}

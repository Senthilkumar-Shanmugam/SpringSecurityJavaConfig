package com.sample.security.core;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/*
 * “SpringSecurityInitializer” is used to register the DelegatingFilterProxy to use the springSecurityFilterChain. 
 * It avoids writing Filters configuration in web.xml file.
 */
public class SpringSecutityInitializer extends AbstractSecurityWebApplicationInitializer{
 public void SpringSecutityInitializer(){
	 System.out.println("inside SpringSecutityInitializer constructor");
 }
}

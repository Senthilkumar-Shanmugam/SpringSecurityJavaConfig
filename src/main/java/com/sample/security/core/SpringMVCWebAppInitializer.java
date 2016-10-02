package com.sample.security.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sample.security.LoginApplicationConfig;

public class SpringMVCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	public SpringMVCWebAppInitializer(){
		System.out.println("inside SpringMVCWebAppInitializer()");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfigClasses");
		return new Class[]{LoginApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings");
		return new String[]{"/"};
	}

}

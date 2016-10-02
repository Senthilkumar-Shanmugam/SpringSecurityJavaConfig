package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	public  LoginController(){
		
	}

	@RequestMapping(value={"/"},method=RequestMethod.GET)
	public ModelAndView welcomePage(){
		System.out.println("inside welcomePage");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomePage");
		return model;
	}
	 @RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
	    public ModelAndView homePage() {
		 System.out.println("inside homePage");
	        ModelAndView model = new ModelAndView();
	        model.setViewName("homePage");
	        return model;
	    }
	 
	   @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	    public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
	    @RequestParam(value = "logout", required = false) String logout) {
			 System.out.println("inside loginPage");

	         
	        ModelAndView model = new ModelAndView();
	        if (error != null) {
	            model.addObject("error", "Invalid Credentials provided.");
	        }
	 
	        if (logout != null) {
	            model.addObject("message", "Logged out from JournalDEV successfully.");
	        }
	 
	        model.setViewName("loginPage");
	        return model;
	    }
	   
	   
}

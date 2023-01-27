package com.BikkadIT.demo1.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("welcome class controller");
	}
	
	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		
		String msg="welcome to India";
		
		ModelAndView mAv=new ModelAndView();
		mAv.addObject("MESSAGE", msg);
		mAv.setViewName("welcome");
		
		return mAv;
		
	}
	
}

package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	//회원가입
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String joinForm(){
		logger.info("==================== join form =====================");
		
		return "joinForm";
	}
	
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String joinResult(String name, String password, Model model){
		logger.info("==================== join result =====================");
		logger.info("name : "+name);
		logger.info("password : "+password);
		
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		return "joinResult";
	}
}

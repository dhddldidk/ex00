package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping(value="cal", method=RequestMethod.GET)
	public String calForm(){
		logger.info("==================== cal form =====================");
		
		return "calculator";
	}
	
	@RequestMapping(value="cal", method=RequestMethod.POST )
	public String calResult(double num1, double num2, Model model){
		logger.info("==================== cal result =====================");
		logger.info("num1",num1);
		logger.info("num2",num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2",num2);
		
		return "calculatorResult";
	}
}

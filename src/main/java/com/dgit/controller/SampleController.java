package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value="doB", method=RequestMethod.GET)
	public String doB(){
		logger.info("===================== doB ====================");
		
		return "doB";
	}
	
	@RequestMapping(value="doC", method=RequestMethod.GET)
	
	//aa(매개변수)==test
	//Model을 매개변수로 넣으면 자동으로 처리해줌
	public String doC(String aa, String bb, Model model){ 
		logger.info("===================== doC ====================");
		logger.info("aa : "+aa);
		logger.info("bb : "+bb);
		
		model.addAttribute("msg1", aa);
		model.addAttribute("msg2", bb);
		
		return "doC";
	}
	
	@RequestMapping(value="doC2", method=RequestMethod.GET)
	
	//ModelAttribute는 model.addAttribute과정을 생략하도록 하도록 해줌. 값을 실어서 바로 jsp에 전달해 줌
	
	//doC2?msg1=oooo&msg2=oooo
	public String doC2(@ModelAttribute("msg1") String msg1, @ModelAttribute("msg2") String msg2){
		logger.info("=================== doC2 GET =================");
		
		return "doC";
	}
	
	@RequestMapping(value="doC3", method=RequestMethod.GET)
	public String doC3(int msg1, Model model){ //doC3?msg1=11
		logger.info("=================== doC3 GET =================");
		
		model.addAttribute("msg1", msg1);
		
		return "doC";
		
	}
	
	@RequestMapping(value="doC4", method=RequestMethod.GET)
	public String doC4(double msg1, Model model){ //doC4?msg1=11.11
		logger.info("=================== doC3 GET =================");
		
		model.addAttribute("msg1", msg1);
		
		return "doC";
		
	}
	
	@RequestMapping(value="doC5", method=RequestMethod.GET)
	public String doC5(@ModelAttribute("msg1") double msg1){ //doC5?msg1=11.11
		logger.info("=================== doC3 GET =================");
		
		return "doC";
		
	}
}

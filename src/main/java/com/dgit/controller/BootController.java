package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {

	private static final Logger logger = LoggerFactory.getLogger(BootController.class);
	
	@RequestMapping(value="grid1", method=RequestMethod.GET)
	public String grid1(){
		logger.info("====================== grid1 ======================");
		
		return "grid1";
	}
	
	@RequestMapping(value="grid2", method=RequestMethod.GET)
	public String grid2(){
		logger.info("====================== grid2 ======================");
		
		return "grid2";
	}
	
	@RequestMapping(value="table", method=RequestMethod.GET)
	public String table(){
		logger.info("====================== table ======================");
		
		return "table";
	}
	
	@RequestMapping(value="form", method=RequestMethod.GET)
	public String form(){
		logger.info("====================== form ======================");
		
		return "form";
	}
	
	@RequestMapping(value="nav", method=RequestMethod.GET)
	public String nav(){
		logger.info("====================== nav ======================");
		
		return "navBar";
	}
	
	@RequestMapping(value="modal", method=RequestMethod.GET)
	public String modal(){
		logger.info("====================== modal ======================");
		
		return "modal";
	}
}

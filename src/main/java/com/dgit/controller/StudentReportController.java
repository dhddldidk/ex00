package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.Report;
import com.dgit.domain.StudentInfo;

@Controller
public class StudentReportController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentReportController.class);
	
	@Autowired
	Report report;
	
	@RequestMapping(value="report", method=RequestMethod.GET)
	public String studentForm(){
		logger.info("============ student form ===================");
		
		return "studentForm";
	}
	
	@RequestMapping(value="report", method=RequestMethod.POST)
	public String studentResult(StudentInfo info, Model model){
		logger.info("=============== student result ================");
		
		logger.info(info.toString());
		
		info.setReport(report);
		model.addAttribute("info",info);
		
		
		return "studentResult";
	}
	
}

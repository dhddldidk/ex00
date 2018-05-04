package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class BMIController {
	private static final Logger logger = LoggerFactory.getLogger(BMIController.class);
	
	
	//이거를 주입받아서 MyInfo에 보내줌
	@Autowired
	BMICalculator bmiCalculator;
	
	
	@RequestMapping(value="bmi", method=RequestMethod.GET)
	public String bmiForm(){
		logger.info("==================== bmi form =====================");
		
		return "bmiForm";
	}
	
	
	//MyInfo class에 있는 이름과 bmiFrom안에 name이름을 같게 하면 
	// MyInfo를 받아서 그대로 쓸 수 있음(setName, setHeight 이렇게 이름이 같으면 쓸 수 있음)
	@RequestMapping(value="bmi", method=RequestMethod.POST)
	public String bmiResult(MyInfo myinfo, Model model){
		logger.info("==================== bmi result =====================");
		
		logger.info(myinfo.toString());
		
		myinfo.setBmiCalculator(bmiCalculator);
		
		model.addAttribute("myinfo",myinfo);
		
		return "bmiResult";
	}
}

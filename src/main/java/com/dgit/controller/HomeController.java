package com.dgit.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//ex00뒤에 /가 있으면 밑에 있는 함수가 실행됨(자동 연결이 됨)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";//home.jsp를 의미함(src/main/webapp/WEB-INF/views/home.jsp
	}
	
	@RequestMapping(value="doA",method=RequestMethod.GET)//명령어는 doA
	public String doA(){
		
		//logger이 찍히도록 log4j.xml파일을 열어서 Application Loggers에 가서 패키지 명을 controller로 바꿔 줌
		logger.info("====================== doA =======================");
		return "doA";
	}
}

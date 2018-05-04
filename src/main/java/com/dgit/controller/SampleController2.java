package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProductVO;

@Controller //controller가 command랑 잘 연결되게 하기 위해
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	
	@RequestMapping(value="doD", method=RequestMethod.GET)
	public String doD(Model model){
		logger.info("==================== doD GET =====================");
		
		ProductVO vo = new ProductVO();
		vo.setName("새우깡");
		vo.setPrice(1000);
		
		model.addAttribute("product", vo);
		
		return "result";
	}
	
	@RequestMapping(value="doE", method=RequestMethod.GET)
	public String doE(Model model){
		logger.info("==================== doE GET =====================");
		
		ArrayList<ProductVO> list = new ArrayList<>();
		ProductVO vo1 = new ProductVO();
		vo1.setName("꿀꽈배기");
		vo1.setPrice(1200);
		list.add(vo1);
		
		ProductVO vo2 = new ProductVO();
		vo2.setName("월드콘");
		vo2.setPrice(1500);
		list.add(vo2);
		
		model.addAttribute("list", list);
		return "resultList";
	}
	
	@RequestMapping(value="doF", method=RequestMethod.GET)
	public String forwardTest(){
		
		logger.info("==================== forwardTest GET =====================");
		
		return "forward:doD";//doD화면이 forward되서 보여짐 forward:는 예약어임
	}
	
	@RequestMapping(value="doG", method=RequestMethod.GET)
	public String redirectTest(){
		logger.info("==================== redirectTest GET =====================");
		return "redirect:doE";//doE화면이 redirect되서 보여짐 redirectf:는 예약어임
		
	}
	
	
	//JSON으로 데이터 넘겨주기
	@ResponseBody //return하는 데이터를 제이슨으로 바꿔줌
	@RequestMapping(value="doJson", method=RequestMethod.GET)
	public ProductVO doJSON(){
		logger.info("==================== doJSON ========================");
		
		ProductVO vo = new ProductVO();
		vo.setName("고래밥");
		vo.setPrice(760);
		
		return vo;
	}
}

package com.dgit.ex00;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVo;
import com.dgit.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	//MemberDAOImpl class테스트
	//MemberDAOImpl를 주입해주는 config file 밑에 두 줄을 입력해야 함
	
	//@RunWith(SpringJUnit4ClassRunner.class)
	//@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
	
	@Autowired
	MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{//DB시간을 받아와서 찍어줌
		System.out.println(dao.readTime());
	}
	
	//@Test
	public void testCreateMember() throws Exception{
		MemberVo vo = new MemberVo();
		vo.setUserid("userid11");
		vo.setUserpw("12345");
		vo.setEmail("userid11@naver.com");
		vo.setUsername("사과");
		
		dao.createMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception{
		MemberVo vo = dao.readMember("userid11");
		System.out.println("아이디로 찾은 회원 : "+vo);
	}
	
	@Test
	public void readWithPW() throws Exception{
		
		
		MemberVo vo = dao.readWithPW("userid11", "12345");
		System.out.println("아이디와 비번으로 찾은 회원 : "+vo);
	}
}

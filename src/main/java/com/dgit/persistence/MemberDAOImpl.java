package com.dgit.persistence;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.MemberVo;

@Repository
public class MemberDAOImpl implements MemberDAO {

	
	@Autowired
	SqlSession session;
	
	private static final String namespace="com.dgit.mapper.MemberMapper";
	
	@Override
	public String readTime() throws Exception {
		return session.selectOne(namespace+".readTime");
	}

	@Override
	public void createMember(MemberVo vo) throws Exception {
		session.insert(namespace+".createMember", vo);
	}

	@Override
	public MemberVo readMember(String userid) throws Exception {
		return session.selectOne(namespace+".readMember", userid);
	}

	@Override
	public MemberVo readWithPW(String userid, String userpw) throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		return session.selectOne(namespace+".readWithPW", map);
	}

}

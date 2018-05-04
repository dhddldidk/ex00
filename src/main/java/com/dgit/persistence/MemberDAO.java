package com.dgit.persistence;

import com.dgit.domain.MemberVo;

public interface MemberDAO {
	public String readTime() throws Exception;
	
	public void createMember(MemberVo vo) throws Exception;
	
	public MemberVo readMember(String userid) throws Exception;
	
	public MemberVo readWithPW(String userid, String userpw) throws Exception;
}

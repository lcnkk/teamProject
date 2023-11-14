package com.w2.client;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// 아이디 중복 체크
	public int idCheck(String cId) {
		System.err.println("[ ClientDAO ] : idCheck");
		System.err.println("        > cId: " + cId);
		return sqlSessionTemplate.selectOne("ClientDAO.idCheck", cId);
	}
	
	// 아이디 중복 체크
	public String nicCheck(String clientNickName) {
		System.out.println("[ ClientDAO ] : nicCheck");
		
		return sqlSessionTemplate.selectOne("ClientDAO.nicCheck", clientNickName);
	}
	
	// 회원 가입 요청
	public int insertClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : insertClient");

		// selectOne으로 작성해서 안된것
		return sqlSessionTemplate.insert("ClientDAO.insertClient", client);
	}

	// 로그인 요청
	public ClientVO getClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : getClient");
		System.err.println("2. client : " + client);
		return sqlSessionTemplate.selectOne("ClientDAO.loginClient", client);
	}
}

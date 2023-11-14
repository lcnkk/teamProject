package com.w2.client;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// ?��?��?�� 중복 체크
	public int idCheck(String cId) {
		System.err.println("[ ClientDAO ] : idCheck");
		System.err.println("        > cId: " + cId);
		return sqlSessionTemplate.selectOne("ClientDAO.idCheck", cId);
	}
	
	// ?��?��?�� 중복 체크
	public String nicCheck(String clientNickName) {
		System.out.println("[ ClientDAO ] : nicCheck");
		
		return sqlSessionTemplate.selectOne("ClientDAO.nicCheck", clientNickName);
	}
	
	// ?��?�� �??�� ?���?
	public int insertClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : insertClient");

		// selectOne?���? ?��?��?��?�� ?��?���?
		return sqlSessionTemplate.insert("ClientDAO.insertClient", client);
	}

	// 로그?�� ?���?
	public ClientVO getClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : getClient");
		System.err.println("2. client : " + client);
		return sqlSessionTemplate.selectOne("ClientDAO.loginClient", client);
	}
}

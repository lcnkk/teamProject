package com.w2.client;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// ??΄? μ€λ³΅ μ²΄ν¬
	public int idCheck(String cId) {
		System.err.println("[ ClientDAO ] : idCheck");
		System.err.println("        > cId: " + cId);
		return sqlSessionTemplate.selectOne("ClientDAO.idCheck", cId);
	}
	
	// ??΄? μ€λ³΅ μ²΄ν¬
	public String nicCheck(String clientNickName) {
		System.out.println("[ ClientDAO ] : nicCheck");
		
		return sqlSessionTemplate.selectOne("ClientDAO.nicCheck", clientNickName);
	}
	
	// ?? κ°?? ?μ²?
	public int insertClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : insertClient");

		// selectOne?Όλ‘? ??±?΄? ??κ²?
		return sqlSessionTemplate.insert("ClientDAO.insertClient", client);
	}

	// λ‘κ·Έ?Έ ?μ²?
	public ClientVO getClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : getClient");
		System.err.println("2. client : " + client);
		return sqlSessionTemplate.selectOne("ClientDAO.loginClient", client);
	}
}

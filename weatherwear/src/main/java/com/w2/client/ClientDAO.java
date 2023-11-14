package com.w2.client;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// ?•„?´?”” ì¤‘ë³µ ì²´í¬
	public int idCheck(String cId) {
		System.err.println("[ ClientDAO ] : idCheck");
		System.err.println("        > cId: " + cId);
		return sqlSessionTemplate.selectOne("ClientDAO.idCheck", cId);
	}
	
	// ?•„?´?”” ì¤‘ë³µ ì²´í¬
	public String nicCheck(String clientNickName) {
		System.out.println("[ ClientDAO ] : nicCheck");
		
		return sqlSessionTemplate.selectOne("ClientDAO.nicCheck", clientNickName);
	}
	
	// ?šŒ?› ê°??… ?š”ì²?
	public int insertClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : insertClient");

		// selectOne?œ¼ë¡? ?‘?„±?•´?„œ ?•ˆ?œê²?
		return sqlSessionTemplate.insert("ClientDAO.insertClient", client);
	}

	// ë¡œê·¸?¸ ?š”ì²?
	public ClientVO getClient(ClientVO client) {
		System.out.println("[ ClientDAO ] : getClient");
		System.err.println("2. client : " + client);
		return sqlSessionTemplate.selectOne("ClientDAO.loginClient", client);
	}
}

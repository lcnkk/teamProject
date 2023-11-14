package com.w2.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w2.client.ClientDAO;
import com.w2.client.ClientService;
import com.w2.client.ClientVO;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO dao;
	
	// 아이디 중복 확인
	@Override
	public int idCheckService(String clientId) {
		System.out.println("[ ClientServiceImpl ] : idCheckService ");
		
		System.out.println("Service : " + clientId);
		int idCheck = dao.idCheck(clientId);
		
		System.err.println("2. int idCheck : " + idCheck);
		
		if(idCheck == 1) { // 아이디 존재하는 경우
			System.err.println("[ ClientServiceImpl ] : 아이디 존재합니다.");
		} else {	// 아이디 존재하지 않는 경우
			System.err.println("[ ClientServiceImpl ] : 아이디 존재하지 않음");
		}
		
		return idCheck;
	}

	// 닉네임 중복 확인
	@Override
	public boolean nicCheckService(String clientNickName) {
		
		String nicCheck = dao.nicCheck(clientNickName);
		
		if(nicCheck == null)
			return false;
		else
			return true;
	}
	
	// 회원 정보 등록
	@Override
	public int insertService(ClientVO client) {
		return dao.insertClient(client);
	}

	// 로그인 요청
	@Override
	public ClientVO login(ClientVO client) {
		System.out.println("[ ClientService ] : login");
		System.err.println("clientService client : " + client);
		
		ClientVO result = dao.getClient(client);
		System.err.println("clientService result : " + result);
		
		return result;
	}

	
	
}

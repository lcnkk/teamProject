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
	
	// ??ด? ์ค๋ณต ??ธ
	@Override
	public int idCheckService(String clientId) {
		System.out.println("[ ClientServiceImpl ] : idCheckService ");
		
		System.out.println("Service : " + clientId);
		int idCheck = dao.idCheck(clientId);
		
		System.err.println("2. int idCheck : " + idCheck);
		
		if(idCheck == 1) { // ??ด? ์กด์ฌ?? ๊ฒฝ์ฐ
			System.err.println("[ ClientServiceImpl ] : ??ด? ์กด์ฌ?ฉ??ค.");
		} else {	// ??ด? ์กด์ฌ?์ง? ?? ๊ฒฝ์ฐ
			System.err.println("[ ClientServiceImpl ] : ??ด? ์กด์ฌ?์ง? ??");
		}
		
		return idCheck;
	}

	// ??ค? ์ค๋ณต ??ธ
	@Override
	public boolean nicCheckService(String clientNickName) {
		
		String nicCheck = dao.nicCheck(clientNickName);
		
		if(nicCheck == null)
			return false;
		else
			return true;
	}
	
	// ?? ? ๋ณ? ?ฑ๋ก?
	@Override
	public int insertService(ClientVO client) {
		return dao.insertClient(client);
	}

	// ๋ก๊ทธ?ธ ?์ฒ?
	@Override
	public ClientVO login(ClientVO client) {
		System.out.println("[ ClientService ] : login");
		System.err.println("clientService client : " + client);
		
		ClientVO result = dao.getClient(client);
		System.err.println("clientService result : " + result);
		
		return result;
	}

	
	
}

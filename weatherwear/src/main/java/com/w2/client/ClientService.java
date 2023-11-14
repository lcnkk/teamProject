package com.w2.client;

public interface ClientService {
	
	// 중복 아이디 확인
	public int idCheckService(String clientId);
	
	// 중복 닉네임 확인
	public boolean nicCheckService(String clientNickName);
	
	// 회원 가입 정보 DB에 삽입
	public int insertService(ClientVO client);
		
	// 로그인 요청
	public ClientVO login(ClientVO client);
	
}

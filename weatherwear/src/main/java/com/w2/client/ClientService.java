package com.w2.client;

public interface ClientService {
	
	// 중복 ?��?��?�� ?��?��
	public int idCheckService(String clientId);
	
	// 중복 ?��?��?�� ?��?��
	public boolean nicCheckService(String clientNickName);
	
	// ?��?�� �??�� ?���? DB?�� ?��?��
	public int insertService(ClientVO client);
		
	// 로그?�� ?���?
	public ClientVO login(ClientVO client);
	
}

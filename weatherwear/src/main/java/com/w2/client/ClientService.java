package com.w2.client;

public interface ClientService {
	
	// ์ค๋ณต ??ด? ??ธ
	public int idCheckService(String clientId);
	
	// ์ค๋ณต ??ค? ??ธ
	public boolean nicCheckService(String clientNickName);
	
	// ?? ๊ฐ?? ? ๋ณ? DB? ?ฝ?
	public int insertService(ClientVO client);
		
	// ๋ก๊ทธ?ธ ?์ฒ?
	public ClientVO login(ClientVO client);
	
}

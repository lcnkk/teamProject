package com.w2.client;

public interface ClientService {
	
	// ì¤‘ë³µ ?•„?´?”” ?™•?¸
	public int idCheckService(String clientId);
	
	// ì¤‘ë³µ ?‹‰?„¤?„ ?™•?¸
	public boolean nicCheckService(String clientNickName);
	
	// ?šŒ?› ê°??… ? •ë³? DB?— ?‚½?…
	public int insertService(ClientVO client);
		
	// ë¡œê·¸?¸ ?š”ì²?
	public ClientVO login(ClientVO client);
	
}

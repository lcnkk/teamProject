package com.w2.client;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClientVO {
	private String clientId;				//필수
	private String clientPwd;				//필수
	private Date chPwdDate;
	private String clientName;				//필수
	private String clientNum;				//필수
	private String clientEmail;				//필수
	private char clientEmailCheck;			//필수
	private Date clientRegDate;
	private String clientRecId;
	private String clientBirth;				//필수
	private String clientNickName;			//필수
	private char gradeId;					//필수
	private int clientPoint;				//필수
	private String cpList;
	private String crList;
	private String cmarkList;
	private Date clientLogDate;
	private int clientBuyCnt;
//	
//	public ClientVO() {
//		super();
//	}
//
//	public ClientVO(String cId, String cPwd, Date chPwdDate, String cName, String cNum, String cEmail,
//			char cEmailCheck, Date cRegDate, String cRecId, String cBirth, String cNickName, char grId, int cPoint,
//			String cpList, String crList, String cmarkList, Date cLogDate, int cBuyCnt) {
//		super();
//		this.cId = cId;
//		this.cPwd = cPwd;
//		this.chPwdDate = chPwdDate;
//		this.cName = cName;
//		this.cNum = cNum;
//		this.cEmail = cEmail;
//		this.cEmailCheck = cEmailCheck;
//		this.cRegDate = cRegDate;
//		this.cRecId = cRecId;
//		this.cBirth = cBirth;
//		this.cNickName = cNickName;
//		this.grId = grId;
//		this.cPoint = cPoint;
//		this.cpList = cpList;
//		this.crList = crList;
//		this.cmarkList = cmarkList;
//		this.cLogDate = cLogDate;
//		this.cBuyCnt = cBuyCnt;
//	}
}

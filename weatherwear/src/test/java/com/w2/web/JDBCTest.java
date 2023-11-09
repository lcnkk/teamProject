package com.w2.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

/** AWS MySQL 연동 확인 테스트 */
public class JDBCTest {
	
	@Test
	public void testConnection() {
		String url = "jdbc:mysql://webserverdb.cvlrcwcvdqwj.ap-northeast-2.rds.amazonaws.com:3306/mysql";
		String user = "hyeonga";
		String password = "hyeonga123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("==========[ JDBCTest() ]==========");
			System.out.println("Connection Successful");
			System.out.println("Connection : " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

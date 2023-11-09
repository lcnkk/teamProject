package com.w2.sample.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSession 객체를 얻기위한 클래스
public class SqlSessionFactoryBean {
	
	// SqlSession 객체를 얻기 위해 필요한 객체
	private static SqlSessionFactory sessionFactory = null;
	
	/*
 		- static 으로 선언하는 이유
 			- 객체 공유 : SqlSessionFactoryBean 객체를 한 번 생성하여 공유합니다.
 			- 싱글턴패턴 적용 : 객체를 하나만 생성하여 공유 > 객체 상태 유지, 일관성 유지
 			- 빠른 객체 생성으로 성능 향상
	 */
	static {
		
		try {
			if(sessionFactory == null) {
				// config 파일을 읽어와 SqlSessionFactory 객체를 생성합니다.
				Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSessionInstance() {
		// SqlSession 객체를 생성하여 반환합니다.
		return sessionFactory.openSession();
	}
}
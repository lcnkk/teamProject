package com.w2.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.w2.sample.util.SqlSessionFactoryBean;

@Repository
public class SampleDAO {
	
	/*
	private SqlSession sqlSession;
	
	public SampleDAO(){
		sqlSession = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	*/
	/*
	 	sqlSession.@@(1, 2);
	 		- 1 : 실행될 SQL의 id 정보입니다.
	 		- 2 : parameterType 속성으로 지정된 파라미터 객체입니다.
	 */
	/*	
	public void insertSample(SampleVO vo) {
		System.out.println("[ SampleDAO ] : insertSample");
		sqlSession.insert("SampleDAO.insertSample", vo);
	}
	
	public void updateSample(SampleVO vo) {
		System.out.println("[ SampleDAO ] : updateSample");
		sqlSession.update("SampleDAO.updateSample", vo);
	}
	
	public void deleteSample(SampleVO vo) {
		System.out.println("[ SampleDAO ] : deleteSample");
		sqlSession.delete("SampleDAO.deleteSample", vo);
	}

	public SampleVO getSample(SampleVO vo) {
		System.out.println("[ SampleDAO ] : getSample");
		return (SampleVO) sqlSession.selectOne("SampleDAO.getSample", vo);
	}
	
	public List<SampleVO> getSampleList(SampleVO vo){
		System.out.println("[ SampleDAO ] : getSampleList");
		return sqlSession.selectList("SampleDAO.getSampleList", vo);
	}
	*/
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertSample(SampleVO vo) {
		System.out.println("[ SampleDAO ] : insertSample");
		System.out.println("vo : " + vo);
		sqlSessionTemplate.insert("SampleDAO.insertSample", vo);
	}
	
	public void updateSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : updateSample");
		sqlSessionTemplate.update("SampleDAO.updateSample", sample);
	}
	
	public void deleteSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : deleteSample");
		sqlSessionTemplate.delete("SampleDAO.deleteSample", sample);
	}

	public SampleVO getSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : getSample");
		return (SampleVO) sqlSessionTemplate.selectOne("SampleDAO.getSample", sample);
	}
	
	public List<SampleVO> getSampleList(SampleVO sample){
		System.out.println("[ SampleDAO ] : getSampleList");
		System.out.println("sample : " + sample);
		System.out.println("SqlsessionTemplate : " + sqlSessionTemplate);
		return sqlSessionTemplate.selectList("SampleDAO.getSampleList", sample);
	}
}

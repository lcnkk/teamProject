package com.w2.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SampleDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<SampleVO> getSampleList(SampleVO sample){
		System.out.println("[ SampleDAO ] : getSampleList");
		//System.out.println("sample : " + sample);
		//System.out.println("SqlsessionTemplate : " + sqlSessionTemplate);
		return sqlSessionTemplate.selectList("SampleDAO.getSampleList", sample);
	}
	
	public void insertSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : insertSample 1");
		sqlSessionTemplate.insert("SampleDAO.insertSample", sample);
	}
	
	public void updateSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : updateSample");
		System.out.println("sample : " + sample.toString());
		sqlSessionTemplate.update("SampleDAO.updateSample", sample);
	}
	
	public void deleteSample(SampleVO sample) {
		System.out.println("[ SampleDAO ] : deleteSample");
		sqlSessionTemplate.delete("SampleDAO.deleteSample", sample);
	}
	
	public SampleVO getSample(SampleVO sample) {
		return sqlSessionTemplate.selectOne("SampleDAO.getSample", sample);
	}
}

package com.w2.sample;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertSample(SampleVO sample) {
		System.out.println("[ SampleDAOMybatis ] : insertSample");
		sqlSessionTemplate.insert("SampleDAO.insertSample", sample);
	}
	
	public void updateSample(SampleVO sample) {
		System.out.println("[ SampleDAOMybatis ] : updateSample");
		sqlSessionTemplate.update("SampleDAO.updateSample", sample);
	}
	
	public void deleteSample(SampleVO sample) {
		System.out.println("[ SampleDAOMybatis ] : deleteSample");
		sqlSessionTemplate.delete("SampleDAO.deleteSample", sample);
	}

	public SampleVO getSample(SampleVO sample) {
		System.out.println("[ SampleDAOMybatis ] : getSample");
		return (SampleVO) sqlSessionTemplate.selectOne("SampleDAO.getSample", sample);
	}
	
	public List<SampleVO> getSampleList(SampleVO sample){
		System.out.println("[ SampleDAOMybatis ] : getSampleList");
		return sqlSessionTemplate.selectList("SampleDAO.getSampleList", sample);
	}
}

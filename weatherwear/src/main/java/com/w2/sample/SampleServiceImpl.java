package com.w2.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDAO dao;
	
	@Override
	public List<SampleVO> getSampleList(SampleVO sample) {
		return dao.getSampleList(sample);
	}

	@Override
	public void insertSample(SampleVO sample) {
		dao.insertSample(sample);
	}

	@Override
	public void updateSample(SampleVO sample) {
		dao.updateSample(sample);
	}

	@Override
	public void deleteSample(SampleVO sample) {
		dao.deleteSample(sample);
	}

	@Override
	public SampleVO getSample(SampleVO sample) {
		return dao.getSample(sample);
	}

}

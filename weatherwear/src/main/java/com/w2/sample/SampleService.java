package com.w2.sample;

import java.util.List;

public interface SampleService {
	List<SampleVO> getSampleList(SampleVO sample);
	void insertSample(SampleVO sample);
	void updateSample(SampleVO sample);
	void deleteSample(SampleVO sample);
	SampleVO getSample(SampleVO sample);
}

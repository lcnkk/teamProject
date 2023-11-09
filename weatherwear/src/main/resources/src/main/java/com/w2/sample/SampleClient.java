package com.w2.sample;

import java.util.List;

public class SampleClient {
	public static void main(String[] args) {
		System.out.println("start");
		
		SampleDAO dao = new SampleDAO();
		System.out.println("dao : " + dao);
		
		SampleVO vo = new SampleVO();
		System.out.println("vo : " + vo);
		
		vo.setNum(100);
		vo.setTitle("SampleTest Title 100");
		vo.setContent("SampleTest Content 100");
		

		System.out.println("vo : " + vo);
		System.out.println(System.getProperty("java.class.path"));
		//dao.insertSample(vo);
		
		List<SampleVO> sampleList = dao.getSampleList(vo);

		for(SampleVO sample : sampleList) {
			System.out.println("[ SampleClient ] : " + sample.toString());
		}
	}
}

package com.w2.sample;

import java.util.List;

public class SampleClient {
	public static void main(String[] args) {
		System.out.println("start");
		
		SampleDAO dao = new SampleDAO();
		System.out.println("dao : " + dao);
		
		SampleVO vo = new SampleVO();
		System.out.println("\n\n 1) vo : " + vo);
		
		List<SampleVO> sampleList = dao.getSampleList(vo);
		System.out.println("\n\n 3) sampleList : " + sampleList);
		
		for(SampleVO sample : sampleList) {
			System.out.println("[ SampleClient ] : " + sample.toString());
		}
	}
}

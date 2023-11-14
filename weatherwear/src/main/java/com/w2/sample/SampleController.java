package com.w2.sample;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/sampleIndex.do")
	public String sampleIndex(){
		return "sample/index";
	}
	
	@RequestMapping("/getSampleList.do")
	public String getSampleList(SampleVO sample, SampleDAO dao, Model model) {
		System.out.println("[ SampleController ] : getSampleList");
		
		model.addAttribute("sampleList", sampleService.getSampleList(sample));
		return "sample/getSampleList";
	}
	
	@RequestMapping("/getSample.do")
	public String getSample(SampleVO sample, SampleDAO dao, Model model) {
		System.out.println("[ SampleController ] : getSample");
		
		model.addAttribute("sample", sampleService.getSample(sample));
		return "sample/getSample";
	}
	
	@GetMapping("/insertSample.do")
	public String insertView() throws IOException{
		System.out.print("[ SampleController ] : insertSample");
		
		return "sample/insertSample";
	}
	
	@PostMapping("/insertSample.do")
	public String insertSample(SampleVO sample) throws IOException{
		System.out.print("[ SampleController ] : insertSample");
		
		sampleService.insertSample(sample);
		// redirect?•˜?Š” ê²½ìš° .do ë¶™ì—¬?•¼?•©?‹ˆ?‹¤.
		return "redirect: getSampleList.do";
	}
	
	@RequestMapping("/updateSample.do")
	public String updateSample(@ModelAttribute("sample") SampleVO sample, SampleDAO dao) {
		System.out.println("[ SampleController ] : updateSample");
		
		System.out.println(sample.toString());
		
		sampleService.updateSample(sample);
		return "redirect:getSampleList.do";
	}
	
	@RequestMapping("/deleteSample.do")
	public String deleteSample(SampleVO sample, SampleDAO dao) {
		System.out.println("[ SampleController ] : deleteSample");
		
		sampleService.deleteSample(sample);
		return "redirect:getSampleList.do";
	}
}

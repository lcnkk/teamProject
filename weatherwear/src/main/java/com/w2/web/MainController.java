package com.w2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/mainIndex.do")
	public String mainIndex() {
		return "main/mainIndex";
	}
}

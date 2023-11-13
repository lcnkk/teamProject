package com.w2.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
	
	@RequestMapping("/") 
	public String mainIndex2() {
		System.out.println("[ ClientController ] : mainIndex");
		return "client/mainIndex";
	}
	
	@RequestMapping("/mainIndex.do") 
	public String mainIndex() {
		System.out.println("[ ClientController ] : mainIndex");
		return "client/mainIndex";
	}
	
	@RequestMapping("/productList.do")
	public String productNew() {
		System.out.println("[ ClientController ] : product_list");
		return "client/product/product_list";
	}
	
	@RequestMapping("/productInfo.do")
	public String productInfo() {
		System.out.println("[ ClientController ] : product_info");
		return "client/product/product_info";
	}

	@RequestMapping("/clientLogin.do")
	public String clientLogin() {
		System.out.println("[ ClientController ] : clientLogin");
		return "client/client_login";
	}
	
	@RequestMapping("/clientJoin.do")
	public String clientJoin() {
		System.out.println("[ ClientController ] : clientJoin");
		return "client/client_join";
	}
	
	@RequestMapping("/clientCart.do")
	public String clientCart() {
		System.out.println("[ ClientController ] : clientCart");
		return "client/client_cart";
	}

	@RequestMapping("/clientOrder.do")
	public String clientOrder() {
		System.out.println("[ ClientController ] : clientOrder");
		return "client/client_order";
	}
}
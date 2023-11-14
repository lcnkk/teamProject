package com.w2.client;
//package com.w2.client;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//public class ClientController2 {
//	
//	@Autowired
//	private ClientService clientService;
//	
//	@RequestMapping("/mainIndex.do")
//	public String mainIndex() {
//		System.out.println("[ ClientController ] : mainIndex");
//		return "client/mainIndex";
//	}
//	
//	@RequestMapping("/productList.do")
//	public String productNew() {
//		System.out.println("[ ClientController ] : product_list");
//		return "client/product/product_list";
//	}
//	
//	@RequestMapping("/productInfo.do")
//	public String productInfo() {
//		System.out.println("[ ClientController ] : product_info");
//		return "client/product/product_info";
//	}
//
//	@RequestMapping("/clientLogin.do")
//	public String clientLogin() {
//		System.out.println("[ ClientController ] : clientLogin");
//		return "client/client_login";
//	}
//
//	// ?��?�� �??�� ?�� ?���?
//	@RequestMapping("/clientJoin.do")
//	public String clientJoin() {
//		System.out.println("[ ClientController ] : clientJoin");
//		return "client/client_join";
//	}
//	
//	// ?��?��?�� 중복 ?��?��
//	@RequestMapping("/checkId.do")
//	public boolean checkId(HttpServletRequest request) {
//		System.out.println("[ ClientController ] : checkId");
//		
//		String cId = request.getParameter("cId");
//		boolean result = clientService.idCheckService(cId);
//		
//		return result;
//	}
//	
//	// ?��?�� ?���? ?���?
//	@PostMapping("/clientJoin.do")
//	public String clientJoin(ClientVO vo, RedirectAttributes ra) {
//		
//		boolean idCheck = clientService.idCheckService(vo.getCId());
//		String msg = null;
//		
//		if(idCheck == true) {
//			msg = "?���? 존재?��?�� ?��?��?��?��?��?��.";
//			ra.addFlashAttribute("msg", msg);
//			return "redirect:/clientJoin.do";
//		}
//		
//		int result = 0;
//		
//		if(result == 1) {
//			msg = "?��?���??��?�� ?��공했?��?��?��.";
//			ra.addFlashAttribute("msg", msg);
//			return "redirect:/clientLogin.do";
//		} else {
//			msg = "?��?���??��?�� ?��?��?��?��?��?��. ?��?�� ?��?��?��주세?��";
//			ra.addFlashAttribute("msg", msg);
//			return "redirect:/clientJoin.do";
//		}
//	}
//	
//	@RequestMapping("/clientCart.do")
//	public String clientCart() {
//		System.out.println("[ ClientController ] : clientCart");
//		return "client/client_cart";
//	}
//
//	@RequestMapping("/clientOrder.do")
//	public String clientOrder() {
//		System.out.println("[ ClientController ] : clientOrder");
//		return "client/client_order";
//	}
//}
package com.w2.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	// 메인?��?���?
	@RequestMapping("/")
	public String mainIndex() {
		System.out.println("[ ClientController ] : mainIndex");
		log.debug(null);
		return "client/client_main";
	}
	
	// ?��?�� 목록 조회
	@RequestMapping("/productList.do")
	public String productNew() {
		System.out.println("[ ClientController ] : product_list");
		return "client/product/product_list";
	}
	
	// ?��?�� ?��?�� 조회
	@RequestMapping("/productInfo.do")
	public String productInfo() {
		System.out.println("[ ClientController ] : product_info");
		return "client/product/product_info";
	}

	// 로그?�� ?�� ?���?
	@RequestMapping("/clientLogin.do")
	public String clientLogin() {
		System.out.println("[ ClientController ] : clientLogin");
		return "client/client_login";
	}
	
	// 로그?�� ?���?
	@PostMapping("/clientLogin.do")
	public String clientLogin(ClientVO client, RedirectAttributes ra, HttpServletRequest request) {
		System.out.println("[ ClientController ] : clientLogin");
		String msg = null;

		// ?��?���? ?��?��?���? ?��?��
		HttpSession session = request.getSession(false);
		
		// ?��?��?�� 존재 ?���? ?��?��
		int check = service.idCheckService(client.getClientId());
		System.err.println("client.getClientId(): " + client.getClientId());
		
		if (check==1) {	// ?��?��?�� ?��?��
			ClientVO login = service.login(client);

			if (login != null) {
				msg = "?��공적?���? 로그?��?��?��?��?��?��.";
				ra.addFlashAttribute("msg", msg);
				
				session.setAttribute("client", login);
				
				return "redirect:/";
			} else {
				msg = "비�?번호�? ?��치하�? ?��?��?��?��.";
				ra.addFlashAttribute("msg", msg);
				
				return "redirect:/clientLogin.do";
			}
			
		} else { // ?��?��?�� ?��?��
			msg = "?��?��?���? 존재?���? ?��?��?��?��.";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientLogin.do";
		}
	}

	// ?��?�� �??�� ?�� ?���?
	@RequestMapping("/clientJoin.do")
	public String clientJoin() {
		System.out.println("[ ClientController ] : clientJoin");
		return "client/client_join";
	}
	
	// ?��?�� ?���? ?���?
	@PostMapping("/clientJoin.do")
	public String clientJoin(ClientVO client, RedirectAttributes ra) {
		System.out.println("[ ClientController ] : clientJoin/post");
		
		int result = 0;
		
		if(client.getClientRecId() == null || client.getClientRecId().equals(""))
			client.setClientRecId(null);
		
		//System.out.println("client : " + client.toString());
		result = service.insertService(client);
		
		String msg = null;
		
		if(result == 1) {
			msg = "?��?���??��?�� ?��공했?��?��?��.";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientLogin.do";
		} else {
			msg = "?��?���??��?�� ?��?��?��?��?��?��. ?��?�� ?��?��?��주세?��";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientJoin.do";
		}
		
	}
		
	// ?��?��?�� 중복 체크
	@PostMapping("/idCheck.do")
	public int idCheck(String clientId) {
		int check = service.idCheckService(clientId);
		System.err.println("1. clientId : " + clientId);
		System.err.println("> idCheck : " + check);
		return check;
	}
	
	@PostMapping("/checkId.do")
	public String checkId(String clientId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("getParameter : " + request.getParameter("clientId"));
		
		int check = service.idCheckService(clientId);
		System.out.println("check : " + check);
		
		response.setContentType("applicaion/json");
		//response.setContentType("text/plain");
		response.getWriter().write(String.valueOf(check));
		return null;
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

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
	
	// ë©”ì¸?Ž˜?´ì§?
	@RequestMapping("/")
	public String mainIndex() {
		System.out.println("[ ClientController ] : mainIndex");
		log.debug(null);
		return "client/client_main";
	}
	
	// ?ƒ?’ˆ ëª©ë¡ ì¡°íšŒ
	@RequestMapping("/productList.do")
	public String productNew() {
		System.out.println("[ ClientController ] : product_list");
		return "client/product/product_list";
	}
	
	// ?ƒ?’ˆ ?ƒ?„¸ ì¡°íšŒ
	@RequestMapping("/productInfo.do")
	public String productInfo() {
		System.out.println("[ ClientController ] : product_info");
		return "client/product/product_info";
	}

	// ë¡œê·¸?¸ ?¼ ?š”ì²?
	@RequestMapping("/clientLogin.do")
	public String clientLogin() {
		System.out.println("[ ClientController ] : clientLogin");
		return "client/client_login";
	}
	
	// ë¡œê·¸?¸ ?š”ì²?
	@PostMapping("/clientLogin.do")
	public String clientLogin(ClientVO client, RedirectAttributes ra, HttpServletRequest request) {
		System.out.println("[ ClientController ] : clientLogin");
		String msg = null;

		// ?—†?œ¼ë©? ?ƒ?„±?•˜ì§? ?•Š?Œ
		HttpSession session = request.getSession(false);
		
		// ?•„?´?”” ì¡´ìž¬ ?œ ë¬? ?™•?¸
		int check = service.idCheckService(client.getClientId());
		System.err.println("client.getClientId(): " + client.getClientId());
		
		if (check==1) {	// ?•„?´?”” ?žˆ?Œ
			ClientVO login = service.login(client);

			if (login != null) {
				msg = "?„±ê³µì ?œ¼ë¡? ë¡œê·¸?¸?˜?—ˆ?Šµ?‹ˆ?‹¤.";
				ra.addFlashAttribute("msg", msg);
				
				session.setAttribute("client", login);
				
				return "redirect:/";
			} else {
				msg = "ë¹„ë?ë²ˆí˜¸ê°? ?¼ì¹˜í•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.";
				ra.addFlashAttribute("msg", msg);
				
				return "redirect:/clientLogin.do";
			}
			
		} else { // ?•„?´?”” ?—†?Œ
			msg = "?•„?´?””ê°? ì¡´ìž¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientLogin.do";
		}
	}

	// ?šŒ?› ê°??ž… ?¼ ?š”ì²?
	@RequestMapping("/clientJoin.do")
	public String clientJoin() {
		System.out.println("[ ClientController ] : clientJoin");
		return "client/client_join";
	}
	
	// ?šŒ?› ?“±ë¡? ?š”ì²?
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
			msg = "?šŒ?›ê°??ž…?— ?„±ê³µí–ˆ?Šµ?‹ˆ?‹¤.";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientLogin.do";
		} else {
			msg = "?šŒ?›ê°??ž…?— ?‹¤?Œ¨?–ˆ?Šµ?‹ˆ?‹¤. ?‹¤?‹œ ?‹œ?„?•´ì£¼ì„¸?š”";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/clientJoin.do";
		}
		
	}
		
	// ?•„?´?”” ì¤‘ë³µ ì²´í¬
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

package com.w2.admin.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jdk.jfr.Description;

@Controller
public class AdminController {
	
	@RequestMapping(value = "/login.mdo")
	@Description("DashBoard ������")
	public String login(Locale locale, Model model) {
		return "/admin/login";
	}
	
	@RequestMapping(value = "/dashboard.mdo")
	@Description("DashBoard ������")
	public String index(Locale locale, Model model) {
		return "/admin/main";
	}
	
	@RequestMapping(value = "/couponUser.mdo")
	@Description("���� ����������(�����)")
	public String couponUser(Locale locale, Model model) {
		/* return "/w2/coupon/coupon"; */
		return "/admin/coupon/user/couponUser";
	}
	
	@RequestMapping(value = "/newCouponDetail.mdo")
	@Description("�� ���� �ޱ� ������(�����)")
	public String newCouponDetail(Locale locale, Model model) {
		/* return "/w2/coupon/coupon"; */
		return "/admin/coupon/user/newCouponDetail";
	}
	
	@RequestMapping(value = "/coupon.mdo")
	@Description("���� ����������(������)")
	public String coupon(Locale locale, Model model) {
		 return "/admin/coupon/coupon"; 
	}
	
	@RequestMapping(value = "/stoke.mdo")
	@Description("���� ���� ������")
	public String distribution(Locale locale, Model model) {
		return "/admin/stoke";
	}
	
	@RequestMapping(value = "/order.mdo")
	@Description("�ֹ� ���� ������")
	public String order(Locale locale, Model model) {
		return "/admin/order";
	}
	
	@RequestMapping(value = "/deliverInfo.mdo")
	@Description("��۰��� ������")
	public String deliverInfo(Locale locale, Model model) {
		return "/admin/deliverInfo";
	}
	
	@RequestMapping(value = "/swap.mdo")
	@Description("��ȯ/ȯ�� ������")
	public String swap(Locale locale, Model model) {
		return "/admin/swap";
	}
	
	@RequestMapping(value = "/balance.mdo")
	@Description("���� ���� ������")
	public String balance(Locale locale, Model model) {
		return "/admin/balance";
	}
	
	@RequestMapping(value = "/client.mdo")
	@Description("ȸ�� ���� ������")
	public String client(Locale locale, Model model) {
		return "/admin/client";
	}
	
	@RequestMapping(value = "/notice.mdo")
	@Description("�������� ������")
	public String notice(Locale locale, Model model) {
		 return "/admin/board/notice"; 
	}
	
	@RequestMapping(value = "/writeNotice.mdo")
	@Description("�������� �۾��� ������")
	public String writeNotice(Locale locale, Model model) {
		 return "/admin/board/writeNotice"; 
	}
	
	@RequestMapping(value = "/writeFaq.mdo")
	@Description("���ǻ��� �۾��� ������")
	public String writeFaq(Locale locale, Model model) {
		 return "/admin/board/writeFaq"; 
	}
	
	@RequestMapping(value = "/faq.mdo")
	@Description("���� ������")
	public String faq(Locale locale, Model model) {
		return "/admin/board/faq";
	}
	
	@RequestMapping(value = "/product.mdo")
	@Description("��ǰ ����(��ǰ ���) ������")
	public String product(Locale locale, Model model) {
		return "/admin/product/product";
	}
	
	@RequestMapping(value = "/insertProduct.mdo")
	@Description("��ǰ ��� ������")
	public String insertProduct(Locale locale, Model model) {
		return "/admin/product/insertProduct";
	}
	
	@RequestMapping(value = "/total.mdo")
	@Description("��� ������")
	public String stats(Locale locale, Model model) {
		return "/admin/total";
	}
	
}

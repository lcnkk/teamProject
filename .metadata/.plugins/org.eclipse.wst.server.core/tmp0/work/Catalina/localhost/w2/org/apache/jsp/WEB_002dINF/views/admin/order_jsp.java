/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-11-13 06:23:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/admin/base/header.jsp", Long.valueOf(1699856551291L));
    _jspx_dependants.put("jar:file:/C:/Users/hyeon/Desktop/weatherwear/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/weatherwear/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1683595747427L));
    _jspx_dependants.put("jar:file:/C:/Users/hyeon/Desktop/weatherwear/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/weatherwear/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/admin/base/footer.jsp", Long.valueOf(1699856551290L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>주문관리 페이지</title>\r\n");
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/admin/css/managerOrder.css\"> -->\r\n");
      out.write("<script src=\"resources/admin/js/jquery/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/admin/css/bootstrap/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sb-nav-fixed\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset='utf-8'>\r\n");
      out.write("<title>w2</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/admin/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"header\" style=\"overflow: hidden; height: 165px;\">\r\n");
      out.write("		<div class=\"headercontent\">\r\n");
      out.write("			<!-- gnb -->\r\n");
      out.write("			<nav id=\"gnb\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/stoke.mdo\">물류관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/order.mdo\">주문관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/deliverInfo.mdo\">배송관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/swap.mdo\">교환/환불</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/balance.mdo\">정산관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/couponUser.mdo\">쿠폰관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/client.mdo\">회원관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/notice.mdo\">공지/문의사항</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/product.mdo\">상품관리</a></li>\r\n");
      out.write("					<li><a class=\"dp1\" href=\"/w2/total.mdo\">통계</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("			<!-- gnb 끝 -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Topbar Navbar -->\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<!-- Nav Item - User Information -->\r\n");
      out.write("				<li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("				<a href=\"/w2/dashboard.mdo\">\r\n");
      out.write("					<img src=\"resources/image/admin/logo2.png\" width=\"150px\" style=\"margin: 50px 80px 10px 45px;\"/>\r\n");
      out.write("				</a>\r\n");
      out.write("				<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\" style=\"float:right; margin: 25px 100px 75px 20px;\"> \r\n");
      out.write("					<span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">관리자 계정</span>\r\n");
      out.write("						<img class=\"img-profile rounded-circle\"\r\n");
      out.write("						src=\"resources/image/admin/person_icon.png\" width=\"20px\">\r\n");
      out.write("				</a> \r\n");
      out.write("				\r\n");
      out.write("				<!-- Dropdown - User Information -->\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">정보수정</a>\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"/w2/login.mdo\">로그아웃</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 전체화면 버튼 -->\r\n");
      out.write("	<button class=\"btn btn-link btn-sm order-1 order-lg-0\" id=\"sidebarToggle\" href=\"#\">\r\n");
      out.write("		<i class=\"fas fa-bars\"></i>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<!-- Navbar-->\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<h1 class=\"mt-4\"></h1>\r\n");
      out.write("	</div>\r\n");
      out.write("	</main>\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("		<hr><hr><hr><br>\r\n");
      out.write("		<div class=\"select\" style=\"margin-top:50px;\">\r\n");
      out.write("		<hr>\r\n");
      out.write("		<label>조회기간</label> \r\n");
      out.write("		<input type=\"datetime-local\" name=\"startDate\"> ~ \r\n");
      out.write("		<input type=\"datetime-local\" name=\"endDate\"> \r\n");
      out.write("		<input type=\"submit\">\r\n");
      out.write("			<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("				<label for=\"orderStatusAll\"></label> \r\n");
      out.write("				<select id=\"orderStatusAll\" name=\"orderStatusAll\" size=\"1\">\r\n");
      out.write("					<option value=\"선택하세요\" selected>선택하세요.</option>\r\n");
      out.write("					<option value=\"주문완료\">주문완료</option>\r\n");
      out.write("					<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("					<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("					<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("					<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("					<option value=\"배송중\">배송중</option>\r\n");
      out.write("					<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("					<option value=\"교환중\">교환중</option>\r\n");
      out.write("					<option value=\"환불중\">환불중</option>\r\n");
      out.write("					<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("					<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				<input class=\"btn1\" type=\"button\" value=\"변경사항 저장\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"table-scroll\" class=\"table-scroll\">\r\n");
      out.write("		<div class=\"table-wrap\">\r\n");
      out.write("			<table class=\"table\">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>번호</th>\r\n");
      out.write("						<th>주문 번호</th>\r\n");
      out.write("						<th>회원 번호</th>\r\n");
      out.write("						<th>주문 날짜</th>\r\n");
      out.write("						<th>주문 상태</th>\r\n");
      out.write("						<th>주문 상품 및 수량</th>\r\n");
      out.write("						<th>총 금액</th>\r\n");
      out.write("						<th>적용된 쿠폰</th>\r\n");
      out.write("						<th>할인 금액</th>\r\n");
      out.write("						<th>결제 수단</th>\r\n");
      out.write("						<th>실 결제 금액</th>\r\n");
      out.write("						<th>연락처</th>\r\n");
      out.write("						\r\n");
      out.write("						<!-- <th class=\"fixed-side\">번호</th>\r\n");
      out.write("						<th class=\"fixed-top\">주문 번호</th>\r\n");
      out.write("						<th class=\"fixed-top\">회원 번호</th>\r\n");
      out.write("						<th class=\"fixed-top\">주문 날짜</th>\r\n");
      out.write("						<th class=\"fixed-top\">주문 상태</th>\r\n");
      out.write("						<th class=\"fixed-top\">주문 상품 및 수량</th>\r\n");
      out.write("						<th class=\"fixed-top\">총 금액</th>\r\n");
      out.write("						<th class=\"fixed-top\">적용된 쿠폰</th>\r\n");
      out.write("						<th class=\"fixed-top\">할인 금액</th>\r\n");
      out.write("						<th class=\"fixed-top\">결제 수단</th>\r\n");
      out.write("						<th class=\"fixed-top\">실 결제 금액</th>\r\n");
      out.write("						<th class=\"fixed-top\">연락처</th> -->\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">1</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> <select id=\"orderStatus\"\r\n");
      out.write("									name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">2</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> <select id=\"orderStatus\"\r\n");
      out.write("									name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">3</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> <select id=\"orderStatus\"\r\n");
      out.write("									name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">4</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> \r\n");
      out.write("								<select id=\"orderStatus\" name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">5</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> \r\n");
      out.write("								<select id=\"orderStatus\" name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"fixed-side\">\r\n");
      out.write("							<form method=\"POST\">\r\n");
      out.write("		      					<label><input type=\"checkbox\" name=\"checkProduct\" value=\"check\">6</label>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<form method=\"get\" action=\"SelectOrderStatusServlet\">\r\n");
      out.write("								<label for=\"orderStatus\"></label> \r\n");
      out.write("								<select id=\"orderStatus\" name=\"orderStatus\" size=\"1\">\r\n");
      out.write("									<option value=\"\">선택하세요.</option>\r\n");
      out.write("									<option value=\"주문완료\" selected>주문완료</option>\r\n");
      out.write("									<option value=\"상품준비중\">상품준비중</option>\r\n");
      out.write("									<option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("									<option value=\"배송보류\">배송보류</option>\r\n");
      out.write("									<option value=\"배송대기\">배송대기</option>\r\n");
      out.write("									<option value=\"배송중\">배송중</option>\r\n");
      out.write("									<option value=\"배송완료\">배송완료</option>\r\n");
      out.write("									<option value=\"교환중\">교환중</option>\r\n");
      out.write("									<option value=\"환불중\">환불중</option>\r\n");
      out.write("									<option value=\"교환완료\">교환완료</option>\r\n");
      out.write("									<option value=\"환불완료\">환불완료</option>\r\n");
      out.write("								</select> <br> <br>\r\n");
      out.write("							</form>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>Text</td>\r\n");
      out.write("						<td>010-0000-0000</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	<div id=\"footer\">\r\n");
      out.write("		<div class=\"content\">\r\n");
      out.write("			<!--// util menu -->\r\n");
      out.write("			<span class=\"addr\">\r\n");
      out.write("			<a href=\"mainIndex.do\" target = \"_blank\"><img src=\"resources/image/admin/footer_logo.png\" width=\"200px\" style=\"margin: 70px 80px 10px 45px;\"/></a>\r\n");
      out.write("			서울특별시 종로구 돈화문로 26, 4층(묘동, 단성사)</span> <span\r\n");
      out.write("				class=\"rep\">대표 : 2조</span> <span class=\"tel\">전화 :\r\n");
      out.write("				02-797-5036</span> <span class=\"rep\">사업자등록번호 : 111-1111-1111<br></span>\r\n");
      out.write("			<p class=\"copyright\" style=\"margin-left:350px;\">weatherWear® is a Registered Trademark of weatherWhere\r\n");
      out.write("				IP LLC. © 2023 weatherWhere IP LLC. All Rights Reserved.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/admin/base/header.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path");
      // /WEB-INF/views/admin/base/header.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/base/header.jsp(4,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/admin/order.jsp(28,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}

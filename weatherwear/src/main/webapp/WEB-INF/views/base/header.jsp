<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>

<meta charset="UTF-8">
<link href="resources/client/css/style.css" rel="stylesheet" />
</head>
<html>
<div id="container" >
        <p>
            <h5>[ div : container ]</h5>
            <img src="resources/image/logo.png" id="main_logo">
            <h5 id="top_menu"><a href="clientLogin.do">LOGIN</a> | <a href="clientJoin.do">JOIN</a> | <a href="clientCart.do">CART</a></h5>
        </p>
<header id="header">
	<h5>[ header : header ]</h5>
	<a href="mainIndex.do"><img src="resources/image/logo_pull.png" id="banner_logo"></a>

	<nav id="menubar">
		<!--<h5>[ nav : menubar ]</h5>-->
		<ul>
			<!-- 새 창으로 열기 target="_blank" -->
			<li><a href="productList.do?page=new">New</a></li>
			<!-- product_new -->
			<li><a href="productList.do?page=weather">Weather</a></li>
			<!-- product_weather -->
			<li><a href="productList.do?page=outer">Outer</a></li>
			<!-- product_outer -->
			<li><a href="productList.do?page=top">Top</a></li>
			<!-- product_top -->
			<li><a href="productList.do?page=dress">Dress</a></li>
			<!-- product_dress -->
			<li><a href="productList.do?page=pants">Pants</a></li>
			<!-- product_pants -->
			<li><a href="productList.do?page=skirts">Skirts</a></li>
			<!-- product_skirts -->
		</ul>
	</nav>
</header>
</html>
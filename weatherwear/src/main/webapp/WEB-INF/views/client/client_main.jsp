<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/client/css/style.css" rel="stylesheet" />
<title>mainIndex.jsp</title>
<!-- Style 태그는 head 태그 안에 있어야 합니다.-->
</head>
<body>


	<%@ include file="./base/header.jsp"%>
	
	<div class="main_image">
		<h5 class="main_image_text2" style="font-size: 20px">2023.11.10.금요일</h5>
		<img src="resources/image/sunny.gif" width="97.55%" height="300" alt="눈">
		<h1 class="main_image_text" style="font-size: 50px">1°C / 7°C</h1>
		<br> 
		<img class="weather_image" src="resources/image/brightness-high.svg"width="5%" height="45" alt="해">
	</div>
	<!-- -->
	<section id="weather">
		<article id="main">
			<h5>[ section : days ]</h5>

		</article>
		<article id="keyword">
			Best Keyword
			<ol type="1">
				<li>Keyword_1</li>
				<li>Keyword_2</li>
				<li>Keyword_3</li>
				<li>Keyword_4</li>
				<li>Keyword_5</li>
			</ol>
		</article>
	</section>
	 
	<section id="best">
		<article>
			<h5>[ section : best ]</h5>
           
			<ul class="product">
				<li><a href="showProductInfo.jsp"><img
						src="https://via.placeholder.com/130X180"></a></li>
				<li class="name"><a href="#">Item 01</a></li>
				<li class="price">10,000</li>
				<li class="review">리뷰 1건</li>
			</ul>

			<ul class="product">
				<li><a href="showProductInfo.jsp"><img
						src="https://via.placeholder.com/130X180"></a></li>
				<li class="name"><a href="#">Item 02</a></li>
				<li class="price">20,000</li>
				<li class="review">리뷰 2건</li>
			</ul>

			<ul class="product">
				<li><a href="showProductInfo.jsp"><img
						src="https://via.placeholder.com/130X180"></a></li>
				<li class="name"><a href="#">Item 03</a></li>
				<li class="price">30,000</li>
				<li class="review">리뷰 3건</li>
			</ul>

			<ul class="product">
				<li><a href="showProductInfo.jsp"><img
						src="https://via.placeholder.com/130X180"></a></li>
				<li class="name"><a href="#">Item 04</a></li>
				<li class="price">40,000</li>
				<li class="review">리뷰 4건</li>
			</ul>

			<ul class="product">
				<li><a href="showProductInfo.jsp"><img
						src="https://via.placeholder.com/130X180"></a></li>
				<li class="name"><a href="#">Item 05</a></li>
				<li class="price">50,000</li>
				<li class="review">리뷰 5건</li>
			</ul>
		</article>
	</section>
    <section id="middle">
        <section id="contents">
            <h5>[ section : contents ]</h5>
            <dl>
                <dd>- padding : 테두리와 글씨간의 여백</dd>
                <dd>- margin : 제목과 다른 요소 사이의 여백</dd>
                <dd>- letter-spacing : 행간 조정</dd>
                <dd>- text-align : 텍스트 정렬</dd>
                <dd>- text-justify : 정렬 시 공백 조정 [ auto | none | inter-word | distribute ]</dd>
                <dd>- text-indent : 텍스트 들여쓰기 [ 크기 | 백분율 ]</dd>
                <dd>- line-height : 줄 간격 조정 [ normal | 숫자 | 크기 | 백분율 | inherit ]</dd>
                <dd>- text-overflow : 넘치는 텍스트 [ clip | ellipsis ]</dd>
                <dd>- white-space : [ nowrap : 줄바꿈 안함 ] </dd>
                <dd>>>> hover에 overflow:visible; 작성 시 보여줄 수 있음</dd>
            </dl>
        </section>

        <aside id="side">
            <h5>[ aside : side ]</h5>
            - list 속성
            <ul>
                <li>list-style-position : inside<br>목록 들여쓰기</li>
            </ul>
            <dl>
                <dd>- background-attachment : [ scroll : 스크롤(기본값) | fixed : 배경 이미지 고정 ]</dd>
            </dl>
        </aside>
    </section>
          
<%@ include file="./base/footer.jsp" %>
</body>
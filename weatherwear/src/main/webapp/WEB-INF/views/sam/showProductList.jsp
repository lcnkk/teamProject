<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>코트</title>
<meta charset="UTF-8" />
<link href="/w2/resources/client/css/common.css" rel="stylesheet"/>
<style>
div.clearfixed::after {
	display: block;
	content: "";
	clear: both
}
a {
	text-decoration: none;
	color:black;
}
li {
	list-style:none;
}

.product {
 	width:19%;
 	float:left; 
 	list-style: none;	
 	margin-left:20px;
}
.product .name {
	width:270px;
	font-weight:bold;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

.menu {
	height:50px;
	line-height:50px;
	margin:50px;
	border-bottom:solid 1px;
}
.menu li {
	float:left;
	width:140px;
	position:relative;
}
.menu li div {
	width:500px;
	display:none;
	position:absolute;
}
.menu li:hover div {
	display:block;
}
.category a {
	margin:0 30px 0 0;
}

.title {
	font-size:30px;
	margin:70px 0 0 670px;
	line-height:30px;
}
.list li {
	position:relative;
	display:inline-block;
	width:150px;
	height:5px;
	text-align:center;
	float:right;
	margin:0 35px 30px 0;
	line-height:30px;
}
.list li div {
	display:none;
	position:absolute;
}
.list li:hover div {
	display:block;
	width:150px;
	background:white;
}
.order a {
	margin-left:10px;
	line-height:50px;
	
}

.price {
	padding:10px 0 10px 0;
}
.review {
	font-size:10px;
}

</style>
</head>
<body>
		<div>
			<ul class="menu">
				<li><a href="#">전체</a></li>
				<li><a href="#">아우터</a>
					<div class="category">
						<a href="#">패딩</a>
						<a href="#">코트</a>
						<a href="#">파카</a>
					</div>
				</li>
				<li><a href="#">상의</a>
					<div class="category">
						<a href="#">티셔츠</a>
						<a href="#">니트</a>
						<a href="#">셔츠</a>
					</div>
				</li>
				<li><a href="#">하의</a>
					<div class="category">
						<a href="#">진</a>
						<a href="#">와이드팬츠</a>
						<a href="#">슬랙스</a>
					</div>
				</li>
				<li><a href="#">원피스</a>
					<div class="category">
						<a href="#">서브1</a>
						<a href="#">서브2</a>
						<a href="#">서브3</a>
					</div>
				</li>
			</ul>
		</div>
	<div class="clearfixed"></div>
	<div>
		<h3 class="title">코트</h3>
	</div>
	<div class="clearfixed"></div>
	<div>
	<ul class="list">	
		<li>정렬
			<div class="order">
				<a href="#" style="margin-top:20px;">판매순</a><br>
				<a href="#">최신순</a><br>
				<a href="#">리뷰많은순</a><br>
				<a href="#">높은가격순</a><br>
				<a href="#">낮은가격순</a>
			</div>
		</li>
	</ul>
	</div>
	<div class="clearfixed"></div>
	<div class="products">
		<ul class="product">
			<li><a href="showProductInfo.jsp"><img src="https://via.placeholder.com/270x330"></a></li>
			<li class="name"><a href="#">막스마라 여자 코트 아이콘 마누엘라 카멜 1016163306001</a></li>
			<li class="price">00,000</li>
			<li class="review">리뷰 0건</li>
		</ul>
			
		<ul class="product">
			<li><a href="showProductInfo.jsp"><img src="https://via.placeholder.com/270x330"></a></li>
			<li class="name"><a href="#">상품명</a></li>
			<li class="price">00,000</li>
			<li class="review">리뷰 0건</li>
		</ul>

		<ul class="product">
			<li><a href="showProductInfo.jsp"><img src="https://via.placeholder.com/270x330"></a></li>
			<li class="name"><a href="#">상품명</a></li>
			<li class="price">00,000</li>
			<li class="review">리뷰 0건</li>
		</ul>
		
		<ul class="product">
			<li><a href="showProductInfo.jsp"><img src="https://via.placeholder.com/270x330"></a></li>
			<li class="name"><a href="#">상품명</a></li>
			<li class="price">00,000</li>
			<li class="review">리뷰 0건</li>
		</ul>
		
		<ul class="product">
			<li><a href="showProductInfo.jsp"><img src="https://via.placeholder.com/270x330"></a></li>
			<li class="name"><a href="#">상품명</a></li>
			<li class="price">00,000</li>
			<li class="review">리뷰 0건</li>
		</ul>
	</div>
</body>
</html>
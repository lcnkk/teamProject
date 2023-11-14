<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% // page import="com.w2.client.dao.CartDAO"%>
<% // page import="com.w2.client.dto.CartDTO"%>
<% //세션에서 수량정보 가져오기 -> 변경예정: DB에서 장바구니 정보 가져오기 %>
<%
	//CartDTO cart = new CartDTO();
	//CartDAO cartDao = //new CartDAO();
	//CartDTO updateCart = cartDto.updateCart(cart);	
	
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet" type="text/css"
	href="/web/resources/client/css/cartStructure.css">
</head>
<body>
<div id="product_content">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	
		//버튼으로 수량 변경
		$(document).ready(function() {
			var quantity = $(".quantity_input").val();
			$(".plus_btn").on("click", function() {
				//var quantity = $(".quantity_input").val();
				$(".quantity_input").val(++quantity);
			});
			$(".minus_btn").on("click", function() {
				//var quantity = $(".quantity_input").val();
				if (quantity > 1) {
					$(".quantity_input").val(--quantity);
				} else {
					alert("수량을 확인해주세요.");
				}
			});
		});
		
		//변경된 수량 저장
		/*
		$(document).ready(function() {
			$(".quantity_input").on("change", function() {
				var quantity = $(this).val();
				var productId = $(this).attr("proId");
				$.ajax({
					url : "/productCnt",
					type : "POST",
					data : {
						quantity : quantity,
						proId : proId
					},
					success : function(result) {
						alert("수량이 변경되었습니다.");
					},
					error : function(request, status, error) {
						alert("수량 변경에 실패하였습니다.");
					}
				});
			});
		});*/
		
	</script>
	<header>
		<section class="process">
			<h1>1장바구니</h1>
		</section>
		<section>
			<h6 class="grayText">
				<span>장바구니></span>주문결제>완료
			</h6>
		</section>
	</header>
		<h6 class="line">로그인 후 이용해주세요</h6>

		<div class="box1">광고 배너</div>

	<section class="main">

		<table border="1">
			
				<tr>
					<input class="hiddenType" id="checked tab" type="radio" name="tabs" checked>
					<label for="checked tab">일반 상품</label>
				</tr>
				<tr class="category">
					<th>전체 선택</th>
					<th>상품 정보</th>
					<th>판매가/혜택</th>
					<th>수량</th>
					<th>소계</th>
					<th>주문/저장</th>
					<th>배송 정보</th>
				</tr>
			
				
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				<tr class="products">
					<td>
						<form method="POST">
	      					<label><input type="checkbox" name="checkProduct" value="check">이미지</label>
						</form>	
					</td>
					<td>product_option
						<p>
							<input type="button" value="옵션변경">
					</td>
					<td>proPrice</td>
					<td>
						<div id="productCnt">
						<!-- form 태그로 수량 변경 추가- java로 보낼 정보 -->
							<form method="POST">
							<button class="minus_btn" type="button">-</button>
							<input type="text" name="quantity_input" size="2" class="quantity_input" value="1" style="text-align:center;">
							<button class="plus_btn" type="button">+</button>
							<p>
							</form>
						<!-- 수량 저장 -->
						<a href="proCntSave.jsp"><input type="submit" value="변경"></a>
							
						</div>
							
					</td>
					<td>----원</td>
					<td><br><input type="button" value="바로주문">
						<p>
							<input type="button" value="위시담기">&nbsp;&nbsp;<input type="button"
								value="삭제"></td>
					<td>--원
						<p>
							<input type="button" value="변경">
					</td>
				</tr>
				
				<!-- 데이터 받아올 때, 상품 수만큼 반복하기 위한 .
				<c:forEach var="cart" items="${carts}">
					<tr>
						<td>${cart.check}</td>
						<td>${cart.pmId}</td>
						<td>${cart.opId}</td>
						<td>${cart.proCnt}</td>
						<td>${cart.proSell}</td>
						<td>${cart.chooseCart}</td>
						<td>${cart.dPrice}</td>
					</tr>
				</c:forEach>
				 -->
		</table>
		<div class="wrap">
			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				선택한 상품&nbsp;&nbsp; 
				<input type="button" value="삭제하기" style="font-size: 1em;"> 
				<input class=btn type="button" value="계속 쇼핑하기" onclick="location.href='/web/resources/views/jsp/product.jsp'"> 
				<input class=btn type="button" value="위시리스트 담기"> 
				<input class=btn type="button" value="주문하기" onclick="location.href='/web/resources/views/jsp/orderStructure.jsp'" >
			</h3>
		</div>



	</section>
</div>
</body>
</html>
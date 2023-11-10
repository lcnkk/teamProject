<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>client_login.jsp</title>
<style>
      .client_login {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        text-align: left;
      }
      .client_login > form {
        display: flex;
        flex-direction: column;
      }
      input[type="text"],
      input[type="password"],
      input[type="email"],
      input[type="date"] {
        height: 30px;
        margin: 4px 0 14px 0;
        border: 1px solid #ccc;
        border-radius: 3px;
        -webkit-appearance: none;
      }
      input[type="submit"] {
        background: #333;
        color: #fff;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        font-size: 13px;
      }
</style>
</head>
<body>
	<%@ include file="../base/header.jsp"%>
	
	<div class="client_login">
		<h2>JoinUs</h2>
		<form action="#" method="POST">
			<label for="username">아이디</label> 
			<input type="text" id="username" name="username" required /> 
			<label for="password">비밀번호</label> 
			<input type="password" id="password" name="password" required /> 
			<label for="password-confirm">비밀번호 재확인</label> 
			<input type="password" id="password-confirm" name="password-confirm" required /> 
			<label for="name">이름</label> 
			<input type="text" id="name" name="name" required /> 
			<label for="birthdate">생년월일</label> 
			<input type="date" id="birthdate" name="birthdate" required /> 
			<label for="email">이메일</label>
			<input type="email" id="email" name="email" required /> 
			<label for="address">주소</label> 
			<input type="text" id="address" name="address" required /> 
			<input type="submit" value="가입하기" />
		</form>
	</div>
	
	
	<%@ include file="../base/footer.jsp" %>
</body>
</html>
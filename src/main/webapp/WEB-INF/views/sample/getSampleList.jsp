<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getSampleList.jsp</title>
</head>
<body>
	<h1>getSampleList.jsp</h1>
	<hr>
	<table>
		<tr>
			<th>Num</th><th>Title</th><th>Content</th>
		</tr>
		<!--  -->
	<c:forEach var="var" items="${sampleList}">
		<tr>
			<td>${ var.num }</td>
			<td><a href="getSample.do?num=${ var.num }">${ var.title }</a></td>
			<td>${ var.content }</td>
		</tr>
	</c:forEach>
		<tr>
			<td colspan="3"><a href="insertSample.do"><input type="submit" value="New"></a>
		</tr>
	</table>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.w2.sample.SampleVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getSample.jsp</title>
<script>
function test(){
	alert(document.getElementById("num").value);
}
</script>
</head>
<body>
	<h1>getSample.jsp</h1>
	<hr>
	<form action="updateSample.do" method="post" onsubmit="test()">
		<table>
			<tr>
				<th>Num</th><td>${ sample.num }</td>
				<input type="hidden" name="num" value="${sample.num }">
			</tr>
			<tr>
				<th>Title</th><td><input name="title" type="text" value="${ sample.title }"></td>
			</tr>
			<tr>
				<th>Content</th><td><input name="content" type="text" value="${ sample.content }"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="getSampleList.do">getSampleList.do</a><br>
	<a href="deleteSample.do?num=${ sample.num }">deleteSample.do</a><br>
	<a href="insertSample.do">insertSample.do</a>
</body>
</html>
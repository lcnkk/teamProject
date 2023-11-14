<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertSample.jsp</title>
</head>
<body>
	<h1>insertSample.jsp</h1>
	<hr>
	<form action="insertSample.do" method="post">
		<table>
			<tr>
				<th>Title</th><td><input name="title" type="text"></td>
			</tr>
			<tr>
				<th>Content</th><td><textarea name="content" rows="5" cols="10"></textarea>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
			</tr>
		</table>		
	</form>
	
	<a href="getSampleList.do">getSampleList.do</a>
</body>
</html>
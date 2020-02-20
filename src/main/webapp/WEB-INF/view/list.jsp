<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css"
	href="/resource/js/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<body>
	<form action="/list" method="post">
		从<input type="date" name="t1">&nbsp;&nbsp;&nbsp;&nbsp;
		到<input type="date" name="t2"> <br> 
		<select id="type1">
			<option>--请选择--</option>
			<option value="1">发布时间</option>
			<option value="2">作者</option>
			<option value="3">点击量</option>
		</select>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<br>
		<input type="submit" value="查询">
	</form>
	
	<table class="table table-dark">
		<tr>
			<td>编号</td>
			<td>文章标题</td>
			<td>发布日期</td>
			<td>作者</td>
			<td>点击量</td>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.aid }</td>
				<td>${s.title }</td>
				<td>${s.createTime }</td>
				<td>${s.author }</td>
				<td>${s.number }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
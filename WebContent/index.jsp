<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<%@ page trimDirectiveWhitespaces="true" %>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section{
		width: 1024px;
		height: 500px;
		text-align: center;
		margin: 0 auto;
	}
</style>
</head>
<body>
		<%@ include file="top.jsp" %>
		<section>
		<a href="list.do">회원리스트보기</a>
		</section>
		<%@ include file="bottom.jsp" %>
</body>
</html>
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
		padding-top : 20px;
	}
	table{
		margin : 0 auto;
		width : 500px;
	}
	table,tr,th,td {
		border: 1px double black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<%@ include file="../../../top.jsp" %>
	<section>
	<table>
			
				<a href="insert.do" id="add">[새 프로젝트 등록]</a>
			
			<tr>
				<th>프로젝트 이름</th>
				<th>시작날짜</th>
				<th>종료날짜</th>
				<th>상태</th>
			</tr>
			<c:forEach var="plist" items="${list }">
				<tr>
					
					<td><a href="read.do?no=${plist.no }">${plist.name }</a></td>
					<td><fmt:formatDate value="${plist.start_date }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
					<td><fmt:formatDate value="${plist.end_date }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
					<td>${plist.progress }</td>
				</tr>
			</c:forEach>
		</table>
		</section>
	<%@ include file="../../../bottom.jsp" %>	
</body>
</html>
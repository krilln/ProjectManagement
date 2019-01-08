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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function() {
		$("#delete").click(function() {
			var con_test = confirm("정말 삭제하시겠습니까?");
			if(con_test == true){
				location.href = "list.do";
			 return true;
			}
			else if(con_test == false){
			  return false;
			}
		})
	})
</script>
<style>
	table,tr,th,td {
		border: 1px double black;
		border-collapse: collapse;
	}
	table{
		margin : 0 auto;
		width : 500px;
	}
	section{
		width: 1024px;
		height: 500px;
		text-align: center;
		margin: 0 auto;
		padding-top : 20px;
	}
</style>
</head>
<body>
<%@ include file="../../../top.jsp" %>
<section>
	<table>
		<tr>
			<th>프로젝트 이름</th>
			<td>${proj.name }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${proj.content }</td>
		</tr>
		<tr>
			<th>시작날짜</th>
			<td><fmt:formatDate value="${proj.start_date }" pattern="yyyy-MM-dd" type="date" dateStyle="short"/></td>
		</tr>
		<tr>
			<th>종료날짜</th>
			<td><fmt:formatDate value="${proj.end_date }" pattern="yyyy-MM-dd" type="date" dateStyle="short"/></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${proj.progress }</td>
		</tr>
	</table>
	<p>
		<a href="list.do">목록</a>
		<a href="update.do?no=${proj.no }&name=${proj.name }&content=${proj.content }&start_date=<fmt:formatDate value='${proj.start_date }' pattern='yyyy-MM-dd' type='date' dateStyle='short'/>&end_date=<fmt:formatDate value='${proj.end_date }' pattern='yyyy-MM-dd' type='date' dateStyle='short'/>&progress=${proj.progress }">수정</a>
		<a href="delete.do?no=${proj.no }" id="delete">삭제</a>
	</p>
	</section>
	<%@ include file="../../../bottom.jsp" %>	
</body>
</html>
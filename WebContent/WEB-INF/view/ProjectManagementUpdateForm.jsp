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
	form {
		width: 500px;
		margin: 0 auto;
	}
	fieldset {
		padding-left: 20px;
	}
	label {
		display: block;
	}
	section{
		width: 1024px;
		height: 500px;
		margin: 0 auto;
		padding-top: 20px;
		
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function() {
		$("#update").click(function() {
			alert("수정 완료!");
			window.location.href = "list.do";
		})
	})
</script>
</head>
<body>
	<%@ include file="../../../top.jsp" %>
	<section>
<form action="update.do" method="post">
		<fieldset>
		<input type="hidden" name="no" value="${param.no }">
			<p>
				<label>프로젝트이름</label>
				<input type="text" name="name" value="${param.name }">
			</p>
			<p>
				<label>프로젝트내용</label>
				<textarea rows="10" cols="50" name="content">${param.content }</textarea>
			</p>
			<p>
				<label>시작날짜</label>
				<input type="text" name="start_date" value="${param.start_date }">
			</p>
			<p>
				<label>마감날짜</label>
				<input type="text" name="end_date" value="${param.end_date }">
			</p>
			<p>
				<select name="progress" value="${param.progress }">
					<option value="준비">준비</option>
					<option value="진행중">진행중</option>
					<option value="종료">종료</option>
					<option value="보류">보류</option>
				</select>
			</p>
			<p>
				<input type="submit" value="저장" id="update">
				<input type="reset" value="취소">
			</p>
		</fieldset>
	</form>
	<section>
	<%@ include file="../../../bottom.jsp" %>	
</body>
</html>
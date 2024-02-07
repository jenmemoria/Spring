<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<!-- TITLE  NOT NULL VARCHAR2(500)  
WRITER   NOT NULL VARCHAR2(100)  
CONTENTA NOT NULL VARCHAR2(4000) 
IMAGEA   NOT NULL VARCHAR2(4000) 
CONTENTB NOT NULL VARCHAR2(4000) 
IMAGEB   -->

<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="title" placeholder="제목"></p>
	<p><input type="text" name="writer" value="${login.userid }"></p>
	<p>
		<input type="file" name="uploadA" multiple required>
		<input type="text" name="contentA" placeholder="첫번째 질문">
	</p>
	<p>
		<input type="file" name="uploadB" multiple required>
		<input type="text" name="contentB" placeholder="두번째 질문">
	</p>
	<p><input type="submit" value="설문 등록"></p>
</form>
</body>
</html>
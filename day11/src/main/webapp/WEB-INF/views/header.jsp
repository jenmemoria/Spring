<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS</title>
</head>
<body>

<h1><a href="${cpath }">day15</a></h1>
<nav>
      <ul style="display: flex; padding: 0; list-style: none; justify-content: space-around;">
         <li><a href="${cpath }/product/list">회원목록</a></li>
         <li><a href="${cpath }/sales/list">게시판</a></li>
      </ul>
   </nav>


</body>
</html>